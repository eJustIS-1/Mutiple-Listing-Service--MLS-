package com.company;

public class Land extends MultipleListingService {

	/*Specific Attributes for the Land class objects. 
	 * 
	 * @param Features, this attribute allows the client to enter all features related to the land. 
	 * </p> Features are left to be described by the client because Lands can have different variations. 
	 * 
	 */
	private String features; 
	
	/*Constructs a Land object. 
	 * 
	 * @param address, address of the Land.
	 * @param price, rental price or buying price. 
	 * 
	 */
	public Land(String address, int price) {
		super(address, price);
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	
	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}
	
	@Override 
	
	public String toString() {
		return getFeatures();
	}
	
	
	
	

}
