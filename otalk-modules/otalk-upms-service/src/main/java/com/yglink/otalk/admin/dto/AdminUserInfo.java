package com.yglink.otalk.admin.dto;

import com.yglink.otalk.admin.entity.AdminUser;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangtusheng
 */
@Data
public class AdminUserInfo implements Serializable {
    private AdminUser adminUser;
    private String[] permissions;
    private String[] roles;
}
