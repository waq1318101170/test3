package com.daojian.sp01.service;

import com.daojian.sp01.pojo.Order;
import com.daojian.sp01.pojo.User;

public interface UserService {
	
	User getUser(Integer id);
	void addScore(Integer id, Integer score);

}
