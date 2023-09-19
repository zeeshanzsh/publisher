package com.zeeshan.publisher.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@RestController
@Slf4j
public class PublisherController {


    @GetMapping("/")
    public String health() {
        return "Publisher is Healthy";
    }

    @GetMapping("/even-numbers")
    public Flux<Integer> getEvenData() {

        Flux<Integer> evenNumbers = Flux
                .range(0, 100)
                .filter(x -> x % 2 == 0);
        return evenNumbers;
    }

    @GetMapping("/odd-numbers")
    public Flux<Integer> getOddData() {
        Flux<Integer> oddNumbers = Flux
                .range(0, 100)
                .filter(x -> x % 2 > 0);
        return oddNumbers;
    }


}
