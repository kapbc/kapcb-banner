package com.kapcb.framework.banner;

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
        LogoBanner logoBanner = new LogoBanner(Test.class, "/kapcb-banner.txt", "Hello Kapcb!", 5, 21, new Color[]{Color.red, Color.yellow, Color.cyan, Color.magenta,Color.yellow}, false);
        String banner = logoBanner.getBanner();
        System.out.println( banner);
    }

}
