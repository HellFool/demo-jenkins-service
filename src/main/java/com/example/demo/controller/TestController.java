package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController
{
    @GetMapping("/index")
    public Map<String, String> index(){
        Map<String, String> result = new HashMap<>();
        result.put("test1", "test1");
        result.put("test2", "test2");
        result.put("test3", "test3");
        result.put("test4", "test4");
        result.put("test5", "test5");
        result.put("test6", "test6");
        return result;
    }
}