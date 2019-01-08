package top.wfzzq.supermarckeonline.service;

import top.wfzzq.supermarckeonline.model.ConfigModel;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 配置表服务
 * 
 * @author wanghui
 *
 */
public interface TbConfigService {
    /**
     * 修改token时间戳
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage updateTokenTimeout(ConfigModel model) throws Exception;

    /**
     * 查询配置
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage queryConfig(ConfigModel model) throws Exception;

    /**
     * 修改网站标题
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage updateTitle(ConfigModel model) throws Exception;

    /**
     * 查询前端配置
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage queryWebConfig(ConfigModel model) throws Exception;

}
