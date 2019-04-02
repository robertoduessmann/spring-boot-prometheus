package com.metrics.springbootprometheus.controller;

import com.metrics.springbootprometheus.counter.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("count")
public class CountController {
    @Autowired
    private CountService countService;

    @PostMapping
    public ResponseEntity increment() {
        countService.increment();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}