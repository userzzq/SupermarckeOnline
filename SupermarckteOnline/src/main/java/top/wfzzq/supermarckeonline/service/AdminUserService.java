package top.wfzzq.supermarckeonline.service;

import top.wfzzq.supermarckeonline.model.AdminUserModel;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

/**
 * 管理用户服务
 * 
 * @author wanghui
 *
 */
public interface AdminUserService {
    /**
     * -用户登录
     * 
     * @param model
     * @return
     * @throws Exception
     */
    JsonMessage login(AdminUserModel model) throws Exception;
     /**
      * 
      * @param model
      * @return
      * @throws Exception
      */
    JsonMessage logout(AdminUserModel model) throws Exception;
     /**
      * 
      * @param model
      * @return
      * @throws Exception
      */
    JsonMessage getUserInfo(AdminUserModel model) throws Exception;

}
