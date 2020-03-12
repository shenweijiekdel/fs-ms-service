package com.fswj.msservice.controller;

import com.fswj.msservice.domain.SysUser;
import com.fswj.msservice.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fswj
 * @date 2020/3/12 下午7:53
 */
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/getById/{id}")
    public ResponseEntity<SysUser> getById(@PathVariable Long id) {
        SysUser byId = sysUserService.getById(id);
        return ResponseEntity.ok(byId);
    }
}
