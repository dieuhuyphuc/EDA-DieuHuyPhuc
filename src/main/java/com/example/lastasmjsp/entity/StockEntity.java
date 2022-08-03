package com.example.lastasmjsp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "stocks")
public class StockEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "symbol")
    private String symbol;

    @Basic
    @Column(name = "stock_name")
    private String stock_name;
    @Basic
    @Column(name = "stock_price")
    private Double stock_price;



}
