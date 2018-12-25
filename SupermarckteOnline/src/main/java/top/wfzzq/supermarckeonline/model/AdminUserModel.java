package top.wfzzq.supermarckeonline.model;

import top.wfzzq.supermarckeonline.base.BaseModel;
import top.wfzzq.supermarckeonline.entity.TbAdminUser;

public class AdminUserModel extends BaseModel{

    /**
     * 
     */
    private static final long serialVersionUID = 1149317441431042467L;
   
    private TbAdminUser user=new TbAdminUser();
    
    public AdminUserModel() {
        
    }
    public TbAdminUser getUser() {
        return user;
    }

    public void setUser(TbAdminUser user) {
        this.user = user;
    }
    
}
