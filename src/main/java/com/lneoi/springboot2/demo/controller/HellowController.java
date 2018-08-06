package com.lneoi.springboot2.demo.controller;

import com.lneoi.springboot2.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lneoi.li
 * @date 2018年8月6日$ 14点43分$
 **/
@Controller
@RequestMapping("/helloWorld")
public class HellowController {

    @Autowired
    HttpServletRequest request; //这里可以获取到request

    @RequestMapping("/index")
    public String index(Model model, String id) {

        String ip = request.getHeader("x-forwarded-for");
        System.out.println(request.getRemoteHost());
        User user = new User();
        user.setId(1L);
        user.setUserName("aaaa1");

//        ModelAndView mv = new ModelAndView("index");

        model.addAttribute("user",user);
        return "index";
    }

}
