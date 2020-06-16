package cn.popdemo.service.login;

import cn.popdemo.Driver;

import java.util.Map;

public interface LoginService {
    //驾驶员查询
    public Driver SelectDriverbyDriverNameAndDriverPassword(String driverName,String driverPasswoed) throws Exception;
}
