package com.company;


/*A high-value home is typically categorized as a home with a value above
 $750,000, but some policies may only cover homes worth $1 million and up. 
*/

public class highvaluehomes extends MultipleListingService implements Neighborhood{

    private int houseId;// House identification number
    private int price;  // cost of the property

    /**
     * Constructor for High-value property
     *
     * @param address is the location of the property
     * @param price   is the cost of the property
     */
    public highvaluehomes(String address, int price) {
        super(address, price);
    }

    public int gethouseId() {
        return houseId;
    }


    public void sethouseId(int houseId) {
        this. houseId =  houseId;
    }
    public int getprice(){
	return price;
	}
    
    public void setprice(int price) {
	this.price=price;
	}
 
    private int howGoodIsNeighborhood = 10; // how good is the neighborhood of the construction, on a scale of 1 to 10, inclusive

    /**
     * Get how good the neighborhood is on the scale of 1 to 10
     * @return how good the neighborhood is
     */
    @Override
    public int getHowGoodIsNeighborhood() {
        return this.howGoodIsNeighborhood;
    }

    /**
     * Set how good the neighborhood is on the scale of 1 to 10
     * @param howGoodIsNeighborhood is how good the neighborhood is
     * @pre. 1 <= howGoodIdNeighborhood <= 10
     */
    @Override
    public void setHowGoodIsNeighborhood(int howGoodIsNeighborhood) {
        this.howGoodIsNeighborhood = howGoodIsNeighborhood;
    }


    @Override
    public String toString() {
        return super.toString() + "\nProperty Type: High-valued Homes{ " +
                "houseId= " + houseId +
                ",House Price= " + price +
                ", howGoodIsNeighborhood= " + howGoodIsNeighborhood +
                " }";
    }
}
