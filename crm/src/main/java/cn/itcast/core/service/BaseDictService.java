package cn.itcast.core.service;

import cn.itcast.core.pojo.BaseDict;

import java.util.List;

public interface BaseDictService {
    //通过typeCode查询
   public List<BaseDict> findDictByTypeCode(String typeCode) throws Exception;

}
