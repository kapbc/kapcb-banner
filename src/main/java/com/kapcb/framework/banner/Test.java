package com.kapcb.framework.banner;

import com.kapcb.framework.banner.banner.LogoBanner;
import com.taobao.text.Color;

/**
 * <a>Title: Test </a>
 * <a>Author: Kapcb <a>
 * <a>Description: Test <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/26 17:51
 * @since 1.0
 */
public class Test {

    public static void main(String... args) {
        LogoBanner logoBanner = new LogoBanner(Test.class, "/kapcb-banner.txt", "Hello Kapcb!", 5, 8, new Color[]{Color.red, Color.green, Color.yellow, Color.blue, Color.magenta}, false);
        String banner = logoBanner.getBanner();
        System.out.println(banner);
    }

}
