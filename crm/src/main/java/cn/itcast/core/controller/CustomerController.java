package cn.itcast.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.testng.reporters.jq.Main;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/list")
    public String getCustomerList(){
        return "customer";
    }

    public static void main(String[] args) {
        System.out.println("不负韶华");
    }

}
