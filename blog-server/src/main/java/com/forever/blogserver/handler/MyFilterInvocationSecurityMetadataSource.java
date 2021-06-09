package com.forever.blogserver.handler;

import com.forever.blog.pojo.User;
import com.forever.blogserver.dao.RoleDao;
import com.forever.blogserver.dto.UrlRoleDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @ClassName MyFilterInvocationSecurityMetadataSource
 * @Author Lin
 * @Date 2021/6/6 14:42
 **/
@Slf4j
@Component
public class MyFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    /**
     * 接口角色列表
     */
    private static List<UrlRoleDTO> urlRoleList;

    @Autowired
    private RoleDao roleDao;


    /**
     * 加载接口角色信息
     */
    @PostConstruct
    private void loadDataSource() {
        urlRoleList = roleDao.urlRoleList();
    }


    /**
     * 清空接口角色信息
     */
    public void clearDataSource() {
        urlRoleList = null;
    }



    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        loadDataSource();
        log.info("[资源被访问：根据URL找到权限配置]: {}\n {}", object, urlRoleList);
        final HttpServletRequest request = ((FilterInvocation) object).getRequest();
        String uri = request.getRequestURI();
        String method = request.getMethod();
        HttpSession session = request.getSession();
        AntPathMatcher matcher = new AntPathMatcher();

        for (UrlRoleDTO urlRoleDTO : urlRoleList) {
            if (matcher.match(urlRoleDTO.getUrl(),uri) && method.toUpperCase().equals(urlRoleDTO.getRequestMethod())){
                return SecurityConfig.createList(urlRoleDTO.getRoleName());
            }
        }

        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
}
