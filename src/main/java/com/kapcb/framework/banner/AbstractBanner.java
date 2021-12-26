package com.kapcb.framework.banner;

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
public abstract class AbstractBanner implements Banner{


    @Override
    public void initialize() {

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
