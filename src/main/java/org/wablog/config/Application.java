package org.wablog.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * 开启默认事务管理
 * @author waver
 */
@EnableTransactionManagement
@SpringBootApplication
@ServletComponentScan
public class Application extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(Application.class);


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }

}