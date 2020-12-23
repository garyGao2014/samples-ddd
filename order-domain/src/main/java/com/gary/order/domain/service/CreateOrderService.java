package com.gary.order.domain.service;

import com.gary.order.types.OId;
import com.gary.order.types.UId;

public interface CreateOrderService {

    OId create(UId userId);
}
