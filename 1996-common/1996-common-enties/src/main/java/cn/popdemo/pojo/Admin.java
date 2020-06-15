package cn.popdemo.pojo;

import java.io.Serializable;

//实体类模板案例
public class Admin implements Serializable {

    //管理员ID
    private Integer  adminID;
    //管理员密码
    private String  adminPassword;
    //管理员类型
    private Integer  adminType;

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }
}
