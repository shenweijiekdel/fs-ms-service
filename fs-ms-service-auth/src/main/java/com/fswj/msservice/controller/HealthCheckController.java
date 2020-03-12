package com.fswj.msservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fswj
 * @date 2020/3/12 下午10:28
 */
@RestController
public class HealthCheckController {
    @RequestMapping("/health")
    public String health(){
        return "hello";
    }
}
