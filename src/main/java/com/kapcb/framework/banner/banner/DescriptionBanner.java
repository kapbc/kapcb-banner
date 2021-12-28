package com.kapcb.framework.banner.banner;

import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * <a>Title: DescriptionBanner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: DescriptionBanner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/28 21:37
 * @since 1.0
 */
public class DescriptionBanner {

    public static String getBanner(List<Description> descriptions) {
        if (CollectionUtils.isEmpty(descriptions)) {
            return null;
        }
        TableElement tableElement = new TableElement();
        for (Description description : descriptions) {
            tableElement.leftCellPadding(description.getLeftCellPadding())
                    .rightCellPadding(description.getRightCellPadding())
                    .row(description.getName(), description.getDescription());
        }
        return RenderUtil.render(tableElement);
    }

}
