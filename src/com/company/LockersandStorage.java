package com.company;

public class LockersandStorage extends MultipleListingService {
	
	/*Specific attributes for Lockers and Storages are 
	   * </code>LeaseDuration</code>, and </code>status</code>. 
	   * 
	   * @param LeaseDuration, Duration the unit is to be rented for in months. 
	   * @param status, availibility of the unit (0 is not availble, 1 is available)   
	   *  @param unitType, Identifies if the unit is a locker or storage. 
	   */
	
	private int LeaseDuration; 
	private boolean status; 
	private String unitType;
	
	/*Constructs a Lockers and Storage object. 
	 * 
	 * @param address, address of the unit
	 * @param price, rental price
	 * 
	 */
	  public LockersandStorage (String address, int price) {
	        super(address, price);
	    }

	  //Getters and Setters

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public int getLeaseDuration() {
		return LeaseDuration;
	}


	public void setLeaseDuration(int leaseDuration) {
		this.LeaseDuration = leaseDuration;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	  
	
	  @Override 
	  
	  
	  public String toString() {
		  
		  String Availability; int months; 
		  
		  if(isStatus()) { Availability= "Available";}
		  else {Availability = "Not Available";}
		  
		  return "This unit is a " + this.getUnitType() + ". It is "+ Availability +" ,and will be rented for "+ getLeaseDuration()+ " months."; 
	  }



}
