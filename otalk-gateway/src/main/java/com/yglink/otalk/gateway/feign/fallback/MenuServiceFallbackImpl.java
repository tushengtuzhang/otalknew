
package com.yglink.otalk.gateway.feign.fallback;

import com.xiaoleilu.hutool.collection.CollUtil;
import com.yglink.otalk.common.vo.MenuVO;
import com.yglink.otalk.gateway.feign.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class MenuServiceFallbackImpl implements MenuService {
    @Override
    public Set<MenuVO> findMenuByRole(String role) {
        log.error("调用{}异常{}","findMenuByRole",role);
        return CollUtil.newHashSet();
    }
}
