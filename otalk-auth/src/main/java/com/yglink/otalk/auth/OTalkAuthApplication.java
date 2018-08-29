package com.yglink.otalk.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangtusheng
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.yglink.otalk.auth","com.yglink.otalk.common.bean"})
public class OTalkAuthApplication {
    public static void main(String[] args){
        SpringApplication.run(OTalkAuthApplication.class,args);
    }
}
