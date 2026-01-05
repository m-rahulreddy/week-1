package com.example.myapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.myapp.DTO.F;
import com.example.myapp.math.M;

@CrossOrigin(origins = "*")
@RestController
public class Index {
    @GetMapping("/")
    F m(){
        return new F();
    }
    @GetMapping("/test")
    String m1(){
        return "Testing api ";
    }
    @PostMapping("/sum") //Query paramas
    long m2(@RequestParam int anurag){
        
        
        return M.sum(anurag );

    }
    @PostMapping("/s/{n}")  //Path paramater
    long m3(@PathVariable int n){
        return M.sum(n);
    }

    
}
