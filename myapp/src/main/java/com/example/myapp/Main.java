package com.example.myapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
public class Main {
    @GetMapping("/api")
    HashMap<Object,Object> m() {
        HashMap<Object,Object> res=new HashMap<>();
        res.put("msg","welcome to api");
        res.put("fruit","🍎🍑🥭");
        return res;
    }
}
