package org.wablog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : Waver
 * @date : 2018/9/23 16:45
 */
@Api(value = "/{page}" ,tags = "页面跳转Controller")
@Controller
@RequestMapping(value = "/")
public class PageController {


    @ApiOperation(value="展示首页信息", notes = "展示首页信息")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "index";
    }

    @ApiOperation(value="展示页面信息", notes = "展示页面信息")
    @ApiImplicitParam(name="page", required = true, dataType = "String")
    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String showPage(@PathVariable String page) {
        return page;
    }

}
