package com.company;

public class NewConstructions extends MultipleListingService{

	
	
	/*Specific attributes for NewConstructions class. 
	 * 
	 * </code>expenses</code>, </code>Floornum</code>, </code>district</code>, and </code>district</code>.
	 * 
	 * @param expenses, expenses in dollars required to complete the building/house in USD. 
	 * @param Floornum, floor numbers (if any)
	 * @param type, type of the buliding: house, condo building..etc.  
	 */
	
	private double expenses; 
	private int Floornum; 
	private String  type; 
	
	/*Constructs a NewConstructions object. 
	 * 
	 * @param address, address of the object.
	 * @param price, rental price. 
	 * 
	 */
	public NewConstructions(String address, int price) {
		super(address, price);
			
	}
	
	//getters and setters
	
	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	public int getFloornum() {
		return Floornum;
	}

	public void setFloornum(int floornum) {
		Floornum = floornum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override 
	
	public String toString() {
		
		return "This New construction will be a " + getType() + " , and it will require " + getExpenses()+ "USD to be completed. It will have "+ getFloornum()+ " floors.";
	}
	
}
