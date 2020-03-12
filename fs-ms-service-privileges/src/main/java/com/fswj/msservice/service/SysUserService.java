package com.fswj.msservice.service;

import com.fswj.msservice.domain.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fswj
 * @date 2020/3/12 下午7:57
 */
@FeignClient(name = "ms-service-auth")
public interface SysUserService {

    @RequestMapping("/user/getById/{id}")
    ResponseEntity<SysUser> getById(@PathVariable Long id);
}
