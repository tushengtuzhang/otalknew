package com.yglink.otalk.gateway.component.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.xiaoleilu.hutool.util.StrUtil;
import com.yglink.otalk.common.util.ReturnVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangtusheng
 * 演示环境控制
 */
@Slf4j
@RefreshScope
@Configuration
@ConditionalOnProperty(value = "security.validate.preview", havingValue = "true")
public class PreviewFilter extends ZuulFilter {
    private static final String TOKEN = "token";

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return Integer.MIN_VALUE;
    }

    @Override
    public boolean shouldFilter() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        if (StrUtil.equalsIgnoreCase(request.getMethod(), HttpMethod.GET.name()) ||
                StrUtil.containsIgnoreCase(request.getRequestURI(), TOKEN)){
            return false;
        }
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ReturnVO<String> result = new ReturnVO<>();
        result.setCode(479);
        result.setMsg("演示环境，没有权限操作");

        ctx.setResponseStatusCode(479);
        ctx.setSendZuulResponse(false);
        ctx.getResponse().setContentType("application/json;charset=UTF-8");
        ctx.setResponseBody(JSONObject.toJSONString(result));
        return null;
    }
}
