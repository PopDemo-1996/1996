package cn.popdemo.pojo;

import java.io.Serializable;

//实体类模板案例
public class Driver implements Serializable {

    //驾驶员姓名
    private String  driverName;
    //驾驶员照片
    private String  driverFile;
    //驾驶员性别
    private String  driverSex;
    //驾驶员车龄
    private Integer  driverCarAge;
    //驾驶员年龄
    private Integer  driverAge;
    //驾驶员当前状态
    private Integer  driverPop;
    //驾驶员ID
    private Integer  driverID;
    //驾驶员密码
    private String  driverPassword;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverFile() {
        return driverFile;
    }

    public void setDriverFile(String driverFile) {
        this.driverFile = driverFile;
    }

    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    public Integer getDriverCarAge() {
        return driverCarAge;
    }

    public void setDriverCarAge(Integer driverCarAge) {
        this.driverCarAge = driverCarAge;
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public Integer getDriverPop() {
        return driverPop;
    }

    public void setDriverPop(Integer driverPop) {
        this.driverPop = driverPop;
    }

    public Integer getDriverID() {
        return driverID;
    }

    public void setDriverID(Integer driverID) {
        this.driverID = driverID;
    }

    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword;
    }
}
