package com.ck.confguration;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * Description：
 * springboot全局错误页面的配置类(以前配置在web.xml中，springboot没有web.xml)
 * ,实现ErrorPageRegistrar
 * @Author：wangcz
 * @Date 2021年05月08日 11:31
 */
@Configuration
public class ErrorPageConfiguration implements ErrorPageRegistrar {

    // 注册全局的错误页面
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        // 创建错误页面ErrorPage对象
        ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND, "/errorPage/404");// 404,必须以/开头
        ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/errorPage/500");// 500
        // 注册全局错误页面
        registry.addErrorPages(errorPage404,errorPage500);
    }
}
