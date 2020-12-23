package com.gary.order.application.impl;

import com.gary.order.application.OrderService;
import com.gary.order.application.params.OrderCreateParams;
import com.gary.order.domain.entity.Order;
import com.gary.order.repository.OrderRepository;
import com.gary.order.types.Money;
import com.gary.order.types.ONumber;
import com.gary.order.types.OStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order create(OrderCreateParams createParams) throws Exception {

        //锁定库存

        //计算金额
        Money amount = new Money(new BigDecimal(1.0));
        //生产订单编号
        ONumber oNumber = new ONumber(UUID.randomUUID().toString());

        Order order = new Order(oNumber, new OStatus("未付款"), amount);
        //创建订单
        order = orderRepository.save(order);

        //生成支付信息
        return order;
    }
}
