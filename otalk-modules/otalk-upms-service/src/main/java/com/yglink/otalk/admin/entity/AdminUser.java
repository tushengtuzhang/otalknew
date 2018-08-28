package com.yglink.otalk.admin.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.yglink.otalk.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author zhangtusheng
 */
@Data
@TableName("admin_user")
public class AdminUser extends BaseEntity<AdminUser> {

    private String userName;
    private String password;
    private String salt;

    @TableField(exist = false)
    private String noColumn;

}
