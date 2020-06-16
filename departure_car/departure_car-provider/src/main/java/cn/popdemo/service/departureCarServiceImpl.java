/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * Y_PoP
 *
 * @author 帆哥哥
 * @create 2020/6/16
 * @since 1.0.0
 */
package cn.popdemo.service;

import cn.popdemo.departureCar;
import cn.popdemo.mapper.departureCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class departureCarServiceImpl implements departureCarServiceInterface {

    @Autowired
    private departureCarMapper departureCarMapper;


    public List<departureCar> GetdepartureCarList() {
        return departureCarMapper.GetdepartureCarList();
    }
}
