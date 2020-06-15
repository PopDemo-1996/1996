package cn.popdemo.service.login;

import cn.popdemo.dto.ReturnResult;

public interface LoginService {
    //通过名字和密码登录
    public ReturnResult login(String driverName, String driverPassword) throws Exception;

}
