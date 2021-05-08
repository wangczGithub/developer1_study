package com.ck.confguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description：
 * 配置springmvc相关信息的配置类,实现接口WebMvcConfigurer
 * @Author：wangcz
 * @Date 2021年05月08日 10:40
 */
@Configuration
public class SpringMVConguration implements WebMvcConfigurer {

    // 注入带file协议的文件上传目录
    @Value("${upload.path.file}")
    private String uploadPath;

    // 做资源文件处理，将本地目录映射成指定的URL地址
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 将uploadPath这个本地目录映射到/images/**这个url地址上
        // 我们以后访问/images/**等价于访问uploadPath这个本地目录
        registry.addResourceHandler("/images/**")
                .addResourceLocations(uploadPath);
    }

    // 注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        //.....
    }
}
