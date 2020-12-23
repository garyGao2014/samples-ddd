package com.gary.order.domain.service;

import com.gary.order.types.OId;
import com.gary.order.types.UserId;

public interface CreateOrderService {

    OId create(UserId userId);
}
