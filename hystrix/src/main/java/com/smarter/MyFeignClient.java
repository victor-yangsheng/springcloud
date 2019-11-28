package com.smarter;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider")
public interface MyFeignClient {

    @GetMapping("/stu/port")
    public String getPort();

}
