package org.wablog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 Controller
 *
 * @author waver
 * @date 2018/10/24 16:45
 */
@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

    @GetMapping("/login")
    public String login() {

        return "signin";
    }

}
