package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.UserClient;

@RestController
public class FeignController {

	@Autowired
	UserClient userClient;
	
	@RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
    public List<String> getuserinfo() {
        return userClient.getuserinfo();
    }
	
}
