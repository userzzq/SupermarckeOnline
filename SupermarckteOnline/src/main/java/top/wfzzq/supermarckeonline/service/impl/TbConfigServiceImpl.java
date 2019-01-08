package top.wfzzq.supermarckeonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.wfzzq.supermarckeonline.dao.TbConfigDAO;
import top.wfzzq.supermarckeonline.dao.TbLogsDAO;
import top.wfzzq.supermarckeonline.entity.TbLogs;
import top.wfzzq.supermarckeonline.model.ConfigModel;
import top.wfzzq.supermarckeonline.service.TbConfigService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

@Service
@Transactional(rollbackFor = Exception.class)
public class TbConfigServiceImpl implements TbConfigService {
    @Autowired
    private TbConfigDAO tbConfigDAO;
    @Autowired
    private TbLogsDAO TbLogsDAO;
    
    @Override
    public JsonMessage queryWebConfig(ConfigModel model) throws Exception {
      JsonMessage message = JsonMessage.getSuccess("");
      message.put("title", tbConfigDAO.queryTitle());
      return message;
    }
    
    @Override
    public JsonMessage queryConfig(ConfigModel model) throws Exception {
      JsonMessage message = JsonMessage.getSuccess("");
      message.put("tokenTimeout", tbConfigDAO.queryTokenTimeout());
      message.put("title", tbConfigDAO.queryTitle());
      return message;
    }

    @Override
    public JsonMessage updateTokenTimeout(ConfigModel model) throws Exception {
      int result = tbConfigDAO.updateTokenTimeout(model.getConfig());
      //添加日志信息
      TbLogs logs=new TbLogs();
      logs.setOperator(model.getTbAdminUser().getAuid().toString());
      logs.setLogtype("configmanage");
      logs.setLog(String.format("修改了:%s", model.getConfig()));
      TbLogsDAO.add(logs);
      return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
    }

    @Override
    public JsonMessage updateTitle(ConfigModel model) throws Exception {
      int result = tbConfigDAO.updateTitle(model.getConfig());
      //添加日志信息
      TbLogs logs=new TbLogs();
      logs.setOperator(model.getTbAdminUser().getAuid().toString());
      logs.setLogtype("configmanage");
      logs.setLog(String.format("修改了:%s", model.getConfig()));
      TbLogsDAO.add(logs);
      return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
    }

}
