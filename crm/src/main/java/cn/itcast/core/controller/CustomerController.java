package cn.itcast.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/list")
    public String getCustomerList(){
        System.out.prientln("1");
        System.out.prientln("1");
        System.out.prientln("1");
        System.out.prientln("1");
        return "customer";
    }



}
