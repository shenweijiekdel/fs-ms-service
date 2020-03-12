package com.fswj.msservice.controller;

import com.fswj.msservice.domain.SysUser;
import com.fswj.msservice.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fswj
 * @date 2020/3/12 下午8:01
 */
@RequestMapping("/feign")
@RestController
public class TestController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/test")
    public ResponseEntity<SysUser> getById() {
        return  sysUserService.getById(1L);
    }
}
