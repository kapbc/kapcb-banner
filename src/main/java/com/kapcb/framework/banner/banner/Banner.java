package com.kapcb.framework.banner.banner;

import java.io.InputStream;

/**
 * <a>Title: Banner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: Banner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 16:39
 * @since 1.0
 */
public interface Banner {

    /**
     * get resource location
     *
     * @param location String
     */
    void setResourceLocation(String location);

    /**
     * prepare banner render
     *
     * @return InputStream
     */
    InputStream prepareRender();

    /**
     * get implementation version
     *
     * @return String
     */
    String getImplementationVersion();

    /**
     * set banner
     *
     * @param banner String
     */
    void setBanner(String banner);

    /**
     * get banner
     *
     * @return String
     */
    String getBanner();

    /**
     * get default banner
     *
     * @return String
     */
    String getDefaultBanner();

}
