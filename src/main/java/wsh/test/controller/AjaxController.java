package wsh.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.tags.form.PasswordInputTag;
import wsh.test.mapper.UserMapper;
import wsh.test.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:wsh
 * @date 2022/9/20 17:55
 * return
 */
@Controller
@RequestMapping("/ajax")
public class AjaxController {

    /**
     * @description:
     * @author: wsh
     * @date: 2022/9/20 18:58
     * @param: [name, response]
     * @return: void
     * 从前端接收数据
     **/
    @ResponseBody
    @RequestMapping("/a1")
    public void ajax(String name, HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        if ("admin".equals(name)){
            response.getWriter().print("true");
            System.out.println(name);
        }
        else {
            response.getWriter().print("false");

        }
    }

    @RequestMapping("/a2")
    @ResponseBody
    public List<User> getList(String username){
        //查询所有用户信息
        List<User> list = userMapper.selectList(null);
        return list;

    }

    //从服务器返回字符串给前端
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/a3")
    @ResponseBody
    public String getUsername(String username){
        //查询用户名
        String msg;
        String usernameInfo = userMapper.getName(username);
        if (username.equals(usernameInfo)){
            msg = "";
            System.out.println(username.equals(usernameInfo));
        }else {
            msg = "用户名错误";
        }
        /*User passwordInfo = userMapper.getName(username,password);
        if (passwordInfo.equals(password)){
            msg = "";
        }else {
            msg = "密码错误";
        }*/
        return msg;
    }

}
