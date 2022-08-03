package com.example.lastasmjsp.controller;

import com.example.lastasmjsp.entity.StockEntity;
import com.example.lastasmjsp.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    StocksService stocksService;


    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<StockEntity> result = stocksService.getAllStocks();
        model.addAttribute("list_symbol", result);
        return "index";
    }

    public List<Double> getStockPrice(String symbol){
        List<Double> result = stocksService.findPriceBySymbol(symbol);
        return result;
    }

    public List<String> getStockName(String symbol){
        List<String> result = stocksService.findNameBySymbol(symbol);
        return result;
    }
}