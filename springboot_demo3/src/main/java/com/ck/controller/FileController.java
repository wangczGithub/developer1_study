package com.ck.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Description：
 * springboot做文件上传和下载
 * @Author：wangcz
 * @Date 2021年05月08日 9:43
 */
@Controller
public class FileController {

    // 文件上传目录
    @Value("${upload.path}")
    private String uploadPath;

    @RequestMapping("upload")
    public String upload(MultipartFile file, ModelMap map){
        // 获取上传文件的文件名 1.jpg
        String filename = file.getOriginalFilename();
        // 使用uuid解决文件重名问题
        filename = filename.replace(
                filename.substring(0, filename.indexOf(".")),
                UUID.randomUUID().toString());
        // 上传到指定的本地目录：uploadPath
        try {
            file.transferTo(new File(uploadPath+filename));
            // 保存文件名到modelmap
            map.put("fileName", filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "show";
    }



}
