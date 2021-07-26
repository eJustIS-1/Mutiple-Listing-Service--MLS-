package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Detached extends MultipleListingService{
    //Variables of the detached class
    private String heatingType; // heating type of the detached home
    private int bathrooms, bedrooms, floors, numOfParkingPlaces, lotArea; // integer variables of the detached class
    private boolean hasPorch, hasFinishedBasement, hasPool; // features that the detached home has or not
    private ArrayList<String> listOfAdditionalInfo = new ArrayList<>(); // list of additional info can be shown

    /** Constructor of the detached class
     *
     * @param address
     * @param price
     */
    public Detached(String address, int price){
        super(address, price);
    }

    /** Getter method of the heating type of detached home
     *
     * @return heatingType
     */
    public String getHeatingType(){return heatingType;}

    /** Setter method of heating type
     *
     * @param heatingType
     */
    public void setHeatingType(String heatingType){
        this.heatingType = heatingType;
    }

    /** Getter method of list additional info
     *
     * @return listOfAdditionalInfo
     */
    public ArrayList<String> getListOfAdditionalInfo(){return listOfAdditionalInfo;}

    /** Setter method of list of additional info
     *
     * @param info
     */
    public void SetListOfAdditionalInfo(String info){listOfAdditionalInfo.add(info);}

    /** Getter method of bathrooms
     *
     * @return bathrooms
     */
    public int getBathrooms(){return bathrooms;}

    /** Setter method of bathrooms
     *
     * @param bathrooms
     */
    public void setBathrooms(int bathrooms){
        this.bathrooms = bathrooms;
    }

    /** Getter method of bedrooms
     *
     * @return bedrooms
     */
    public int getBedrooms(){return bedrooms;}

    /** Setter method of bedrooms
     *
     * @param bedrooms
     */
    public void setBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }

    /** Getter method of floors
     *
     * @return floors
     */
    public int getFloors(){return floors;}

    /** Setter method of floors
     *
     * @param floors
     */
    public void setFloors(int floors){
        this.floors = floors;
    }

    /** Getter method of number of parking places
     *
     * @return numOfParkingPlaces
     */
    public int getNumOfParkingPlaces(){return numOfParkingPlaces;}

    /** Setter method of number of parking places
     *
     * @param numOfParkingPlaces
     */
    public void setNumOfParkingPlaces(int numOfParkingPlaces){
        this.numOfParkingPlaces = numOfParkingPlaces;
    }

    /** Getter method of lot area of the house
     *
     * @return lotArea
     */
    public int getLotArea(){return lotArea;}

    /** Setter method of lot area
     *
     * @param lotArea
     */
    public void setLotArea(int lotArea){
        this.lotArea = lotArea;
    }

    /** Method to check has porch or not
     *
     * @return hasPorch
     */
    public boolean HasPorch() { return hasPorch;}

    /** Setter method of hasPorch
     *
     * @param hasPorch
     */
    public void setHasPorch(boolean hasPorch){
        this.hasPorch = hasPorch;
    }

    /** Method to check has finished basement or not
     *
     * @return hasFinishedBasement
     */
    public boolean HasFinishedBasement() { return hasFinishedBasement;}

    /** Setter method of hasFinishedBasement
     *
     * @param hasFinishedBasement
     */
    public void setHasFinishedBasement(boolean hasFinishedBasement){
        this.hasFinishedBasement = hasFinishedBasement;
    }

    /** Method to check has pool or not
     *
     * @return hasPool
     */
    public boolean HasPool() { return hasPool;}

    /** Setter method of hasPool
     *
     * @param hasPool
     */
    public void setHasPool(boolean hasPool){
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Type: Detached {" +
                " heatingType" + heatingType +
                ", bathrooms" + bathrooms +
                ", bedrooms" + bedrooms +
                ", floors" + floors +
                ", number of parking places" + numOfParkingPlaces +
                ", lot area" + lotArea +
                ", has pool" + hasPool+
                ", has finished basement" + hasFinishedBasement+
                ", has porch" + hasPorch+
                ", list of additional info " + listOfAdditionalInfo + "}";
    }
}
