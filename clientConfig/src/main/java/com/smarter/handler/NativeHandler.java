package com.smarter.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeHandler {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String port(){
        return "port:"+port;
    }

}
