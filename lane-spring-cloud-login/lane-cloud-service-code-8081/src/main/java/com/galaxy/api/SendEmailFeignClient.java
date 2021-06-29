package com.galaxy.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author lane
 * @date 2021年06月27日 下午3:35
 */
// @FeignClient表明当前类是一个Feign客户端，value指定该客户端要请求的服务名称（登记到注册中心上的服务提供者的服务名称）
@FeignClient(value = "lane-cloud-service-email",fallback = EmailFallback.class,path = "/email") //指定降级走的方法
public interface SendEmailFeignClient {
    @PostMapping("/{email}/{code}")
    public String sendEmail(@PathVariable("email") String email, @PathVariable("code") String code) throws Exception;
}
