package com.kapcb.framework.banner.banner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a>Title: KapcbBanner </a>
 * <a>Author: Kapcb <a>
 * <a>Description: KapcbBanner <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/28 21:43
 * @since 1.0
 */
public class KapcbBanner {

    public static void show(LogoBanner logoBanner, Description... descriptions) {
        String bannerShow = System.getProperty("kapcb.banner.show", "true");
        if (!Boolean.parseBoolean(bannerShow)) {
            return;
        }

        String bannerAnsiMode = System.getProperty("kapcb.show.ansi.mode", "true");
        if (!Boolean.parseBoolean(bannerAnsiMode)) {
            System.out.println(logoBanner.getBanner());
        } else {
            System.out.println(logoBanner.getPlainBanner());
        }

        List<Description> list = new ArrayList<>(Arrays.asList(descriptions));

        list.add(new Description("GitHub : ", "www.kapcb.github", 0, 1));

        System.out.println(DescriptionBanner.getBanner(list));
    }

}
