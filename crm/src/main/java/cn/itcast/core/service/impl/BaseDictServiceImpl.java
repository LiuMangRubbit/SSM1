package cn.itcast.core.service.impl;

import cn.itcast.core.mapper.BaseDictMapper;
import cn.itcast.core.pojo.BaseDict;
import cn.itcast.core.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> findDictByTypeCode(String typeCode) throws Exception {
        List<BaseDict> dictList = baseDictMapper.findDictByTypeCode(typeCode);
        return dictList;
    }
}
