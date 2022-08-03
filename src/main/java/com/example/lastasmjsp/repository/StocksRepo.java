package com.example.lastasmjsp.repository;

import com.example.lastasmjsp.entity.StockEntity;
import org.apache.catalina.LifecycleState;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StocksRepo extends JpaRepository<StockEntity, Integer> {


    List<StockEntity> findAll(String name);

    @Query("select 'stock_name' from StockEntity where symbol like %:symbol%")
    List<String> findNameBySymbol(String symbol);

    @Query("select 'stock_price' from StockEntity where symbol like %:symbol%")
    List<Double> findPriceBySymbol(String symbol);

    StockEntity findBySymbol(String name);




}
