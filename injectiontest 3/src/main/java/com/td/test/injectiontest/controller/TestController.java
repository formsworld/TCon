package com.td.test.injectiontest.controller;

import com.td.test.injectiontest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

    @Autowired
    TestService service;
    @GetMapping(value = "/test")
    public ResponseEntity<Object> getPlayer() {
        service.getAS();
        return ResponseEntity.accepted().body("hai");
    }
}
