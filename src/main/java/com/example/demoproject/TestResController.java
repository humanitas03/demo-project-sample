/**
 * ===============================================================
 * File name : TestResController.java
 * Created by injeahwang on 2021-08-21
 * ===============================================================
 */
package com.example.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResController {

    @GetMapping("/test")
    public String helloWorld(){
        return "hello world";
    }
}
