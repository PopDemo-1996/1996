package cn.popdemo.service;

import cn.popdemo.Driver;
import cn.popdemo.dto.ReturnResult;
import cn.popdemo.dto.ReturnResultUtils;
import cn.popdemo.service.login.LoginService;
import cn.popdemo.utils.EmptyUtils;
import cn.popdemo.utils.RedisUtil;
import cn.popdemo.utils.TokenUtils;
import com.alibaba.dubbo.common.json.JSON;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LoginUserServiceImpl implements loginUserService {


    //调用提供者里面的方法
    @Reference
    private LoginService loginService;

    @Autowired
    private RedisUtil redisUtil;


    public ReturnResult login(String driverName,String driverPassword) throws Exception {
        ReturnResult returnResult = null;

        Driver driver = null;
        String token = null;
        //获取到提供者查询的值
        driver = loginService.SelectDriverbyDriverNameAndDriverPassword(driverName,driverPassword);

        //如果用户信息不为空的话
        if(driver != null){
            //如果验证成功
            String oldToken = redisUtil.getStr(String.valueOf(driver.getDriverID()));
            //删除旧的token
            if (EmptyUtils.isNotEmpty(oldToken)){
                redisUtil.del(oldToken);
                redisUtil.del(String.valueOf(driver.getDriverID()));
            }
            //产生新的Token
            token =  TokenUtils.createToken(String.valueOf(driver.getDriverID()),driver.getDriverName());
            //转换为json格式
            redisUtil.setStr(token, JSON.json(driver));
            //保存到redis中
            redisUtil.setStr(String.valueOf(driver.getDriverID()),token);
            Map<String,Object> result = new HashMap<String, Object>();
            result.put("token",token);
            returnResult = ReturnResultUtils.returnSuccess(result);

        }

        return returnResult;
    }
}
