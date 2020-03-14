package com.fswj.msservice.config.security;

import com.fswj.msservice.domain.SysUser;
import com.fswj.msservice.service.SysUserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author fswj
 * @version : DefaultUserDetailService, v 0.1 2020/2/24 下午10:25 fswj Exp$
 */
@Service
public class DefaultUserDetailService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser byUsername = sysUserService.getByUsername(username);
        if (byUsername == null)
            throw new UsernameNotFoundException("用户不存在");
        return byUsername;
    }
}
