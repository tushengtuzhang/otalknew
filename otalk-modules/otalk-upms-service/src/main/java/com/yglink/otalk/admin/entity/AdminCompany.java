package com.yglink.otalk.admin.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.yglink.otalk.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author zhangtusheng
 */
@TableName("admin_company")
@Data
public class AdminCompany extends BaseEntity<AdminCompany> {

    private String parentId;
    private String name;
    private String sort;

}
