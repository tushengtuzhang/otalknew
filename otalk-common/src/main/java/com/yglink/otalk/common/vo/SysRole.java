package com.yglink.otalk.common.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangtusheng
 */
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer roleId;
    private String roleName;
    private String roleCode;
    private String roleDesc;
    private Date createTime;
    private Date updateTime;
    private String delFlag;

}
