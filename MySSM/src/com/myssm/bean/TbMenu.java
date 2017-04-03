package com.myssm.bean;

import javax.persistence.*;

@Table(name = "tb_menu")
public class TbMenu {
    @Column(name = "menu_id")
    private String menuId;

    @Column(name = "pmenu_id")
    private String pmenuId;

    @Column(name = "menu_name")
    private String menuName;

    private String icon;

    private Integer morder;

    @Column(name = "module_id")
    private String moduleId;

    private String nodeflag;

    private String status;

    /**
     * @return menu_id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * @return pmenu_id
     */
    public String getPmenuId() {
        return pmenuId;
    }

    /**
     * @param pmenuId
     */
    public void setPmenuId(String pmenuId) {
        this.pmenuId = pmenuId;
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return morder
     */
    public Integer getMorder() {
        return morder;
    }

    /**
     * @param morder
     */
    public void setMorder(Integer morder) {
        this.morder = morder;
    }

    /**
     * @return module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return nodeflag
     */
    public String getNodeflag() {
        return nodeflag;
    }

    /**
     * @param nodeflag
     */
    public void setNodeflag(String nodeflag) {
        this.nodeflag = nodeflag;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}