package com.gary.order.persistence.impl;

import com.gary.order.domain.entity.Order;
import com.gary.order.persistence.OrderBuilder;
import com.gary.order.persistence.OrderDO;
import com.gary.order.types.Money;
import com.gary.order.types.ODate;
import com.gary.order.types.OId;
import com.gary.order.types.ONumber;
import com.gary.order.types.OStatus;
import com.gary.order.types.PayType;
import com.gary.order.types.UId;
import org.springframework.stereotype.Component;

@Component
public class OrderBuilderImpl implements OrderBuilder {
    public OrderDO fromOrder(Order order) {
        OrderDO orderDO = new OrderDO();
        if (order.getId() != null) {
            orderDO.setId(order.getId().getId());
        }
        orderDO.setOrderNo(order.getOrderNo().getValue());
        orderDO.setAmount(order.getAmount().getAmount());
        orderDO.setPayAt(order.getPayAt().getTime());
        orderDO.setStatus(order.getStatus().getValue());
        orderDO.setPayType(order.getPayType().getValue());
//        orderDO.preCreate(operator);
        return orderDO;
    }

    public Order toOrder(OrderDO orderDO) {
        Order order = new Order();
        order.setId(new OId(orderDO.getId()));
        order.setOrderNo(new ONumber(orderDO.getOrderNo()));
        order.setStatus(new OStatus(orderDO.getStatus()));
        order.setPayType(new PayType(orderDO.getPayType()));
        order.setAmount(new Money(orderDO.getAmount()));
        order.setCreateAt(new ODate(orderDO.getCreateAt()));
        order.setCreateBy(new UId(orderDO.getCreateBy()));
        order.setUpdateAt(new ODate(orderDO.getUpdateAt()));
        order.setUpdateBy(new UId(orderDO.getUpdateBy()));
        order.setPayAt(new ODate(orderDO.getPayAt()));
        return null;
    }
}
