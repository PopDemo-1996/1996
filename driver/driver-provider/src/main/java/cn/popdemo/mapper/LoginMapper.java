package cn.popdemo.mapper;


import cn.popdemo.dto.ReturnResult;
import cn.popdemo.service.driver.DriverService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    //通过名字和密码登录
    public ReturnResult login(String driverName, String driverPassword) throws Exception;

}
