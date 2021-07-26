package com.company;

/*
Multi-generational homes, also referred to as multi-gen
or next-gen homes, are designed to provide space for
multiple generations to live together under one roof.
In a multi-generational home, each generation will benefit
from having their own separate space and privacy.
*/

import java.util.ArrayList;

public class MultiGenerational extends MultipleListingService implements Neighborhood{

    private int numFullBathroom; // number of full bathrooms
    private int numHalfBathroom; // number of half bathrooms
    private int numBedroom; // number of bedrooms
    private int numAppliances; // number of appliances
    private ArrayList<String> applianceList = new ArrayList<>(); // list of appliances

    private boolean hasBalcony; // true or false if there is a balcony on the property
    private boolean hasPorch; // true or false if there is a balcony on the property
    private boolean hasPatio; // true or false if there is a balcony on the property
    private boolean hasPool; // true or false if there is a balcony on the property
    private boolean hasBasement; // true or false if there is a balcony on the property
    private boolean hasAttic; // true or false if there is a balcony on the property
    private boolean hasParkingGarage; // true or false if there is a balcony on the property

    private int howGenerationalFriendly; // how generational friendly the house is, on a scale of 1 to 10, inclusive

    /**
     * Constructor from the MultiGenerational house
     *
     * @param address is the location of the property
     * @param price   is the cost of the property
     */
    public MultiGenerational(String address, int price) {
        super(address, price);
        //this.howGenerationalFriendly = howGenerationalFriendly;
    }


    /**
     * Get how generational friendly the multi-generational house is
     * @return how generational friendly
     */
    public int getHowGenerationalFriendly() {
        return howGenerationalFriendly;
    }

    /**
     * Set how generation friendly the house is
     * @param howGenerationalFriendly is how generation friendly the house is
     * @pre. 1 <= howGenerationalFriendly <= 10
     */
    public void setHowGenerationalFriendly(int howGenerationalFriendly) {
        this.howGenerationalFriendly = howGenerationalFriendly;
    }

    /**
     * Get how many full bathrooms on the property
     * @return number of full bathrooms
     */
    public int getNumFullBathroom() {
        return numFullBathroom;
    }

    /**
     * Set how many full bathrooms on the property
     * @param numFullBathroom is the number of full bathrooms
     * @pre. numFullBathroom >= 1
     */
    public void setNumFullBathroom(int numFullBathroom) {
        this.numFullBathroom = numFullBathroom;
    }

    /**
     * Get how many half bathrooms on the property
     * @return number of half bathrooms
     */
    public int getNumHalfBathroom() {
        return numHalfBathroom;
    }

    /**
     * Set how many half bathrooms on the property
     * @param numHalfBathroom is the number of half bathrooms
     * @pre. numHalfBathroom >= 0
     */
    public void setNumHalfBathroom(int numHalfBathroom) {
        this.numHalfBathroom = numHalfBathroom;
    }

    /**
     * Get how many bedrooms on the property
     * @return number of bedrooms
     */
    public int getNumBedroom() {
        return numBedroom;
    }

    /**
     * Set how many bedrooms on the property
     * @param numBedroom is the number of bedrooms
     * @pre. numBedroom >= 1
     */
    public void setNumBedroom(int numBedroom) {
        this.numBedroom = numBedroom;
    }

    /**
     * Get how many appliances on the property
     * @return number of appliances
     */
    public int getNumAppliances() {
        return numAppliances;
    }

    /**
     * Set how many appliances on the property
     * @param numAppliances is the number of full bathrooms
     * @pre. numAppliances >= 0
     */
    public void setNumAppliances(int numAppliances) {
        this.numAppliances = numAppliances;
    }

    /**
     * Get the list of appliances on the property
     * @return list of appliances
     */
    public ArrayList<String> getApplianceList() {
        return applianceList;
    }

    /**
     * Add an appliance on the property
     * @param appliance is the appliance that is being added to the property
     */
    public void addAppliance(String appliance) {
        applianceList.add(appliance);
    }

    /**
     * Remove the appliance of the property
     * @param appliance the appliance that is being added to the property
     */
    public void removeAppliance(String appliance) {
        applianceList.remove(appliance);
    }

    /**
     * Get if there is a balcony on the property
     * @return the boolean value for having a balcony or not
     */
    public boolean getHasBalcony() {
        return hasBalcony;
    }

    /**
     * Set if there is a balcony on the property
     * @param hasBalcony is the boolean value for having a balcony
     */
    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    /**
     * Get if there is a porch on the property
     * @return the boolean value for having a porch or not
     */
    public boolean getHasPorch() {
        return hasPorch;
    }

    /**
     * Set if there is a porch on the property
     * @param hasPorch is the boolean value for having a porch
     */
    public void setHasPorch(boolean hasPorch) {
        this.hasPorch = hasPorch;
    }

    /**
     * Get if there is a patio on the property
     * @return the boolean value for having a patio or not
     */
    public boolean getHasPatio() {
        return hasPatio;
    }

    /**
     * Set if there is a patio on the property
     * @param hasPatio is the boolean value for having a patio
     */
    public void setHasPatio(boolean hasPatio) {
        this.hasPatio = hasPatio;
    }

    /**
     * Get if there is a pool on the property
     * @return the boolean value for having a pool or not
     */
    public boolean getHasPool() {
        return hasPool;
    }

    /**
     * Set if there is a pool on the property
     * @param hasPool is the boolean value for having a pool
     */
    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    /**
     * Get if there is a basement on the property
     * @return the boolean value for having a basement or not
     */
    public boolean getHasBasement() {
        return hasBasement;
    }

    /**
     * Set if there is a basement on the property
     * @param hasBasement is the boolean value for having a basement
     */
    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    /**
     * Get if there is an attic on the property
     * @return the boolean value for having an attic or not
     */
    public boolean getHasAttic() {
        return hasAttic;
    }

    /**
     * Set if there is an attic on the property
     * @param hasAttic is the boolean value for having an attic
     */
    public void setHasAttic(boolean hasAttic) {
        this.hasAttic = hasAttic;
    }

    /**
     * Get if there is a parking garage on the property
     * @return the boolean value for having a parking garage or not
     */
    public boolean isHasParkingGarage() {
        return hasParkingGarage;
    }

    /**
     * Set if there is a parking garage on the property
     * @param hasParkingGarage is the boolean value for having a parking garage
     */
    public void setHasParkingGarage(boolean hasParkingGarage) {
        this.hasParkingGarage = hasParkingGarage;
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
        return super.toString() + "\nProperty Type: MultiGenerational{ " +
                "numFullBathroom= " + numFullBathroom +
                ", numHalfBathroom= " + numHalfBathroom +
                ", numBedroom= " + numBedroom +
                ", numAppliances= " + numAppliances +
                ", applianceList= " + applianceList +
                ", hasBalcony= " + hasBalcony +
                ", hasPorch= " + hasPorch +
                ", hasPatio= " + hasPatio +
                ", hasPool= " + hasPool +
                ", hasBasement= " + hasBasement +
                ", hasAttic= " + hasAttic +
                ", hasParkingGarage= " + hasParkingGarage +
                ", howGenerationalFriendly= " + howGenerationalFriendly +
                ", howGoodIsNeighborhood= " + howGoodIsNeighborhood +
                " }";
    }
}
