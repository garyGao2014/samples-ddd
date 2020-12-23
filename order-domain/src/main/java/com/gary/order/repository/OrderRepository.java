package com.gary.order.repository;

import com.gary.order.domain.entity.Order;
import com.gary.order.types.OId;
import com.gary.order.types.ONumber;

public interface OrderRepository {
    Order find(ONumber orderNo) throws Exception;
    Order find(OId orderId) throws Exception;
    Order save(Order order) throws Exception;
}
