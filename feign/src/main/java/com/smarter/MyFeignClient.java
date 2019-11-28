package com.smarter;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface MyFeignClient {

    @GetMapping("/stu/port")
    public String getPort();

}
