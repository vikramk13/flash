package com.fintech.org.model;

public interface Users {
	String getState();
	Integer getState_Code();
	String getDistrict();

	
	
	public interface Use
	{
		String getTown();
	 Integer getDistrict_Code();
		String getState();
		String getDistrict();
	}
	
	
	
	public interface Dist
	{
		String getTown();
		 String getUrban_Status();
		 Integer getState_Code();
		 String getState();
		 Integer getDistrict_Code();
			String getDistrict();
		 
		 
		 
	}
	
}
