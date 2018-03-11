package com.hxpeng.project.entity;

import lombok.Data;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/10 23:08
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */


@Data
public class OrderEntity {

    private Integer orderState;

    private Integer lockState;

}
