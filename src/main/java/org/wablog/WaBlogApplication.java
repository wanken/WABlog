package org.wablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author waver
 */
@RestController
@SpringBootApplication(scanBasePackages = "org.wablog")
public class WaBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaBlogApplication.class, args);
    }
}
