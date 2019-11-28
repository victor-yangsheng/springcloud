package com.smarter;

import org.springframework.stereotype.Component;

@Component
public class FeignError implements MyFeignClient {
    @Override
    public String getPort() {
        return "服务器正在维护中";
    }
}
