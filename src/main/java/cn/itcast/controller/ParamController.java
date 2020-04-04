package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {
    /*
    * 请求参数绑定入门
    * */
    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("done...");
        System.out.println("your username:" + username);
        return "success";

    }
}
