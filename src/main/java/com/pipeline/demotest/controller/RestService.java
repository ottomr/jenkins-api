package com.pipeline.demotest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RestService {

    @RequestMapping("/test")
    public String testFunc() {
        return "husnu test1";
    }
}
