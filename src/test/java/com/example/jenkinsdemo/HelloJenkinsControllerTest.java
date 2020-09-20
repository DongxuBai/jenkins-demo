package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Bai
 * @since 2020/9/20
 */
@SpringBootTest
class HelloJenkinsControllerTest {


    @Test
    void hello() {
        System.out.println("test hello success !!!");
    }
}