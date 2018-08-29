package com.yglink.otalk.gateway.service.impl;

import com.netflix.zuul.context.RequestContext;
import com.yglink.otalk.gateway.service.LogSendService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpRequest;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangtusheng
 */
@Component
@Slf4j
public class LogSendServiceImpl implements LogSendService {

    private static final String SERVICE_ID="serviceId";

    @Resource
    private AmqpTemplate amqpTemplate;

    @Override
    public void send(RequestContext requestContext) {
        HttpServletRequest request=requestContext.getRequest();
        String requestURI = request.getRequestURI();
        String method=request.getMethod();

    }
}
