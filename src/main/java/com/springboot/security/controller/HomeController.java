package com.springboot.security.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    //Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/public")
    public ResponseEntity<?> publicUser() {
        return ResponseEntity.ok("I am a public user");
    }

     @GetMapping("/admin")
    public ResponseEntity<?> adminUser() {
        return ResponseEntity.ok("I am a Admin user");
    }

     @GetMapping("/semiadmin")
    public ResponseEntity<?> semiAdminUser() {
        return ResponseEntity.ok("I am a semiadmin user");
    }

    @GetMapping("/test")
    public String test() {
        //this.logger.warn("This is working message");
        return "Testing message";
    }
    
}
