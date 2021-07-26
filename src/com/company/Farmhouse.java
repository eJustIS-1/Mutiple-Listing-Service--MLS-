package com.company;

import java.util.ArrayList;


public class Farmhouse extends MultipleListingService {
    //Variables of the FarmhHouse Class

    private String heatingType, farmType; //Type of heating that is used, and the farm type of the farmhouse like "Aglicultural"
    private int bathrooms, bedrooms, floors, buildYear, numOfParkingPlaces; // Integer variables of the farm house
    private boolean hasPool, hasSauna, hasFinishedBasement; // The features that the farm house have or not
    private ArrayList<String> listOfAdditionalInfo = new ArrayList<>(); //Additional info that can be shown with farmhouse


    /**Constructor of the FarmHouse class which links to the Super class "MLS services"
     *
     * @param address
     * @param price
     */
    public Farmhouse(String address, int price){
        super(address, price);
    }

    /** Getter method of the Heating type
     *
     * @return heatingType
     */
    public String getHeatingType(){return heatingType;}

    /**Setter method of the Heating type
     *
     * @param heatingType
     */
    public void setHeatingType(String heatingType){
        this.heatingType = heatingType;
    }

    /**Getter method of the farm type
     *
     * @return farmType
     */
    public String getFarmType(){return farmType;}

    /**Setter Method of the Farm type
     *
     * @param farmType
     */
    public void setFarmType(String farmType){
        this.farmType = farmType;
    }

    /**Getter method of the List of additional info
     *
     * @return listOfAdditionalInfo
     */
    public ArrayList<String> getListOfAdditionalInfo(){return listOfAdditionalInfo;}

    /**Setter method of the list of additional info
     *
     * @param info
     */
    public void SetListOfAdditionalInfo(String info){listOfAdditionalInfo.add(info);}

    /**Getter method of the bathrooms
     *
     * @return bathrooms
     */
    public int getBathrooms(){return bathrooms;}

    /**Setter method of the bathrooms
     *
     * @param bathrooms
     */
    public void setBathrooms(int bathrooms){
        this.bathrooms = bathrooms;
    }

    /**Getter method of the bedrooms
     *
     * @return bedrooms
     */
    public int getBedrooms(){return bedrooms;}

    /**Setter method of bedrooms
     *
     * @param bedrooms
     */
    public void setBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }

    /**Getter method of the floor
     *
     * @return floors
     */
    public int getFloors(){return floors;}

    /**Setter method of the floors
     *
     * @param floors
     */
    public void setFloors(int floors){
        this.floors = floors;
    }

    /** Getter method of the build year
     *
     * @return buildYear
     */
    public int getBuildYear(){return buildYear;}

    /** Setter method of the build year
     *
     * @param buildYear
     */
    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    /**Getter method od the number of parking places
     *
     * @return numOfParkingPlaces
     */
    public int getNumOfParkingPlaces(){return numOfParkingPlaces;}

    /** Setter method of the number of parking places
     *
     * @param numOfParkingPlaces
     */
    public void setNumOfParkingPlaces(int numOfParkingPlaces){
        this.numOfParkingPlaces = numOfParkingPlaces;
    }

    /** Method to check has pool or not
     *
     * @return hasPool
     */
    public boolean HasPool() { return hasPool;}

    /** Setter method of the hasPool
     *
     * @param hasPool
     */
    public void setHasPool(boolean hasPool){
        this.hasPool = hasPool;
    }

    /** Method to check has sauna or not
     *
     * @return hasSauna
     */
    public boolean HasSauna() { return hasSauna;}

    /** Setter method of the has sauna
     *
     * @param hasSauna
     */
    public void setHasSauna(boolean hasSauna){
        this.hasSauna = hasSauna;
    }

    /** Method to check has finished basement or not
     *
     * @return hasFinishedBasement
     */
    public boolean HasFinishedBasement() { return hasFinishedBasement;}

    /** Setter method of the hasfinishedbasement
     *
     * @param hasFinishedBasement
     */
    public void setHasFinishedBasement(boolean hasFinishedBasement){
        this.hasFinishedBasement = hasFinishedBasement;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Type: Detached {" +
                " heatingType" + heatingType +
                " farmType" + farmType +
                ", bathrooms" + bathrooms +
                ", bedrooms" + bedrooms +
                ", floors" + floors +
                ", number of parking places" + numOfParkingPlaces +
                ", buildYear" + buildYear +
                ", has pool" + hasPool+
                ", has finished basement" + hasFinishedBasement+
                ", has sauna" + hasSauna+
                ", list of additional info " + listOfAdditionalInfo + "}";
    }
}
