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
    
    private TbSubType subType = new TbSubType();

    public TbSubTypeModel() {
    }

    public TbSubType getSubType() {
      return subType;
    }

    public void setSubType(TbSubType subType) {
      this.subType = subType;
    }
}
