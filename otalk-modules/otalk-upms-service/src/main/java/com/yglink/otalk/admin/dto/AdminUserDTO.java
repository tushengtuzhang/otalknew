package com.yglink.otalk.admin.dto;

import com.yglink.otalk.admin.entity.AdminUser;
import lombok.Data;

import java.util.List;

/**
 * @author zhangtusheng
 */
@Data
public class AdminUserDTO extends AdminUser {
    private List<Integer> roleIds;
}
