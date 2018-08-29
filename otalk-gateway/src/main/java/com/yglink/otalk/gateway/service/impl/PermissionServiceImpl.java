package com.yglink.otalk.gateway.service.impl;

import com.yglink.otalk.gateway.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhangtusheng
 */
@Service
@Slf4j
public class PermissionServiceImpl implements PermissionService {
    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {

        Object principal = authentication.getPrincipal();
        List<SimpleGrantedAuthority> grantedAuthorityList=(List<SimpleGrantedAuthority>)authentication.getAuthorities();
        boolean hasPermission=false;

        if(principal!=null){
            if(CollectionUtils.isEmpty(grantedAuthorityList)){
                //Set<MenuVO> urls = new HashSet<>();
            }
        }

        return false;
    }
}
