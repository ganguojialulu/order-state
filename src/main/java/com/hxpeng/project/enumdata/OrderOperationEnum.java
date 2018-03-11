package com.hxpeng.project.enumdata;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/10 23:28
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
public enum  OrderOperationEnum {

    PAY("支付订单"),

    DELIVERY("订单发货"),

    RECEIVE("订单收货"),

    COMMENT("订单评价"),

    COMPLETE("订单完成"),

    REFUND("订单售后"),

    ;

    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    OrderOperationEnum(String operation) {
        this.operation = operation;
    }




}
