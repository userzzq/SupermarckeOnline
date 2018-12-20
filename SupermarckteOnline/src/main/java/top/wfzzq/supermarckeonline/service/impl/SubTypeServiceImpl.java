package top.wfzzq.supermarckeonline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import top.wfzzq.supermarckeonline.dao.TbSubTypeDAO;
import top.wfzzq.supermarckeonline.entity.TbSubType;
import top.wfzzq.supermarckeonline.entity.TbType;
import top.wfzzq.supermarckeonline.model.TbSubTypeModel;
import top.wfzzq.supermarckeonline.service.SubTypeService;
import top.wfzzq.supermarckeonline.utils.JsonMessage;
import top.wfzzq.supermarckeonline.utils.PageBean;

/**
 * 
 * @author wanghui
 *
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class SubTypeServiceImpl implements SubTypeService{
   @Autowired
  private TbSubTypeDAO tbSubTypeDAO;
  
   @Override
   public JsonMessage queryAll(TbSubTypeModel model) throws Exception {
       JsonMessage message = JsonMessage.getSuccess("");
       // 查询分类信息
       List<TbType> types = tbSubTypeDAO.queryTypes();
       message.put("types", types);
       // 查询小类信息
       PageBean page = model.getPage();
       PageHelper.startPage(page.getPageNumber(), page.getPageSize());
       Page<TbSubType> list = (Page<TbSubType>) tbSubTypeDAO.queryAll();
       message.put("page", page);
       message.put("list", list);
       return message;
   }

  @Override
public JsonMessage add(TbSubTypeModel model) throws Exception {
      int result = tbSubTypeDAO.add(model.getTbSubType());
      return result == 1 ? JsonMessage.getSuccess("添加成功") : JsonMessage.getFail("添加失败");
    }

    @Override
    public JsonMessage update(TbSubTypeModel model) throws Exception {
      int result = tbSubTypeDAO.update(model.getTbSubType());
      return result == 1 ? JsonMessage.getSuccess("修改成功") : JsonMessage.getFail("修改失败");
    }

    @Override
    public JsonMessage enable(TbSubTypeModel model) throws Exception {
      model.getTbSubType().setIsEnable("y");
      int result = tbSubTypeDAO.updateIsEnable(model.getTbSubType());
      return result == 1 ? JsonMessage.getSuccess("启用成功") : JsonMessage.getFail("启用失败");
    }

    @Override
    public JsonMessage disable(TbSubTypeModel model) throws Exception {
      model.getTbSubType().setIsEnable("n");
      int result = tbSubTypeDAO.updateIsEnable(model.getTbSubType());
      return result == 1 ? JsonMessage.getSuccess("禁用成功") : JsonMessage.getFail("禁用失败");
    }

  
  
}
