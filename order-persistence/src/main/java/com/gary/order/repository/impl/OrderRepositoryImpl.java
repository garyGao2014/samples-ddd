package com.gary.order.repository.impl;

import com.gary.order.domain.entity.Order;
import com.gary.order.persistence.OrderBuilder;
import com.gary.order.persistence.OrderDO;
import com.gary.order.persistence.OrderMapper;
import com.gary.order.repository.OrderRepository;
import com.gary.order.types.OId;
import com.gary.order.types.ONumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private OrderMapper dao;

    @Autowired
    private OrderBuilder builder;

    public Order find(ONumber orderNo) throws Exception {
        return null;
    }

    public Order find(OId orderId) throws Exception {
        return null;
    }

    public Order save(Order order) throws Exception {
        OrderDO orderDO = builder.fromOrder(order);
        dao.insert(orderDO);
        return builder.toOrder(orderDO);
    }
}
