package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService; 
	
	@RequestMapping("/getOrderUserAll")
	public List<String> getOrderUserList(){
		return orderService.getOrderByUserList();
	}
	
}
