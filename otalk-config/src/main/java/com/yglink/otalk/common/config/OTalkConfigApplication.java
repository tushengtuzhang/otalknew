package com.yglink.otalk.common.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhangtusheng
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class OTalkConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(OTalkConfigApplication.class,args);
    }
}
