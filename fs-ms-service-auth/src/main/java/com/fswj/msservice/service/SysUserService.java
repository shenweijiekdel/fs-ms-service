package com.fswj.msservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fswj.msservice.domain.SysUser;

/**
 * @author fswj
 * @version : SysUserService, v 0.1 2020/2/24 下午10:28 fswj Exp$
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getByUsername(String username);
}
