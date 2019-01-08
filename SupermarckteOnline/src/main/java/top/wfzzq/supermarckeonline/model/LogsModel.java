package top.wfzzq.supermarckeonline.model;

import top.wfzzq.supermarckeonline.base.BasePageModel;
import top.wfzzq.supermarckeonline.entity.TbLogs;

public class LogsModel extends BasePageModel{

    /**
     * 
     */
    private static final long serialVersionUID = 7555471873754724290L;
  
    private TbLogs tbLogs=new TbLogs();
    
    public LogsModel() {
        
        
    }

    public TbLogs getTbLogs() {
        return tbLogs;
    }

    public void setTbLogs(TbLogs tbLogs) {
        this.tbLogs = tbLogs;
    }
    
}
