package cn.popdemo;

import java.io.Serializable;

//实体类模板案例
public class Supplier implements Serializable {

    //供应商ID
    private Integer  supID;
    //供应商名称
    private String  supName;
    //供应商供货类型（危货、普货）
    private Integer  supgoodsType;
    //供应商提供货物地址
    private String  supgoodsName;
    //供应商价格
    private String  supaddress;

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public Integer getSupgoodsType() {
        return supgoodsType;
    }

    public void setSupgoodsType(Integer supgoodsType) {
        this.supgoodsType = supgoodsType;
    }

    public String getSupgoodsName() {
        return supgoodsName;
    }

    public void setSupgoodsName(String supgoodsName) {
        this.supgoodsName = supgoodsName;
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress;
    }
}
