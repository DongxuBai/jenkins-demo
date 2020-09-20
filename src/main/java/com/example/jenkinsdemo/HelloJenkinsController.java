package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bai
 * @since 2020/9/20
 */
@RestController
public class HelloJenkinsController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Jenkins!";
    }
}
