package top.wfzzq.supermarckeonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfzzq.supermarckeonline.model.AdminUserModel;
import top.wfzzq.supermarckeonline.service.AdminUserService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 管理用户控制器
 * @author wanghui
 *
 */
@RestController
@RequestMapping("/admin/user")
public class AdminUserController {
  
    @Autowired
    private AdminUserService adminUserService;
    
    @RequestMapping("/login")
    public JsonMessage login(AdminUserModel model) throws Exception{
        return adminUserService.login(model);
    }
    @RequestMapping("/logout")
    public JsonMessage logout(AdminUserModel model) throws Exception{
        return adminUserService.logout(model);
    }
    @RequestMapping("/getUserInfo")
    public JsonMessage getUserInfo(AdminUserModel model) throws Exception{
        return adminUserService.getUserInfo(model);
    }
}
