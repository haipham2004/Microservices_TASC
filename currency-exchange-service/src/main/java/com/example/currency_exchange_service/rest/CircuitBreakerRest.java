package com.example.currency_exchange_service.rest;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerRest {

    private static final Logger logger = LoggerFactory.getLogger(CurrencyRest.class);

    @GetMapping("sample-api")
//    @Retry(name="sample-api", fallbackMethod = "hardCodeResponse")
//    @CircuitBreaker(name="default", fallbackMethod = "hardCodeResponse")
//    @RateLimiter(name="default")
    public String sampleApi(){
//        logger.info("Sample API call");
//        ResponseEntity<String> forEntity=new RestTemplate().getForEntity("http://localhost:8080/some-dumy-url",String.class);
//                return forEntity.getBody();
        return "Hải Phạm YKA";
    }

    public String hardCodeResponse(Exception e) {
        return "fall back";
    }
}
