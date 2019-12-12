package com.kaider.springcloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author： kaider
 * @Date：2019/12/10 15:50
 * @描述：用于熔断器仪表盘查看用的配置
 */
@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet(){
        //自定义一个ServletBean
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        //用于手动注册一个ServletBean,ServletRegistrationBean：为spring提供的
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
