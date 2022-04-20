package com.game.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @GetMapping("/hello")
    public ResponseEntity<String> helloword(){
        return ResponseEntity.ok("Wellcome to us!!!");
    }

    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Demo!!!");
    }
}
