package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("unchecked")
@Service
public class OrderService {

	@Autowired
	RestTemplate restTemplate; 
	
	public List<String> getOrderByUserList() {
		return restTemplate.getForObject("http://service-provide/getUserList", List.class);
	}
	
}
