package org.wablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面跳转Controller
 *
 * @author : Waver
 * @date : 2018/9/23 16:45
 */
@Controller
@RequestMapping(value = "/")
public class PageController {


    /**
     * 展示首页信息
     *
     * @return String
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "index";
    }

    /**
     * 展示页面信息
     *
     * @param page 传入的参数
     * @return String
     */
    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String showPage(@PathVariable String page) {
        return page;
    }

}
