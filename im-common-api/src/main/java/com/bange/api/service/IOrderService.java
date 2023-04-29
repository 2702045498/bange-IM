package com.bange.api.service;

import com.bange.mall.entity.order.CommodityOrder;

public interface IOrderService extends  IBaseService<CommodityOrder>{
    int createOrder();
}
