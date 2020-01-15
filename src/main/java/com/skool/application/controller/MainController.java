/**
 * 
 */
package com.skool.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satender Kumar<satender.kumar@algoworks.com>
 *
 */
@RestController
public class MainController {

    @GetMapping("/")
    public String root() {
        return "Hello";
    }
}
