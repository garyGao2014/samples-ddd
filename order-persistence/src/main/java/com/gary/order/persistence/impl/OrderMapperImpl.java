package com.gary.order.persistence.impl;

import com.gary.order.persistence.OrderDO;
import com.gary.order.persistence.OrderMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrderMapperImpl implements OrderMapper {
    public int insert(OrderDO orderDO) {
        return 0;
    }

    public int update(OrderDO orderDO) {
        return 0;
    }

    public OrderDO selectByOrderNo(String orderNo) {
        return null;
    }

    public OrderDO selectById(Long id) {
        return null;
    }
}
