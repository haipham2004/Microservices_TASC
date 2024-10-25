package com.example.currency_exchange_service.rest;

import com.example.currency_exchange_service.dto.CurrencyExchangeDTO;
import com.example.currency_exchange_service.entiy.CurrencyExchange;
import com.example.currency_exchange_service.service.CurrencyExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class CurrencyRest {

    private Logger logger= LoggerFactory.getLogger(CurrencyRest.class);

    private CurrencyExchangeService currencyExchangeService;

    private Environment environment;

    @Autowired
    public CurrencyRest(CurrencyExchangeService currencyExchangeService, Environment environment) {
        this.currencyExchangeService = currencyExchangeService;
        this.environment = environment;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable("from") String from,
                                                  @PathVariable("to") String to){

        logger.info("Withi logger",from,to);
        CurrencyExchange currencyExchange= new CurrencyExchange(1L,from,to, BigDecimal.valueOf(50));
        String port=environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }

    @GetMapping("hien-thi")
    public ResponseEntity<List<CurrencyExchangeDTO>> getAll(){
        return ResponseEntity.ok(currencyExchangeService.getAll());
    }
}
