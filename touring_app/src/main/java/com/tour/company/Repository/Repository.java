package com.tour.company.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tour.company.packageEntity.Package;

public interface Repository extends JpaRepository<Package, Integer> {

}
