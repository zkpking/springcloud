package com.kaider.srpingcloud.service.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： kaider
 * @Date：2019/12/10 14:23
 * @描述：对外提供的api接口
 */
@RestController
public class FirstController {


    /**
     * 不带参数的GET测试请求
     *
     * @return
     */
    @GetMapping("test1")
    public String test1() {
        return "1";
    }

    /**
     * 带参数的数据API
     *
     * @param message
     * @return
     */
    @GetMapping("say")
    public String say(String message) {
        return "i say:" + message;
    }

    /**
     * 多参数模式API
     * @param message
     * @param title
     * @return
     */
    @GetMapping("sayParams")
    public String say(String message, String title) {
        return "i say:" + message + "---->" + title;
    }


}
