package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka server!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class ProvideApplication 
{
    public static void main(String[] args )
    {
    	SpringApplication.run(ProvideApplication.class, args);
    }
}
