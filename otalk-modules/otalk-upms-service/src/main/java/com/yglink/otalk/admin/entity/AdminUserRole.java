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
@TableName("admin_user_role")
@Data
public class AdminUserRole extends Model<AdminUserRole> {

    @TableId(type = IdType.INPUT)
    private Integer userId;

    @TableId(type = IdType.INPUT)
    private Integer roleId;

    @Override
    protected Serializable pkVal() {
        return userId;
    }
}
