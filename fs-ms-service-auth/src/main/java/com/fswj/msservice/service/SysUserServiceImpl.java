package com.fswj.msservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fswj.msservice.domain.SysUser;
import com.fswj.msservice.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
 * @author fswj
 * @version : SysUserServiceImpl, v 0.1 2020/2/25 下午9:36 fswj Exp$
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

    /**
     * 根据用户名查找
     * @param username
     * @return SysUser
     */
    @Override
    public SysUser getByUsername(String username) {
        return baseMapper.selectOne(new QueryWrapper<SysUser>().eq("username", username));
    }
}
