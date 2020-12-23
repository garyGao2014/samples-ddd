package com.gary.order.domain.entity;

import com.gary.order.types.Money;
import com.gary.order.types.ODate;
import com.gary.order.types.OId;
import com.gary.order.types.ONumber;
import com.gary.order.types.OStatus;
import com.gary.order.types.PayType;
import com.gary.order.types.UserId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private OId id;
    private ONumber orderNo;
    private OStatus status;
    private Money amount;
    private ODate payAt;
    private PayType payType;
    private ODate createAt;
    private UserId createBy;
    private ODate updateAt;
    private UserId updateBy;

    public Order(ONumber orderNo, OStatus status, Money amount) {
        this.orderNo = orderNo;
        this.status = status;
        this.amount = amount;
    }
}
