/**
 * 
 */
package com.skool.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satender Kumar<satender.kumar@algoworks.com>
 *
 */
@RestController
public class StudentRestController {

    @GetMapping("/test")
    public String test() {
        return "working";
    }
}
