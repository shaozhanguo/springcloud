package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideController {

	@RequestMapping("/getUserList")
	public List<String> getUserList() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("zhangsan2");
		listUser.add("lisi2");
		listUser.add("yushengjun2");
		return listUser;
	}
	
}
