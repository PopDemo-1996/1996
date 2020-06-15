package cn.popdemo.service.driver;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  //当我们的类不属于归类时，就可以用这个
@Service(interfaceClass = DriverService.class)
public class DriverServiceImpl implements DriverService {

    public List<DriverService> SelectDriverDriverPop(Integer driverPop) throws Exception {
        return null;
    }

    public List<DriverService> InsertDriverList() throws Exception {
        return null;
    }

    public Integer Delete(Integer driverID) throws Exception {
        return null;
    }

    public Integer UpdateDriver() throws Exception {
        return null;
    }

    public List<DriverService> SelectDriver() throws Exception {
        return null;
    }

    public Integer SelectByIdDriver(Integer driverID) throws Exception {
        return null;
    }
}
