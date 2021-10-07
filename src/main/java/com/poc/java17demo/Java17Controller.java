package com.poc.java17demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Java17Controller {

    @GetMapping("/")
    public Map<String, String> whoAmI(){
        Map<String, String> map = new HashMap<>();
        map.put("jvmVersion", Runtime.version().toString());
        map.put("now", LocalDateTime.now().toString());
        return map;
    }
}
