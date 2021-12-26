package com.kapcb.framework.banner.model;

import com.kapcb.framework.banner.enums.BannerModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.util.Objects;

/**
 * <a>Title: BannerDefinition </a>
 * <a>Author: Kapcb <a>
 * <a>Description: BannerDefinition <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 16:31
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BannerDefinition implements Banner {

    /**
     * banner's resource class
     */
    private Class<?> resourceClass;

    /**
     * banner location
     */
    private String resourceLocation;

    /**
     * default banner
     */
    private String defaultBanner;

    /**
     * final show banner
     */
    private String banner;

    /**
     * banner config model
     */
    private BannerModel bannerModel;

    public BannerDefinition(Class<?> resourceClass, String resourceLocation, String defaultBanner) {
        this.resourceClass = resourceClass;
        this.resourceLocation = resourceLocation;
        this.defaultBanner = defaultBanner;
    }

    @Override
    public InputStream prepareRender() {
        if (this.resourceLocation == null) {
            return null;
        }
        return this.resourceClass.getResourceAsStream(this.resourceLocation);
    }

    @Override
    public String getImplementationVersion() {
        if (this.resourceClass == null) {
            return null;
        }
        String implementationVersion = this.resourceClass.getPackage().getImplementationVersion();
        if (implementationVersion != null) {
            return implementationVersion;
        } else {
            return this.defaultBanner;
        }
    }

    @Override
    public void setResourceLocation(String location) {
        if (Objects.nonNull(location)) {
            this.resourceLocation = location;
        } else {
            this.resourceLocation = null;
        }
    }

}
