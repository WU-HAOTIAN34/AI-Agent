package com.wht.ai2025.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${spring.ai.dashscope.api-key}")
    String apiKey;

    @GetMapping("")
    public String test() {
        return apiKey;
    }
}
