package cn.popdemo;

import java.io.Serializable;
import java.util.Date;

//实体类模板案例
public class DepartureCar implements Serializable {

    //出车ID
    private Integer  depID;
    //出车司机ID
    private Integer  depdriver;
    //出车车辆ID
    private Integer  deptruck;
    //出车货种
    private Integer  depgoodsType;
    //出车目的供应商
    private Integer  depsupID;
    //出车目的地
    private String  depsupaddress;
    //出车时间
    private Date  depOutdate;
    //预计回到时间
    private Date  depInputdate;

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public Integer getDepdriver() {
        return depdriver;
    }

    public void setDepdriver(Integer depdriver) {
        this.depdriver = depdriver;
    }

    public Integer getDeptruck() {
        return deptruck;
    }

    public void setDeptruck(Integer deptruck) {
        this.deptruck = deptruck;
    }

    public Integer getDepgoodsType() {
        return depgoodsType;
    }

    public void setDepgoodsType(Integer depgoodsType) {
        this.depgoodsType = depgoodsType;
    }

    public Integer getDepsupID() {
        return depsupID;
    }

    public void setDepsupID(Integer depsupID) {
        this.depsupID = depsupID;
    }

    public String getDepsupaddress() {
        return depsupaddress;
    }

    public void setDepsupaddress(String depsupaddress) {
        this.depsupaddress = depsupaddress;
    }

    public Date getDepOutdate() {
        return depOutdate;
    }

    public void setDepOutdate(Date depOutdate) {
        this.depOutdate = depOutdate;
    }

    public Date getDepInputdate() {
        return depInputdate;
    }

    public void setDepInputdate(Date depInputdate) {
        this.depInputdate = depInputdate;
    }
}
