package com.gary.order.persistence;

public interface OrderMapper {
    int insert(OrderDO orderDO);

    int update(OrderDO orderDO);

    OrderDO selectByOrderNo(String orderNo);

    OrderDO selectById(Long id);
}
