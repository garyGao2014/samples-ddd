package com.gary.order.persistence;

import com.gary.order.domain.entity.Order;

public interface OrderBuilder {
    OrderDO fromOrder(Order order);

    Order toOrder(OrderDO orderDO);
}
