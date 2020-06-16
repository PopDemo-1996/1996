/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * Y_PoP
 *
 * @author 帆哥哥
 * @create 2020/6/16
 * @since 1.0.0
 */
package cn.popdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class departure_Car_providerBoot {
    public static void main(String[] args) {

        SpringApplication.run(departure_Car_providerBoot.class, args);
    }
}
