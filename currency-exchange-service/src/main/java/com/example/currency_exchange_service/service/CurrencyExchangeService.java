package com.example.currency_exchange_service.service;

import com.example.currency_exchange_service.dto.CurrencyExchangeDTO;

import java.util.List;

public interface CurrencyExchangeService {

    List<CurrencyExchangeDTO> getAll();
}
