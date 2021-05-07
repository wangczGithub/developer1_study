package com.ck.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description：springboot开发拦截器，实现HandlerInterceptor接口
 * @Author：wangcz
 * @Date 2021年05月07日 9:08
 */
@Component
public class MyInterceptor1 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器拦截的请求："+ request.getServletPath());
        return true;
    }
}
