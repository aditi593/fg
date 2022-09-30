package com.tour.company.packageDTO;

public class packageDTO {
	int pkg_id;
	String package_id;
	String source_place;
	String destination_place;
	double basic_fare;
	
	public packageDTO() {
		
	}
	
	public packageDTO(int pkg_id, String package_id, String source_place, String destination_place, double basic_fare) {
		super();
		this.pkg_id = pkg_id;
		this.package_id = package_id;
		this.source_place = source_place;
		this.destination_place = destination_place;
		this.basic_fare = basic_fare;
	}
	public int getPkg_id() {
		return pkg_id;
	}
	public void setPkg_id(int pkg_id) {
		this.pkg_id = pkg_id;
	}
	public String getPackage_id() {
		return package_id;
	}
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
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
