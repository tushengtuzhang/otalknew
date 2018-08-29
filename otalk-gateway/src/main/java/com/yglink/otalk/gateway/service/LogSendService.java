package com.yglink.otalk.gateway.service;

import com.netflix.zuul.context.RequestContext;

/**
 * @author zhangtusheng
 */
public interface LogSendService {

    void send(RequestContext requestContext);
}
