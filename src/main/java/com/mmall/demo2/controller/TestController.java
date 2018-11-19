package com.mmall.demo2.controller;

import com.mmall.demo2.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * @author ct
 * @Title: TestControll
 * @ProjectName demo2
 * @Description: TODO
 * @date 2018/11/19 1:07
 */
@Controller
public class TestController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public  String index(){
        return  "index";
    }
@RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username")String username,
                            @RequestParam("password") String password,
                            HttpSession session
                            ){
    UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken();
    Subject subject= SecurityUtils.getSubject();
    try {
        subject.login(usernamePasswordToken);
        User user=(User) subject.getPrincipal();
        session.setAttribute("user", user);
        return "index";
    }catch (Exception e){
    return "login";
    }


}

}
