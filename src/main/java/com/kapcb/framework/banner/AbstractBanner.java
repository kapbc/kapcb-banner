package com.kapcb.framework.banner;

import com.kapcb.framework.banner.model.Banner;
import com.kapcb.framework.banner.model.BannerDefinition;
import com.kapcb.framework.common.constants.enums.StringPool;
import com.taobao.text.util.RenderUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * <a>Title: AbstractBanner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: AbstractBanner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 16:30
 * @since 1.0
 */
@Slf4j
public abstract class AbstractBanner implements BannerRender {

    protected Banner banner;

    public AbstractBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner) {
        this.banner = new BannerDefinition(resourceClass, resourceLocation, defaultBanner);
    }

    @Override
    public void initialize() {
        String bannerText = null;
        try (InputStream inputStream = banner.prepareRender()) {
            if (inputStream != null) {
                bannerText = IOUtils.toString(inputStream, StringPool.CHARACTER_SET_UTF_8_LOWER.value());
            }
        } catch (IOException e) {
            log.error("initialize banner error, error message is : {}", e.getMessage());
        } finally {
            if (StringUtils.isNotBlank(bannerText)) {
                banner.setBanner(generatorBanner(bannerText));
            }
        }
    }

    /**
     * 生成 Banner
     *
     * @param bannerText String
     * @return String
     */
    protected abstract String generatorBanner(String bannerText);

    @Override
    public String getBanner() {
        return banner.getBanner();
    }

    @Override
    public String getPlainBanner() {
        return RenderUtil.ansiToPlainText(banner.getBanner());
    }

}
