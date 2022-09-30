package com.tour.company.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tour.company.discountDTO.discountDTO;
import com.tour.company.genericService.genericService;
import com.tour.company.genericService.Impl.genericServiceImpl;
import com.tour.company.packageDTO.packageDTO;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
public class Controller {
	@Autowired
    genericServiceImpl genericService;
	

	@RequestMapping(value="/packages", method=RequestMethod.GET)
	public List<packageDTO> fetch_packages() {
		return genericService.get_all_packages();
	}
	
	@RequestMapping(value="/packages/price", method=RequestMethod.POST)
	public double fetch_discount(@RequestBody discountDTO pkg) {
		int discount = 0;
		if (pkg.getNo_of_days() >= 0 && pkg.getNo_of_days() <= 5) {
			discount = 0;
		}
		else if(pkg.getNo_of_days() > 5 && pkg.getNo_of_days() <= 8) {
			discount = 3;
		}
		else if (pkg.getNo_of_days() > 8 && pkg.getNo_of_days() <= 10) {
			discount = 5;
		}
		else {
			discount = 7;
		}
		
		double tot_cost = pkg.getBasic_fare() * pkg.getNo_of_days();
		tot_cost = tot_cost - (tot_cost * (discount/100));
		tot_cost = tot_cost + (tot_cost * 0.12);
		return tot_cost;
	}
}
