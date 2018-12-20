package top.wfzzq.supermarckeonline.entity;

import top.wfzzq.supermarckeonline.base.BaseEntity;

/**
 * TbType表
 * 
 * @author wanghui
 *
 */
public class TbType extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer tid;
    private String typeName;
    private String typeInfo;
    private String isEnable;
    private String lastupdate;

    public TbType() {
    }

    public TbType(Integer tid,String typeName, String typeInfo, String isEnable, String lastupdate) {
        this.tid=tid;
        this.typeName = typeName;
        this.typeInfo = typeInfo;
        this.isEnable = isEnable;
        this.lastupdate = lastupdate;
    }
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

}
