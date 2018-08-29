package com.yglink.otalk.common.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author zhangtusheng
 */
@Data
public class MenuVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
    private Integer id;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 菜单权限标识
     */
    private String permission;
    /**
     * 请求链接
     */
    private String url;
    /**
     * 请求方法
     */
    private String method;
    /**
     * 父菜单ID
     */
    private Integer parentId;
    /**
     * 图标
     */
    private String icon;
    /**
     * 一个路径
     */
    private String path;
    /**
     * VUE页面
     */
    private String component;
    /**
     * 排序值
     */
    private Integer sort;
    /**
     * 菜单类型 （0菜单 1按钮）
     */
    private String type;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 0--正常 1--删除
     */
    private String delFlag;


    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * menuId 相同则相同
     *
     * @param obj obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MenuVO) {
            Integer targetMenuId = ((MenuVO) obj).getId();
            return id.equals(targetMenuId);
        }
        return super.equals(obj);
    }
}

