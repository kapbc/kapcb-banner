package com.kapcb.framework.banner.model;

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

    void setResourceLocation(String location);

    InputStream prepareRender();

}
