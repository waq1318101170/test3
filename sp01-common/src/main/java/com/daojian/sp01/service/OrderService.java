package com.daojian.sp01.service;

import com.daojian.sp01.pojo.Order;


public interface OrderService {
	
	Order getOrder(String orderId);
	void addOrder(Order order);

}
