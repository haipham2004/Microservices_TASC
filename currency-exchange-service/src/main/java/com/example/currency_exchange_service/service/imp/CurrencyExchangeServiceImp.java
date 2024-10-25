package com.example.currency_exchange_service.service.imp;

import com.example.currency_exchange_service.dto.CurrencyExchangeDTO;
import com.example.currency_exchange_service.repository.CurrencyExchangeRepository;
import com.example.currency_exchange_service.service.CurrencyExchangeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyExchangeServiceImp implements CurrencyExchangeService {

    private CurrencyExchangeRepository currencyExchangeRepository;

    private ModelMapper modelMapper;

    @Autowired
    public CurrencyExchangeServiceImp(CurrencyExchangeRepository currencyExchangeRepository, ModelMapper modelMapper) {
        this.currencyExchangeRepository = currencyExchangeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CurrencyExchangeDTO> getAll() {
        return currencyExchangeRepository.findAll().stream()
                .map((currencyExchange) -> modelMapper.map(currencyExchange,CurrencyExchangeDTO.class)).collect(Collectors.toList());
    }
}
