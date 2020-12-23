package com.gary.order.web;

import com.gary.order.application.OrderService;
import com.gary.order.application.params.OrderCreateParams;
import com.gary.order.domain.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("create")
    public Order create(OrderCreateParams params) throws Exception {
        return orderService.create(params);
    }
}
