package org.wablog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wablog.entity.User;
import org.wablog.service.UserService;

/**
 * 用户 Controller
 *
 * @author waver
 * @date 2018/10/24 16:45
 */
@Controller
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public User login(String userName, String password) {
        return null;
    }

    @GetMapping("/getUser")
    public User getUserByName(String name) {

        return null;
    }

}
