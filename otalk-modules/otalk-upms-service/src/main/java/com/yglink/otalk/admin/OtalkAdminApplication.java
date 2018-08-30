package com.yglink.otalk.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhangtusheng
 */
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.yglink.otalk.admin","com.yglink.otalk.common.bean"})
@EnableSwagger2
public class OtalkAdminApplication {
    public static void main(String[] args){
        SpringApplication.run(OtalkAdminApplication.class,args);
    }
}
