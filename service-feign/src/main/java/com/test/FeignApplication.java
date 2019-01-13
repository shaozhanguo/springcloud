package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka server!
 *
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignApplication 
{
	@Bean	//加入bean容器中
	@LoadBalanced	//支持负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
    public static void main(String[] args )
    {
    	SpringApplication.run(FeignApplication.class, args);
    }
}
