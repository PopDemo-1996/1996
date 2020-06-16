package cn.popdemo.mapper;

import cn.popdemo.departureCar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * Y_PoP
 *
 * @author 帆哥哥
 * @create 2020/6/16
 * @since 1.0.0
 */
@Mapper
public interface departureCarMapper {
    List<departureCar> GetdepartureCarList();
}
