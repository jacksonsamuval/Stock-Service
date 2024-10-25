package com.stock.Microservices.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.Microservices.model.StockPrice;

@Repository
public interface StockRepo extends JpaRepository<StockPrice, Integer> 
{
	public StockPrice findByCompanyName(String companyName);
}
