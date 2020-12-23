package com.gary.order.application;

import com.gary.order.application.params.OrderCreateParams;
import com.gary.order.domain.entity.Order;

public interface OrderService {

    Order create(OrderCreateParams createParams) throws Exception;
}
