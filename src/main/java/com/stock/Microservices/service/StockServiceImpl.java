package com.stock.Microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.Microservices.Dao.StockRepo;
import com.stock.Microservices.exception.StockNotFoundException;
import com.stock.Microservices.model.StockPrice;

@Service
public class StockServiceImpl implements IStockPriceService
{
	@Autowired
	private StockRepo repo;
	
	
	@Override
	public Double fetchByCompanyName(String companyName) 
	{
		StockPrice sp = repo.findByCompanyName(companyName);
		if(sp==null)
		{
			throw new StockNotFoundException("Stock Price Not Availaible");
		}
		return sp.getCompanyPrice();
	}
}
