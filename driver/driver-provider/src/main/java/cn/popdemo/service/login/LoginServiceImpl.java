package cn.popdemo.service.login;


import cn.popdemo.dto.ReturnResult;
import cn.popdemo.service.driver.DriverService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component  //当我们的类不属于归类时，就可以用这个
@Service(interfaceClass = DriverService.class)
public class LoginServiceImpl implements LoginService {


    public ReturnResult login(String driverName, String driverPassword) throws Exception {
        return null;
    }
}
