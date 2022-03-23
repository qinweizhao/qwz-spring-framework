package com.qinweizhao.test.first.service.impl;

import com.qinweizhao.test.first.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
@Service
public class UserServiceImpl implements IUserService {

	public UserServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " 构造函数执行...");
	}


}
