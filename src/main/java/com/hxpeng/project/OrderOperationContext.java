package com.hxpeng.project;

import com.hxpeng.project.dto.OrderContextDTO;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/11 1:18
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
public class OrderOperationContext {

    private final static ThreadLocal<OrderContextDTO> context = new ThreadLocal<>();

    public static void setContext(OrderContextDTO orderContextDTO){
        context.set(orderContextDTO);
    }

    public static OrderContextDTO getContext(){
        return context.get();
    }

}
