package com.ck.configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description：
 * MP拦截器配置类
 * @Author：wangcz
 * @Date 2021年05月11日 9:45
 */
@Configuration
public class MPInterceptorConfiguratiom {

    // 编写方法将mp的拦截器(MybatisPlusInterceptor)注册成为bean组件
    @Bean
    public MybatisPlusInterceptor interceptor(){
        // 创建mp的拦截器
        MybatisPlusInterceptor interceptor =
                new MybatisPlusInterceptor();
        // 将分页拦截器(PaginationInnerInterceptor)添加到mp的拦截器中
        interceptor.addInnerInterceptor(
                new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }




}
