package com.yglink.otalk.admin.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.yglink.otalk.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author zhangtusheng
 */
@Data
@TableName("admin_menu")
public class AdminMenu extends BaseEntity<AdminMenu> {

    private Integer parentId;
    private String name;
    private String permission;
    private String icon;
    private Integer sort;
    private String url;
    /**
     * 菜单类型 （0菜单 1按钮）
     */
    private Integer type;

    private String component;
    private String path;


}
