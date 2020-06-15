package cn.popdemo.service.driver;


import java.util.List;

public interface DriverService {
    //个人状态页面
        //显示当前驾驶员的状态
    public List<DriverService>  SelectDriverDriverPop(Integer driverPop) throws Exception;

    //个人信息页面
        //文件上传
        //驾驶员个人信息（ID、姓名、驾龄、年龄、性别）
        //驾驶员修改信息（姓名、年龄）

    //管理员对驾驶员的增删改查
        //添加驾驶员
    public List<DriverService> InsertDriverList() throws Exception;
        //删除驾驶员
    public Integer Delete(Integer driverID) throws Exception;
        //修改驾驶员
    public Integer UpdateDriver() throws Exception;
        //查询驾驶员
    public List<DriverService> SelectDriver() throws Exception;
        //根据ID查询驾驶员
    public Integer SelectByIdDriver(Integer driverID) throws Exception;
}
