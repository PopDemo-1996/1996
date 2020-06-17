package cn.popdemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DriverProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverProviderApplication.class, args);
    }

}
