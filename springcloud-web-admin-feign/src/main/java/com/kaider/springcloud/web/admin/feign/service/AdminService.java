package com.kaider.springcloud.web.admin.feign.service;

import com.kaider.springcloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author： kaider
 * @Date：2019/12/10 14:54
 * @描述：服务消费者（FeignClient--> 里面存放的值必须为服务提供者里面对应编写的内容）
 */
@FeignClient(value = "springcloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("test1")
    String test1();

    /**
     * 依据服务提供的接口返回接口数据 GetMapping/PostMapping 里面的值 必须与服务提供者提供的接口名字一样
     *
     * @param message
     * @return
     */
    @GetMapping("say")
    String say1(@RequestParam("message") String message);

    /**
     * 此方法不可用因为参数不对 会报405错误
     *
     * @param message
     * @return
     */
    @GetMapping("say")
    String say2(String message);

    /**
     * 多参数模式
     *
     * @param message
     * @param title
     * @return
     */
    @GetMapping("sayParams")
    String sayParams(@RequestParam("message") String message, @RequestParam("title") String title);




}
