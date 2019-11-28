package com.smarter.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("ribbon")
    public String getPort(){
        return restTemplate.getForObject("http://provider/stu/port",String.class);
    }

}
