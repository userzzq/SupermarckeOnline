package top.wfzzq.supermarckeonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfzzq.supermarckeonline.base.BaseAdminUserController;
import top.wfzzq.supermarckeonline.model.ConfigModel;
import top.wfzzq.supermarckeonline.service.TbConfigService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 
 * @author wanghui
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController extends BaseAdminUserController{
 @Autowired
 private TbConfigService tbconfigService;
 
 @RequestMapping("/queryTokenTimeout")
 public JsonMessage queryTokentimeout(ConfigModel model)throws Exception{
       return tbconfigService.queryConfig(model);
 }
 @RequestMapping("/updateTokenTimeout")
 public JsonMessage updatetokenTimeout(ConfigModel model) throws Exception{
     return tbconfigService.updateTokenTimeout(model);
 }
 @RequestMapping("/updateTitle")
 public JsonMessage updateTitle(ConfigModel model) throws Exception{
     return tbconfigService.updateTitle(model);
 }
 
}
