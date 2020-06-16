package com.gmall.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigCleintController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/configAction")
    public String configAction(){
        System.out.println(port);
        return port;
    }
}
