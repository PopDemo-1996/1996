package cn.popdemo.service;

import cn.popdemo.pojo.Truck;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface Driver {
    //个人状态页面
        //显示当前驾驶员的状态
    public List<Driver>  SelectDriverDriverPop(Integer driverPop);
        //车牌号信息
    public List<Truck> SelectTruckTruckNumber(Integer truckNumber);
        //出车信息
    public List<Truck> SelectTruck();
        //出车详细信息
    public List<Truck> SelectTruckList();

    //个人信息页面
        //文件上传
        //驾驶员个人信息（ID、姓名、驾龄、年龄、性别）
        //驾驶员修改信息（姓名、年龄）

    //管理员对驾驶员的增删改查
        //添加驾驶员
    public List<Driver> InsertDriverList();
        //删除驾驶员
    public Integer Delete(Integer driverID);
        //修改驾驶员
    public Integer UpdateDriver();
        //查询驾驶员
    public List<Driver> SelectDriver();
        //根据ID查询驾驶员
    public Integer SelectByIdDriver(Integer driverID);
}
