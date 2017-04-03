package com.myssm.bean;

import javax.persistence.*;

@Table(name = "tb_dict")
public class TbDict {
    @Column(name = "group_code")
    private String groupCode;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "meta_val")
    private String metaVal;

    @Column(name = "meta_name")
    private String metaName;

    /**
     * @return group_code
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * @return group_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return meta_val
     */
    public String getMetaVal() {
        return metaVal;
    }

    /**
     * @param metaVal
     */
    public void setMetaVal(String metaVal) {
        this.metaVal = metaVal;
    }

    /**
     * @return meta_name
     */
    public String getMetaName() {
        return metaName;
    }

    /**
     * @param metaName
     */
    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }
}