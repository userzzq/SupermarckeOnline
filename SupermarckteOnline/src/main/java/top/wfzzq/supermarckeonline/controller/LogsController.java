package top.wfzzq.supermarckeonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfzzq.supermarckeonline.base.BaseAdminUserController;
import top.wfzzq.supermarckeonline.model.LogsModel;
import top.wfzzq.supermarckeonline.service.LogsService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * TbLogs控制器
 * 
 * @author wanghui
 *
 */
@RestController
@RequestMapping("/logs")
public class LogsController extends BaseAdminUserController{
   @Autowired
   private LogsService logsService;
   
   @RequestMapping("/queryAll")
   public JsonMessage queryAll(LogsModel model) throws Exception{
       return logsService.queryAll(model);
   }
}
