package com.yglink.otalk.common.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangtusheng
 */
@EnableEurekaServer
@SpringBootApplication
public class OTalkEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(OTalkEurekaApplication.class, args);
    }
}
