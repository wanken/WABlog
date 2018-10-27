package org.wablog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 网站配置Controller
 *
 * @author waver
 * @date 2018/10/22 19:50
 */
@Controller
public class ConfigController {


    /**
     * 防止 favicon 出现404
     */
    @GetMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {
    }


}
