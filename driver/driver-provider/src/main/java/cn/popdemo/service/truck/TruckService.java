package cn.popdemo.service.truck;

import java.util.List;

public interface TruckService {
  //个人状态页面
    //车牌号信息
    public List<cn.popdemo.pojo.Truck> SelectTruckTruckNumber(Integer truckNumber) throws Exception;
    //出车信息
    public List<cn.popdemo.pojo.Truck> SelectTruck() throws Exception;
    //出车详细信息
    public List<cn.popdemo.pojo.Truck> SelectTruckList() throws Exception;
}
