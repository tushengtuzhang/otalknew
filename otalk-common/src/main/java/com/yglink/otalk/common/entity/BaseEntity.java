package com.yglink.otalk.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangtusheng
 */
@Data
public class BaseEntity <T extends Model> extends Model<T> {

    private Integer id;

    private Date createTime;
    private Date updateTime;
    private Date deleteTime;

    private Integer delFlag;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
