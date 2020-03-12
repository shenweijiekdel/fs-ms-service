package com.fswj.msservice.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author fswj
 * @version : SysUser, v 0.1 2020/2/24 下午10:21 fswj Exp$
 */
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user")
@Data
@Accessors(chain = true)
public class SysUser extends BaseEntity implements UserDetails {
    private String username;
    private String password;

    @TableField(exist = false)
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
