package cn.popdemo.controller;


import cn.popdemo.dto.ReturnResult;
import cn.popdemo.service.login.LoginService;
import cn.popdemo.service.loginUserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.zookeeper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

   @Reference
    private LoginService loginService;

    @Autowired
    private loginUserService loginUserService;


    @ResponseBody
    @RequestMapping("/login")
    public String login() {
        return "ok";
    }

    //登录
    @RequestMapping(value = "/doLogin")
    public ReturnResult doLogin(String driverName,String driverPassword) throws  Exception{
        System.out.println("进入登录页面");
        return loginUserService.login(driverName,driverPassword);
    }



}
