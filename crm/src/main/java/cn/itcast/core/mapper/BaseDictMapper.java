package cn.itcast.core.mapper;

import cn.itcast.core.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BaseDictMapper {
    //通过typeCode查询
    public List<BaseDict> findDictByTypeCode(String  typeCode) throws Exception;

}
