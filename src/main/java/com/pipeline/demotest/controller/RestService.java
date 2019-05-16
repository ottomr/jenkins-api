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


    @RequestMapping("/test2")
    public String test2Func() {
        return "husnu test2";
    }

    @RequestMapping("/test3")
    public String test3Func() {
        return "husnu test3";
    }

}
