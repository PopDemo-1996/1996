package cn.popdemo.service.login;


import cn.popdemo.Driver;
import cn.popdemo.mapper.LoginMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Component  //当我们的类不属于归类时，就可以用这个
@Service(interfaceClass = LoginService.class)
public class LoginServiceImpl implements LoginService {


    @Resource
    private LoginMapper loginMapper;


    public Driver SelectDriverbyDriverNameAndDriverPassword(String driverName,String driverPassword) throws Exception {
        Map<String,String> params  = new HashMap<String, String>();
        params.put("driverName","drivername");
        params.put("driverPassword","driverPwd");
        return loginMapper.SelectDriverbyDriverNameAndDriverPassword(params);
    }


}
