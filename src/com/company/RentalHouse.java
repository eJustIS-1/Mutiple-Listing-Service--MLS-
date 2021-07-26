package com.company;

public class RentalHouse extends MultipleListingService {

    public RentalHouse(String address, int price) {
        super(address, price);
    }

    /**
     * instance variables
      */

    private String coporateName;
    private int bedRoomNumber;

    /**
     * @return the coporateName
     */
    public String getCoporateName() {
        return coporateName;
    }

    /**
     * @param coporateName the coporateName to set
     */
    public void setCoporateName(String coporateName) {
        this.coporateName = coporateName;
    }

    /**
     * @return the bedRoomNumber
     */
    public int getBedRoomNumber() {
        return bedRoomNumber;
    }

    /**
     * @param bedRoomNumber the bedRoomNumber to set
     */
    public void setBedRoomNumber(int bedRoomNumber) {
        this.bedRoomNumber = bedRoomNumber;
    }
    public String getDescription(){
        return "This rental house is owned by " + this.getCoporateName()
                + " and has " + this.getBedRoomNumber() + " rooms and is priced at "
                + this.getPrice() + "$" ;
    }
}
