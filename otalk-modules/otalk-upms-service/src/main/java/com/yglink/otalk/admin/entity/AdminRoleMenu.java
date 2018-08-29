package com.yglink.otalk.admin.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangtusheng
 */
@TableName("admin_role_menu")
@Data
public class AdminRoleMenu extends Model<AdminRoleMenu> {

    @TableId(type=IdType.INPUT)
    private Integer roleId;

    @TableId(type=IdType.INPUT)
    private Integer menuId;

    @Override
    protected Serializable pkVal() {
        return roleId;
    }
}
