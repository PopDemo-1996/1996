package cn.popdemo.service;

import cn.popdemo.dto.ReturnResult;

public interface loginUserService {

    public ReturnResult login(String driverName,String driverPassword) throws Exception;
}
