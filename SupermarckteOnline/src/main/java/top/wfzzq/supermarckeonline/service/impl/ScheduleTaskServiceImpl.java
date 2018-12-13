package top.wfzzq.supermarckeonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.wfzzq.supermarckeonline.dao.TbTokenDAO;
import top.wfzzq.supermarckeonline.dao.TbTokenInfoDAO;
import top.wfzzq.supermarckeonline.service.ScheduleTaskService;

/**
 *
 * @author DarkKnight
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ScheduleTaskServiceImpl implements ScheduleTaskService {
  @Autowired
  private TbTokenDAO tbTokenDAO;
  @Autowired
  private TbTokenInfoDAO tbTokenInfoDAO;

  @Override
  public int deleteTokens() throws Exception {
    tbTokenInfoDAO.deleteTokenInfos();
    return tbTokenDAO.deleteTokens();
  }

}
