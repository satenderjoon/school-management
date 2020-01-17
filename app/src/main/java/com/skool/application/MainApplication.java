package com.skool.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Satender Kumar<satender.kumar@algoworks.com>
 *
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.skool.application", "com.skool.api"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
