package top.wfzzq.supermarckeonline.aop;

import top.wfzzq.supermarckeonline.entity.TbAdminUser;

/**
 * 需要登录的接口定义
 * 
 * @author wanghui
 *
 */
public interface NeedAdminUser {
    /**
     * - 设置登录用户接口定义
     * 
     * @param user
     */
    public void setUser(TbAdminUser user);

    /**
     * -获取登录用户信息
     * 
     * @return 登录用户登录
     */
    public TbAdminUser getUser();

}
