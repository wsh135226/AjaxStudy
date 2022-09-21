package wsh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:wsh
 * @date 2022/9/20 16:11
 * return
 */
@Controller
public class ControllerLogin {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
