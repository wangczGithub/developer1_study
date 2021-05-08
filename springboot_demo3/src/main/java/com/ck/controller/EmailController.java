package com.ck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Description：
 *
 * @Author：wangcz
 * @Date 2021年05月08日 8:51
 */
@Controller
public class EmailController {

    // 直接注入JavaMailSenderImpl，该对象mail starter自动创建好了
    @Autowired
    private JavaMailSenderImpl sender;

    // 直接注入application.properties中spring.mail.username的值
    @Value("${spring.mail.username}")
    private String from;

    // 直接注入application.properties中myusename的值
    @Value("${myusename}")
    private String username;

    @RequestMapping("sendEmail")
    @ResponseBody
    public void sendEmail(){
        System.out.println("username=" + username);
        MimeMessage message = sender.createMimeMessage();
        try {
            MimeMessageHelper helper =
                    new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom(from);// 发件人
            helper.setTo("cheng_110204j@163.com");
            helper.setSubject("入职通知书");// offer
            helper.setText("请来入职", true);
            sender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
