package com.kaider.springcloud.web.admin.feign.service.hystrix;

import com.kaider.springcloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author： kaider
 * @Date：2019/12/10 15:37
 * @描述：
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String test1() {
        return String.format("no fond !!!");
    }

    @Override
    public String say1(String message) {
        return String.format("no fond say1 message:%s", message);
    }

    @Override
    public String say2(String message) {
        return String.format("no fond say2 message:%s", message);
    }

    @Override
    public String sayParams(String message, String title) {
        return String.format("no fond message:%s, and title:%s", message, title);
    }
}
