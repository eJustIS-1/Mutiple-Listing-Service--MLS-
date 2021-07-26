package com.company;

public class ParkingSpaces extends MultipleListingService{

	
	/*Specific attributes for ParkingSpaces 
	   * </code>StartTime</code>, </code>EndTime</code>, </code>status</code>, and </code>ParkingType</code>.  
	   * 
	   * @param StartTime, start of the parking period.
	   * @param EndTime, end of the parking period. 
	   * @param status, availability of the unit (0 is not available, 1 is available)   
	   * @param ParkingType, Identifies if parking is hourly, daily, or monthly. 
	   */
	
	private int Duration; 
	private boolean status; 
	private String ParkingType;
	
	
	/*Constructs a ParkingSpace object. 
	 * 
	 * @param address, address of the space.
	 * @param price, rental price
	 * 
	 */
	public ParkingSpaces(String address, int price) {
		super(address, price);
			
	}


	
	//Getters and Setters
	
	public int getDuration() {
		return Duration;
	}


	public void setDuration(int Duration) {
		this.Duration = Duration;
	}


	


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getParkingType() {
		return ParkingType;
	}


	public void setParkingType(String parkingType) {
		ParkingType = parkingType;
	}
	
	
	@Override 
	public String toString() {
		  
	    String type = null; String Availability;
	    
	      if(getParkingType()=="Daily") {type = "Days";}
	      else if(getParkingType() == "Hourly") {type = "Hours";}
	      else if(getParkingType() == "Monthly") {type = "Months";}
		  
	      
		  if(isStatus()) { Availability= "Available";}
		  else {Availability = "Not Available";}
		  
		  return "This Parking space is "+ Availability + ". It will be available after "+ getDuration()+ " "+ type +"."; 
	  }
	

	
}
