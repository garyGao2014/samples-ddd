package com.gary.order.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDO extends BaseDO {
    private Long id;
    private String orderNo;//订单编号
    private String status;//订单状态
    private BigDecimal amount;//订单金额
    private Date payAt;//支付时间
    private String payType;//支付方式
}
