package com.kapcb.framework.banner.banner;

import cn.hutool.core.util.StrUtil;
import com.kapcb.framework.common.constants.enums.StringPool;
import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;

import static com.taobao.text.ui.Element.label;

/**
 * <a>Title: LogoBanner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: LogoBanner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 17:06
 * @since 1.0
 */
public class LogoBanner extends AbstractBanner {

    /**
     * logo 元素总个数
     */
    private int elementCount;

    /**
     * logo 元素的单个占行数
     */
    private int elementLineCount;

    /**
     * logo 元素颜色组
     */
    private Color[] elementColors;

    /**
     * logo 字体是否发亮
     */
    private boolean boldOff;

    public LogoBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner, int elementCount, int elementLineCount, Color[] elementColors, boolean boldOff) {
        super(resourceClass, resourceLocation, defaultBanner);
        this.elementCount = elementCount;
        this.elementLineCount = elementLineCount;
        this.elementColors = elementColors;
        this.boldOff = boldOff;
        initialize();
    }

    @Override
    protected String generatorBanner(String bannerText) {
        if (bannerText != null) {
            StringBuilder bannerSb = new StringBuilder();
            String[] elementTexts = new String[this.elementCount];

            int i = 0, j = 0;

            for (String lineElement : StrUtil.split(bannerText, StringPool.BACK_SLASH_N.value())) {
                bannerSb.append(lineElement);
                bannerSb.append(StringPool.BACK_SLASH_N.value());

                if (i++ == this.elementLineCount - 1) {
                    elementTexts[j++] = bannerSb.toString();
                    i = 0;
                    bannerSb.setLength(0);
                }
            }

            LabelElement[] labelElement = new LabelElement[this.elementCount];

            for (int k = 0; k < this.elementCount; k++) {
                if (this.boldOff) {
                    labelElement[k] = label(elementTexts[k]).style(Decoration.bold_off.fg(elementColors[k]));
                } else {
                    labelElement[k] = label(elementTexts[k]).style(Decoration.bold.fg(elementColors[k]));
                }
            }

            TableElement tableElement = new TableElement();
            tableElement.row(labelElement);

            return RenderUtil.render(tableElement);
        }
        return this.banner.getDefaultBanner();
    }

}
