package com.kaider.springcloud.web.admin.feign.controller;

import com.kaider.springcloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： kaider
 * @Date：2019/12/10 14:57
 * @描述：
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping("test1")
    public String test1(){
        return service.test1();
    }

    /**
     *
     * @param message
     * @return
     */
    @GetMapping("say1")
    public String say1(@RequestParam String message){
        return service.say1(message);
    }

    /**
     * 如果是get请求，可直接写参数
     * @param message
     * @return
     */
    @GetMapping("say2")
    public String say2(String message){
        return service.say1(message);
    }

    /**
     * 测试多参数
     * @param message
     * @param title
     * @return
     */
    @GetMapping("sayParams")
    public String sayParams(
            String message,
            String title
    ){
        return service.sayParams(message,title);
    }



}
