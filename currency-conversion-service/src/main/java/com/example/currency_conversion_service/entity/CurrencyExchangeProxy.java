package com.example.currency_conversion_service.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


// bỏ -service đi
//@FeignClient(name="currency-exchange", url = "http://localhost:8000")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
     CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from,
                                                  @PathVariable("to") String to);
}
