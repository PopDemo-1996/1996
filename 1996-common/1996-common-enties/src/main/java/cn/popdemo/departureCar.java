/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * Y_PoP
 *
 * @author 帆哥哥
 * @create 2020/6/16
 * @since 1.0.0
 */
package cn.popdemo;

import java.io.Serializable;
import java.util.Date;

public class departureCar implements Serializable {
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
    private Date depOutdate;
    //预计回到时间
    private Date  depInputdate;
    //出车车牌号
    private String truckNumber;
    //出车司机
    private String driverName;
    //载货名称
    private String goodsName;
    //供应商名称
    private String supName;


    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

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
