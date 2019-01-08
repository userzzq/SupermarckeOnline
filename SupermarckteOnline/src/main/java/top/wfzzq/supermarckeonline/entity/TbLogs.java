package top.wfzzq.supermarckeonline.entity;

import java.util.Date;

import top.wfzzq.supermarckeonline.base.BaseModel;

public class TbLogs extends BaseModel{

    /**
     * 
     */
    private static final long serialVersionUID = -6553557723101098183L;
 
    
    private Integer lid;
    private  String operator;
    private String log;
    private String logtype;
    private Date lastupdate;
    private TbAdminUser adminUser;
    
    public TbLogs() {
        
    }
    

    public TbAdminUser getAdminUser() {
        return adminUser;
    }


    public void setAdminUser(TbAdminUser adminUser) {
        this.adminUser = adminUser;
    }


    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
    
}
