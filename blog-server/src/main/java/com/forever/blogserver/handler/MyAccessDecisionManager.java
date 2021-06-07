package com.forever.blogserver.handler;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName MyAccessDecisionManager
 * @Author Lin
 * @Date 2021/6/6 15:09
 **/
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {
    private final boolean supports = true;

    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
//        如果没有需要的权限信息的话直接放行
        if (configAttributes == null) return;

//        获取登录用户的权限信息
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
//            获取用户的登录信息
            String getAuthority = authority.getAuthority();
//            再获取需要的权限信息
            for (ConfigAttribute configAttribute : configAttributes) {
//                对比角色的权限和需要的权限是否一致，是则直接放行
                if (getAuthority.equals(configAttribute.getAttribute())) return;
            }
        }
        throw new AccessDeniedException("权限不足");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return supports;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return supports;
    }
}
