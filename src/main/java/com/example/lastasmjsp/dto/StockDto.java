package com.example.lastasmjsp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockDto implements Serializable {
    private Integer id;
    private String symbol;
    private String stock_name;
    private Integer stock_price;
}
