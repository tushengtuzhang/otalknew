package com.yglink.otalk.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.yglink.otalk.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author zhangtusheng
 */
@TableName("admin_role")
@Data
public class AdminRole extends BaseEntity<AdminRole> {

    private String name;
    private String desc;

    private Integer companyId;

}
