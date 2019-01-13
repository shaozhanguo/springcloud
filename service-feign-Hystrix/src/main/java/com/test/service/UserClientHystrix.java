package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserClientHystrix implements UserClient{

	@Override
	public List<String> getuserinfo() {
		throw new NullPointerException(" User getuserinfo() 服务不可用。。");
	}

}
