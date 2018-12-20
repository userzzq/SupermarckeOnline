package top.wfzzq.supermarckeonline.model;


import top.wfzzq.supermarckeonline.base.BasePageModel;
import top.wfzzq.supermarckeonline.entity.TbSubType;

/**
 * 
 * @author wanghui
 *
 */
public class TbSubTypeModel extends BasePageModel{

    /**
     * 
     */
    private static final long serialVersionUID = 5895127015197781647L;
    
    private TbSubType tbSubType=new TbSubType();
     
    public TbSubTypeModel(){
        
    }

    public TbSubType getTbSubType() {
        return tbSubType;
    }

    public void setTbSubType(TbSubType tbSubType) {
        this.tbSubType = tbSubType;
    }
    
}
