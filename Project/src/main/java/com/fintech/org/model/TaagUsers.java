package com.fintech.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taagusers")
public class TaagUsers 

{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
	private String town;
	private String urbanStatus;
	private Integer stateCode;
	private String state;
	private Integer districtCode;
	private String district;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getUrbanStatus() {
		return urbanStatus;
	}
	public void setUrbanStatus(String urbanStatus) {
		this.urbanStatus = urbanStatus;
	}
	public Integer getStateCode() {
		return stateCode;
	}
	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	

}
