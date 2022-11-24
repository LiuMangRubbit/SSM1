package cn.itcast.core.controller;

import cn.itcast.core.pojo.BaseDict;
import cn.itcast.core.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/customer")
public class BaseDictController {
/*
    @Autowired
    private BaseDictService baseDictService;
    @Value("${customer.source.code}")
    private String CustomerSourceCode;
    @Value("${customer.industry.code}")
    private String CustomerIndustryCode;
    @Value("${customer.level.code}")
    private String CustomerLevelCode;

    @RequestMapping("/list")
    public String showCustomerList(Model model) throws Exception {
        //查询字典表初始化下拉列表
        List<BaseDict> custSourceList = baseDictService.findDictByTypeCode(CustomerSourceCode);
        List<BaseDict> custIndustryList = baseDictService.findDictByTypeCode(CustomerIndustryCode);
        List<BaseDict> custLevelList = baseDictService.findDictByTypeCode(CustomerLevelCode);
        //把列表传递给jsp页面
        model.addAttribute("fromType", custSourceList);
        model.addAttribute("industryType", custIndustryList);
        model.addAttribute("levelType", custLevelList);

        return "customer";
    }*/

}
