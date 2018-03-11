package com.hxpeng.project.dto;

import com.hxpeng.project.constant.OrderConstant;
import com.hxpeng.project.entity.OrderEntity;
import com.hxpeng.project.enumdata.OrderOperationEnum;
import com.hxpeng.project.enumdata.OrderStateEnum;
import lombok.Data;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/11 1:17
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */

@Data
public class OrderContextDTO {

    /**
     * 执行操作
     */
    private OrderOperationEnum orderOperationEnum;

    /**
     * 订单实体
     */
    private OrderEntity orderEntity;

    /**
     * 是否支付成功
     */
    private boolean paySuccess;

    /**
     * 是否被锁定
     */
    private boolean locked;


    public void setOrderEntity(OrderEntity orderEntity) {
        if (orderEntity.getOrderState() > OrderStateEnum.UN_PAY.getCode()){
            this.paySuccess = true;
        }
        if (orderEntity.getLockState().equals(OrderConstant.LOCK_YES)){
            this.locked = true;
        }
        this.orderEntity = orderEntity;
    }

}
