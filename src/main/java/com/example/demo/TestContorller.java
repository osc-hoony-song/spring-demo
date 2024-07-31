
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestContorller {

    @GetMapping("/test")
    String test(){
        return "123444";
    }
     
}