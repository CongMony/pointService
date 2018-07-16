package com.congqian.point.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * @program: point
 * @description:
 * @author: Cong.Qian
 * @create: 2018-07-15 00:33
 **/
@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView Login() {
        return new ModelAndView("/concept/login");
    }

    @RequestMapping("/loginOut")
    public ModelAndView cancel() {
        return new ModelAndView("/concept/confirm");
    }
}
