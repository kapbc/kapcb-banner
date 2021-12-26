package com.kapcb.framework.banner;

/**
 * <a>Title: Banner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: Banner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 16:23
 * @since 1.0
 */
public interface Banner {

    /**
     * 初始化获取 Banner 文件
     */
    void initialize();

    /**
     * 获取加载进来的 Banner
     *
     * @return String
     */
    String getBanner();

    /**
     * 获取非 ANSI 模式的 Banner
     *
     * @return String
     */
    String getPlainBanner();

}
