package com.stock.Microservices.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STOCK_PRICE")
public class StockPrice 
{
	@Id
	@Column(name="STOCK_ID")
	private Integer stockId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COMPANY_PRICE")
	private Double companyPrice;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyPrice() {
		return companyPrice;
	}

	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}

	public StockPrice(Integer stockId, String companyName, Double companyPrice) {
		super();
		this.stockId = stockId;
		this.companyName = companyName;
		this.companyPrice = companyPrice;
	}
	
	public StockPrice() {}
}
