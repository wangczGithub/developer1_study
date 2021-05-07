package com.ck.configuration;

import com.ck.interceptor.MyInterceptor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description：
 * springboot拦截器的配置类：注册拦截器用的,实现springboot提供的WebMvcConfigurer
 * @Author：wangcz
 * @Date 2021年05月07日 9:16
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor1 myInterceptor1;

    // 重写注册拦截器的方法
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        registry.addInterceptor(myInterceptor1)
                .addPathPatterns("/*")// 指定拦截所有
                .excludePathPatterns("/**/*.js","/**/*.css","/**/*.jpg");// 指定不拦截的请求
        // 可以注册多个拦截器, 如：
        //registry。addInterceptors();
    }
}
