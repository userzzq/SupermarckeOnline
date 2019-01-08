package top.wfzzq.supermarckeonline.base;

import top.wfzzq.supermarckeonline.aop.NeedAdminUser;
import top.wfzzq.supermarckeonline.entity.TbAdminUser;

public abstract class BaseAdminUserController implements NeedAdminUser {
    private TbAdminUser user;

    @Override
    public TbAdminUser getUser() {
        return user;
    }

    @Override
    public void setUser(TbAdminUser user) {
        this.user = user;
    }

}
