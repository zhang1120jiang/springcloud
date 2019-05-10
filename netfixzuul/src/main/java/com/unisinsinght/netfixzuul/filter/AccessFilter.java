package com.unisinsinght.netfixzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 进行请求路径的过滤
 */
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 进行过滤逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        // 对请求进行校验是否含有accessToken
        String accessToken = request.getParameter("accessToken");
        if(StringUtils.isBlank(accessToken)){
            // 设置过滤该请求，不对其进行路由
            currentContext.setSendZuulResponse(false);
            // 设置状态码为400
            currentContext.setResponseStatusCode(110);
        }
        return null;
    }
}
