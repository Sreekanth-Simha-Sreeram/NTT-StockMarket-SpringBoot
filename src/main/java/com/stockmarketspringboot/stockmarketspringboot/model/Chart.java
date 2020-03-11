package com.stockmarketspringboot.stockmarketspringboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

	@Entity
	@Table(name="Chart")
	public class Chart {
		
		@Column(name="stockPrice")
		int stockPrice;
		
		@Column(name="fromDate")
	    Date  fromDate;
		
		@Column(name="toDate")
	    Date toDate;
	    
		public int getStockPrice() {
			return stockPrice;
		}
		public void setStockPrice(int stockPrice) {
			this.stockPrice = stockPrice;
		}
		public Date getFromDate() {
			return fromDate;
		}
		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}
		public Date getToDate() {
			return toDate;
		}
		public void setToDate(Date toDate) {
			this.toDate = toDate;
		}
	}

