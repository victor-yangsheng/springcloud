package com.smarter.handler;

import com.smarter.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hystrix")
public class HystrixHandler {

    @Autowired
    private MyFeignClient myFeignClient;

    @GetMapping("/port")
    public String port(){
        return myFeignClient.getPort();
    }

}
