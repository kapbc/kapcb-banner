package com.kapcb.framework.banner.banner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <a>Title: Description </a>
 * <a>Author: Kapcb <a>
 * <a>Description: Description <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2021/12/28 21:29
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Description {

    private String name;

    private String description;

    private int leftCellPadding = 0;

    private int rightCellPadding = 1;

}
