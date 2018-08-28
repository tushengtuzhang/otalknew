package com.yglink.otalk.admin.controller;

import com.yglink.otalk.admin.dto.AdminUserDTO;
import com.yglink.otalk.admin.entity.AdminUser;
import com.yglink.otalk.admin.service.AdminUserService;
import com.yglink.otalk.common.util.ReturnVO;
import com.yglink.otalk.common.web.BaseController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping("/adminUser")
public class AdminUserController extends BaseController {

    @Resource
    private AdminUserService adminUserService;

    @ResponseBody
    @GetMapping("/get")
    public ReturnVO<AdminUser> get(Integer id){
        AdminUser adminUser = adminUserService.selectById(id);
        return ReturnVO.OK(adminUser);
    }

    @ResponseBody
    @PostMapping("/save")
    public ReturnVO<AdminUser> save(@RequestBody(required = false) AdminUserDTO adminUserDTO){
        if(adminUserDTO==null){
            AdminUser adminUser=new AdminUser();
            adminUser.setUserName("zhangts");
            adminUser.setPassword("zts2018");
            adminUser.setSalt("123456");
            adminUser.setCreateTime(new Date());
            adminUser.setDelFlag(0);

            adminUserService.insertOrUpdate(adminUser);
        }else{

        }

        return ReturnVO.OK(null);
    }
}
