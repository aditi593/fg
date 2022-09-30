package com.tour.company.genericService.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.company.Repository.Repository;
import com.tour.company.genericService.genericService;
import com.tour.company.packageDTO.packageDTO;
import com.tour.company.packageEntity.Package;

@Service
public class genericServiceImpl implements genericService {
	@Autowired
    private Repository repo;
	
	@Override
	public List<packageDTO> get_all_packages() {
		List<packageDTO> pkgs = new ArrayList<>(Arrays.asList());
		List<Package> listpackages = repo.findAll();
		for(Package c:listpackages) {
			pkgs.add(new packageDTO(c.getPkg_id(), c.getPackage_id(), c.getSource_place(), c.getDestination_place(), c.getBasic_fare()));
		}		
		return pkgs;
	}

}
