package com.tour.company.packageEntity;

import javax.persistence.*;

@Entity
@Table(name = "tour_company")
public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pkg_id;
	private String source_place;
	private String destination_place;
	private String package_id;
	private double basic_fare;
	
	public String getPackage_id() {
		return package_id;
	}
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	public Integer getPkg_id() {
		return pkg_id;
	}
	public void setPkg_id(Integer pkg_id) {
		this.pkg_id = pkg_id;
	}
	public String getSource_place() {
		return source_place;
	}
	public void setSource_place(String source_place) {
		this.source_place = source_place;
	}
	public String getDestination_place() {
		return destination_place;
	}
	public void setDestination_place(String destination_place) {
		this.destination_place = destination_place;
	}
	public double getBasic_fare() {
		return basic_fare;
	}
	public void setBasic_fare(double basic_fare) {
		this.basic_fare = basic_fare;
	}
	
}
