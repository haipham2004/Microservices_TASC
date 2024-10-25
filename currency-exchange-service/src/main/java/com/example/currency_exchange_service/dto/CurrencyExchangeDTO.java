package com.example.currency_exchange_service.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyExchangeDTO {

    private Long id;

    private String from;

    private String to;

    private BigDecimal conversionMultiple;

    private String environment;
}
