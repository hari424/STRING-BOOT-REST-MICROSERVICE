package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.StockPrice;
import com.nt.repository.StockPriceRepository;

@RestController
public class StockPriceRestController {
	@Autowired
	private StockPriceRepository priceRepo;
	@GetMapping("/getCost/{companyName}")
	public ResponseEntity<Double> getCostByCompanyName(@PathVariable("companyName") String name) {
		StockPrice stockPriceObj = priceRepo.findByCompanyName(name);
		Double stockCost = stockPriceObj.getStockCost();
		return new ResponseEntity<Double>(stockCost, HttpStatus.OK) ;
	}
	
}
