package top.wfzzq.supermarckeonline.service;

import top.wfzzq.supermarckeonline.model.TbTypeModel;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 
 * @author wanghui
 *
 */
public interface TypeService {
    /**
     * -查询全部
     * 
     * @param model 页面数据
     * @return 查询结果
     * @throws Exception 处理发生异常
     */
    JsonMessage queryAll(TbTypeModel model) throws Exception;

    /**
     * -添加
     * 
     * @param model 页面数据
     * @return 添加结果
     * @throws Exception 处理发生异常
     */
    JsonMessage add(TbTypeModel model) throws Exception;

    /**
     * -主键查询
     * 
     * @param model 页面数据
     * @return 主键查询结果
     * @throws Exception 处理发生异常
     */
    JsonMessage queryByKey(TbTypeModel model) throws Exception;

    /**
     * -删除
     * 
     * @param model页面数据
     * @return 删除结果
     * @throws Exception 处理发生异常
     */
    JsonMessage delete(TbTypeModel model) throws Exception;

    /**
     * -修改
     * @param model 页面数据
     * @return 修改结果
     * @throws Exception 处理发生异常
     */
    JsonMessage update(TbTypeModel model) throws Exception;
     
    /**
     * -不删除
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage undelete(TbTypeModel model) throws Exception;

}
