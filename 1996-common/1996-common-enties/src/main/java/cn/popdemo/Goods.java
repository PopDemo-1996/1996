package cn.popdemo;

import java.io.Serializable;

//实体类模板案例
public class Goods implements Serializable {

    //货物ID
    private Integer  goodsID;
    //货物名称
    private String  goodsName;
    //货物种类
    private Integer  goodsType;
    //货物当前状态
    private Integer  goodsOpenType;
    //货物价格
    private String  goodsPrice;
    //货物提供者
    private Integer  goodsSupplier;
    //货物照片
    private String  goodsFile;

    public Integer getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(Integer goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsOpenType() {
        return goodsOpenType;
    }

    public void setGoodsOpenType(Integer goodsOpenType) {
        this.goodsOpenType = goodsOpenType;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsSupplier() {
        return goodsSupplier;
    }

    public void setGoodsSupplier(Integer goodsSupplier) {
        this.goodsSupplier = goodsSupplier;
    }

    public String getGoodsFile() {
        return goodsFile;
    }

    public void setGoodsFile(String goodsFile) {
        this.goodsFile = goodsFile;
    }
}
