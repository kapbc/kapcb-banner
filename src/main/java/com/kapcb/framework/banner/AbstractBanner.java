package com.kapcb.framework.banner;

import com.kapcb.framework.banner.model.Banner;
import com.kapcb.framework.banner.model.BannerDefinition;
import com.kapcb.framework.common.constants.enums.StringPool;
import org.apache.commons.io.IOUtils;

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
public abstract class AbstractBanner implements BannerRender {

    protected Banner banner;

    @Override
    public void initialize() {
        String bannerText;
        try (InputStream inputStream = banner.prepareRender()) {
            bannerText = IOUtils.toString(inputStream, StringPool.CHARACTER_SET_UTF_8_LOWER.value());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBanner() {
        return null;
    }

    @Override
    public String getPlainBanner() {
        return null;
    }

}
