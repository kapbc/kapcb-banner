package com.kapcb.framework.banner;

/**
 * <a>Title: VersionBanner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: VersionBanner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 17:23
 * @since 1.0
 */
public class VersionBanner extends AbstractBanner {

    public VersionBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner) {
        super(resourceClass, resourceLocation, defaultBanner);
        initialize();
    }

    @Override
    protected String generatorBanner(String bannerText) {
        return bannerText == null ? banner.getImplementationVersion() : bannerText;
    }

}
