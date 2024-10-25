package com.stock.Microservices.service;


public interface IStockPriceService 
{
	public Double fetchByCompanyName(String companyName);
}
