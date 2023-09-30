package com.practice.demoMaven.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class Controller {

    @GetMapping("/test")
    public String tryjwt() {
        return "DONE?";
    }
}
