package com.hxpeng.project.enumdata;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/10 23:17
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
public enum  OrderStateEnum {

    CANCEL(0, "订单已取消"),

    UN_PAY(10, "等待买家支付"),

    UN_DELIVER(20, "等待商家发货"),

    UN_RECEIVE(30, "等待买家签收"),

    HAS_RECEIVED(40, "买家已收货"),

    COMPLETE(50, "订单已完成")
    ;

    private Integer code;

    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    OrderStateEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
