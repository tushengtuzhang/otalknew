package com.yglink.otalk.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yglink.otalk.admin.entity.AdminUser;
import com.yglink.otalk.admin.mapper.AdminUserMapper;
import com.yglink.otalk.admin.service.AdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
@Slf4j
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper,AdminUser> implements AdminUserService{

    @Resource
    private AdminUserMapper adminUserMapper;


}
