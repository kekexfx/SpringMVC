package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name="name") String username){
        System.out.println(username);
        System.out.println("done....");
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        System.out.println("done....");
        return "success";
    }
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println(id);
        System.out.println("done....");
        return "success";
    }
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept") String header){
        System.out.println(header);
        System.out.println("done....");
        return "success";
    }


    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        System.out.println("done....");
        return "success";
    }
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(){
        System.out.println(" MA done....");
        return "success";
    }

    @ModelAttribute
    public void showUser(){
        System.out.println("showUser is done...");
    }
}
