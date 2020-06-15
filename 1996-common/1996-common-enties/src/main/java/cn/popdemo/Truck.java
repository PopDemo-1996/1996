package cn.popdemo;

import java.io.Serializable;

//实体类模板案例
public class Truck implements Serializable {

    //货车ID
    private Integer  truckId;
    //货车状态
    private Integer  truckPop;
    //货车车牌号
    private String  truckNumber;
    //货车载货种（危货还是普货）
    private Integer  truckGoods;
    //货车名称
    private String  truckName;
    //货车照片
    private String  truckFile;

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getTruckPop() {
        return truckPop;
    }

    public void setTruckPop(Integer truckPop) {
        this.truckPop = truckPop;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public Integer getTruckGoods() {
        return truckGoods;
    }

    public void setTruckGoods(Integer truckGoods) {
        this.truckGoods = truckGoods;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public String getTruckFile() {
        return truckFile;
    }

    public void setTruckFile(String truckFile) {
        this.truckFile = truckFile;
    }
}
