package com.yglink.otalk.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.yglink.otalk.admin.dto.AdminUserDTO;
import com.yglink.otalk.admin.entity.AdminUser;
import com.yglink.otalk.admin.service.AdminUserService;
import com.yglink.otalk.common.util.ReturnVO;
import com.yglink.otalk.common.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping("/adminUser")
//@EnableSwagger2
@Api(value = "用户管理",description = "用户管理",tags = {"用户管理"})
public class AdminUserController extends BaseController {

    @Resource
    private AdminUserService adminUserService;

    @ResponseBody
    @GetMapping("/get")
    @ApiOperation(value = "ID查询")
    public ReturnVO get(Integer id){
        AdminUser adminUser = adminUserService.selectById(id);
        return ReturnVO.OK(adminUser);
    }

    @ResponseBody
    @PostMapping("/save")
    public ReturnVO save(@RequestBody(required = false) AdminUserDTO adminUserDTO){
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

    @GetMapping("list")
    @ResponseBody
    public ReturnVO list(@RequestBody(required = false) Page page){
        if(page==null){
            page=new Page();
            page.setCurrent(1);
            page.setSize(15);

            page=adminUserService.selectPage(page);
        }
        return ReturnVO.OK(page);
    }
}
