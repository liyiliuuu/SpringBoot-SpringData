package cn.springboot.springdata.controller;

import cn.springboot.springdata.entity.User;
import cn.springboot.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/data/jpa/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    /**
     * @return
     * 查询用户列表
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserList(){
        List<User> userList = this.userService.findAllUsers();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("total", userList.size());
        param.put("rows", userList);
        System.out.println(param);
        return param;
    }
    
    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET)
    @ResponseBody
    public User getAuthor(@PathVariable Long userId, HttpServletRequest request) {
        User user = this.userService.findUserById(userId);
        if (user == null) {
            throw new RuntimeException("查询错误");
        }
        return user;
    }
}
