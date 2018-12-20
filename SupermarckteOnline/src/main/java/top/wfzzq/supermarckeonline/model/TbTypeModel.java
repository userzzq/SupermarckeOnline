package top.wfzzq.supermarckeonline.model;

import top.wfzzq.supermarckeonline.base.BasePageModel;
/**
 * TbType模型层
 * @author wanghui
 *
 */
import top.wfzzq.supermarckeonline.entity.TbType;
public class TbTypeModel extends BasePageModel{

    /**
     * 
     */
    private static final long serialVersionUID = -2241756600456143940L;
   
    private TbType tbType=new TbType();
    public TbTypeModel() {
        
    }
    public TbType getTbType() {
        return tbType;
    }
    public void setTbType(TbType tbType) {
        this.tbType = tbType;
    }

    
}
