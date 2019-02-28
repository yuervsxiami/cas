package com.zhonggao.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User:zhaozhihui
 * Date: 2019/2/26.
 * Time: 16:30
 */
@Controller
public class TestController {

    @Value("${casClientLogoutUrl}")
    private String clientLogoutUrl;

    @RequestMapping("index")
    public String index(ModelMap map) {
        map.addAttribute("name", "clien A");
        return "index";
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();//销毁session
        //使用cas退出成功后,跳转到http://cas.client1.com:9002/logout/success
        return "redirect:" + clientLogoutUrl;
    }

    @RequestMapping("logout/success")
    public String logoutsuccess(HttpSession session) {
        return "logoutsuccess";
    }
}
