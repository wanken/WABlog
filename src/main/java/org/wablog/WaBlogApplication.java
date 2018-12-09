package org.wablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 *
 * @author waver
 */
@SpringBootApplication(scanBasePackages = "org.wablog")
public class WaBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaBlogApplication.class, args);
    }
}
