package com.hxpeng.project;

import com.hxpeng.project.dto.OrderContextDTO;
import com.hxpeng.project.entity.OrderEntity;
import com.hxpeng.project.enumdata.OrderOperationEnum;
import com.hxpeng.project.enumdata.OrderStateEnum;
import com.hxpeng.project.operation.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.ORB;

/**
 * Description TODO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/3/10 23:13
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
public class OrderOperationExecutor {
    public static void init(OperationParams operationParams){
        // 查询订单等等操作
        OrderEntity orderEntity = new OrderEntity();
        OrderContextDTO orderContextDTO = new OrderContextDTO();
        orderContextDTO.setOrderEntity(orderEntity);
        OrderOperationContext.setContext(orderContextDTO);
    }


    public static boolean operation(){
        AbstractOrderOperation abstractOrderOperation;
        OrderOperationEnum orderOperationEnum = OrderOperationContext.getContext().getOrderOperationEnum();
        switch (orderOperationEnum){
            case PAY:
                // 订单支付
                abstractOrderOperation = new PayOperation();
                break;

            case DELIVERY:
                // 订单发货
                abstractOrderOperation = new DeliveryOperation();
                break;

            case RECEIVE:
                // 订单收货
                abstractOrderOperation = new ReceiveOperation();
                break;

            case COMMENT:
                // 订单评价
                abstractOrderOperation = new CommentOperation();
                break;

            case COMPLETE:
                // 订单完成
                abstractOrderOperation = new CompleteOperation();
                break;

            case REFUND:
                // 订单申请售后
                abstractOrderOperation = new RefundOperation();
                break;

            default:
                // 无效的订单操作
                throw new RuntimeException();
        }
        return abstractOrderOperation.operation();
    }







}
