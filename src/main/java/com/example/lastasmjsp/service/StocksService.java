package com.example.lastasmjsp.service;

import com.example.lastasmjsp.entity.StockEntity;
import com.example.lastasmjsp.repository.StocksRepo;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StocksService {

    @Autowired
    StocksRepo stocksRepo;

    public List<StockEntity> getAllStocks(){
        return stocksRepo.findAll();
    }

    public List<String> findNameBySymbol(String symbol){
        return stocksRepo.findNameBySymbol(symbol);
    }
    public List<Double> findPriceBySymbol(String symbol){
        return stocksRepo.findPriceBySymbol(symbol);
    }


}
