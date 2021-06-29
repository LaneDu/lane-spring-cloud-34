package com.galaxy.api;

import org.springframework.stereotype.Component;

/**
 * 降级回退逻辑需要定义一个类，实现FeignClient接口，实现接口中的方法
 * @author lane
 * @date 2021年06月24日 下午6:02
 */
@Component
public class EmailFallback implements SendEmailFeignClient {


    @Override
    public String sendEmail(String email, String code) throws Exception {
        return "fail";
    }
}
