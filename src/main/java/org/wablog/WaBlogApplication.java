package org.wablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目启动类
 *
 * @author waver
 */
@Configuration
@RestController
@SpringBootApplication(scanBasePackages = "org.wablog")
public class WaBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaBlogApplication.class, args);
    }
}
