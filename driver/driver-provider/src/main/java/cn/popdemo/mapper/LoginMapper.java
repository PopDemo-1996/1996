package cn.popdemo.mapper;


import cn.popdemo.Driver;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


@Mapper
public interface LoginMapper {
    //查询
    public Driver SelectDriverbyDriverNameAndDriverPassword(Map<String,String> params) throws Exception;


}
