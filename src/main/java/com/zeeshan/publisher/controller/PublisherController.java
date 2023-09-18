package com.zeeshan.publisher.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PublisherController {


     @GetMapping("/")
    public String health(){
         return "Publisher is Healthy";
     }
}
