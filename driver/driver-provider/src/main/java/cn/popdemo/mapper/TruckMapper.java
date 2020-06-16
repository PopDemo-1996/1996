package cn.popdemo.mapper;


import cn.popdemo.Truck;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TruckMapper {

    //个人状态页面
    //车牌号信息
    public List<Truck> SelectTruckTruckNumber(Integer truckNumber) throws Exception;
    //出车信息
    public List<Truck> SelectTruck() throws Exception;
    //出车详细信息
    public List<Truck> SelectTruckList() throws Exception;

}
