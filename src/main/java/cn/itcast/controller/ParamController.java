package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    //请求参数封装到javabean的类中
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("done...");
        System.out.println(account);

        return "success";

    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("done...");
        System.out.println(user);

        return "success";

    }
    /*
    * 远程api获取
    * */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("done...");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";

    }
}
