package top.wfzzq.supermarckeonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.wfzzq.supermarckeonline.config.MyConfig;
import top.wfzzq.supermarckeonline.converter.DateConverter;
import top.wfzzq.supermarckeonline.dao.UtilsDAO;
import top.wfzzq.supermarckeonline.service.IndexService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 *
 * @author DarkKnight
 *
 */
@Service
public class IndexServiceImpl implements IndexService {
  @Autowired
  private MyConfig myConfig;
  @Autowired
  private UtilsDAO utilsDAO;

  @Override
  public JsonMessage index() throws Exception {
    JsonMessage message = JsonMessage.getSuccess(String.format("欢迎使用%s，%s", myConfig.appName, DateConverter.SDF_LONG.format(utilsDAO.queryTime())));
    return message;
  }

}
