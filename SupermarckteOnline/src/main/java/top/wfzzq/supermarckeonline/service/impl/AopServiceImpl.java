package top.wfzzq.supermarckeonline.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.wfzzq.supermarckeonline.dao.TbAdminUserDAO;
import top.wfzzq.supermarckeonline.dao.TbTokenDAO;
import top.wfzzq.supermarckeonline.entity.TbAdminUser;
import top.wfzzq.supermarckeonline.entity.TbToken;
import top.wfzzq.supermarckeonline.entity.TbTokenInfo;
import top.wfzzq.supermarckeonline.service.AopService;
import top.wfzzq.supermarckeonline.utils.MyUtils;

/**
 *
 * @author DarkKnight
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AopServiceImpl implements AopService {
    @Autowired
    private TbTokenDAO tbTokenDAO;
    @Autowired
    private TbAdminUserDAO tbAdminUserDAO;

    /**
     * makeNewToken-创建一个新的token
     *
     * @return
     * @throws Exception
     */
    private TbToken makeNewToken() throws Exception {
        // 通过uuid生成随机的token
        String t = UUID.randomUUID().toString();
        TbToken stoken = new TbToken();
        stoken.setToken(t);
        // 保存到数据库
        tbTokenDAO.addToken(stoken);
        return stoken;
    }

    @Override
    public TbToken createOrUpdateToken(TbToken token) throws Exception {
        // 传入的token信息不存在就返回新的
        if (token == null || MyUtils.isEmpty(token.getToken())) {
            return makeNewToken();
        }
        // 数据库校验token信息，不存在就返回新的
        TbToken stoken = tbTokenDAO.queryToken(token);
        if (stoken == null) {
            return makeNewToken();
        }
        // 存在就更新
        tbTokenDAO.updateToken(stoken);
        return stoken;
    }

    @Override
    public TbAdminUser checkAdminUser(TbToken token) throws Exception {
        if (token == null) {
            return null;
        }
        // 查询登录用户信息
        TbTokenInfo tokenInfo = new TbTokenInfo();
        tokenInfo.setToken(token.getToken());
        TbAdminUser user = tbAdminUserDAO.queryTokenUser(tokenInfo);
        return user;
    }
}
