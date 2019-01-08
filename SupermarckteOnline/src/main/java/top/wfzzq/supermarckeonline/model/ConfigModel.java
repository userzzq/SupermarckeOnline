package top.wfzzq.supermarckeonline.model;

import top.wfzzq.supermarckeonline.base.BaseModel;
import top.wfzzq.supermarckeonline.entity.TbConfig;

public class ConfigModel extends BaseModel{

    /**
     * 
     */
    private static final long serialVersionUID = 3454297376670215952L;
   
    /**
     * 
     */
    private TbConfig config=new TbConfig();
    
    public ConfigModel() {
        
    }

    public TbConfig getConfig() {
        return config;
    }

    public void setConfig(TbConfig config) {
        this.config = config;
    }
    
}
