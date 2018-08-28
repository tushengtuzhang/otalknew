package com.yglink.otalk.common.web;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangtusheng
 */
public class BaseController {

    @Autowired
    private HttpServletRequest httpServletRequest;
    protected org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());



}
