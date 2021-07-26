package com.company;

import java.util.UUID;

public class townHouse extends MultipleListingService {
    // instance variables
    private String county;
    private String description;

    public townHouse(String address, int price) {
        super(address, price);
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     *
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return id
     */

    @Override
    public String toString(){
        return super.toString() + "\n Property Type: Town house{ "
                + " County: " + this.getCounty()
                +"; Description: " + this.getDescription()
                + " }" ;
    }

}
