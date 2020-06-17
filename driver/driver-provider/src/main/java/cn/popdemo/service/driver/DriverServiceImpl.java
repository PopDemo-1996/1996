package cn.popdemo.service.driver;

import cn.popdemo.mapper.DriverMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component  //当我们的类不属于归类时，就可以用这个
@Service(interfaceClass = DriverService.class)
public class DriverServiceImpl implements DriverService {

    @Resource
    private DriverMapper driverMapper;
    //显示当前驾驶员的状态
    public List<DriverService> SelectDriverDriverPop(Integer driverPop) throws Exception {
        return driverMapper.SelectDriverDriverPop(driverPop);
    }
    //添加驾驶员
    public List<DriverService> InsertDriverList() throws Exception {
        return driverMapper.InsertDriverList();
    }
    //删除驾驶员
    public Integer Delete(Integer driverID) throws Exception {
        return driverMapper.Delete(driverID);
    }
    //修改驾驶员
    public Integer UpdateDriver() throws Exception {
        return driverMapper.UpdateDriver();
    }
    //全查驾驶员
    public List<DriverService> SelectDriver() throws Exception {
        return driverMapper.SelectDriver();
    }
    //根据ID查询驾驶员
    public Integer SelectByIdDriver(Integer driverID) throws Exception {
        return driverMapper.SelectByIdDriver(driverID);
    }
}
