package com.company;

import java.util.ArrayList;

public class Condominiums extends MultipleListingService{
    //Variables of the condominiums class
    private String builder, condoName, heatingType; //Builder name, condo's name and the heating type in condos
    private int bathrooms, bedrooms, floors, buildYear, numOfParkingPlaces, condoFloorNum; // Integer variables of the condo
    private boolean hasBalcony, hasSecuritySystem, hasRvParking; // The features that condos have or not
    private ArrayList<String> listOfAdditionalInfo = new ArrayList<>(); // list of the additional info can be shown

    /** Constructor of the Condominium class
     *
     * @param address
     * @param price
     */
    public Condominiums(String address, int price){
        super(address, price);
    }

    /** Getter method of the Builder
     *
     * @return builder
     */
    public String getBuilder(){return builder;}

    /** Setter method of the Builder
     *
     * @param builder
     */
    public void setBuilder(String builder){
        this.builder = builder;
    }

    /** Getter method of the Condo name
     *
     * @return condoName
     */
    public String getCondoName(){return condoName;}

    /** Setter method of the condoName
     *
     * @param condoName
     */
    public void setCondoName(String condoName){
        this.condoName = condoName;
    }

    /** Getter method of the heating type
     *
     * @return heatingType
     */
    public String getHeatingType(){return heatingType;}

    /** Setter method of the heating type
     *
     * @param heatingType
     */
    public void setHeatingType(String heatingType){
        this.heatingType = heatingType;
    }

    /** Getter method of the list of additional info
     *
     * @return listOfAdditionalInfo
     */
    public ArrayList<String> getListOfAdditionalInfo(){return listOfAdditionalInfo;}

    /** Setter method of the listOfAdditionalInfo
     *
     * @param info
     */
    public void SetListOfAdditionalInfo(String info){listOfAdditionalInfo.add(info);}

    /** Getter method of the bathrooms
     *
     * @return bathrooms
     */
    public int getBathrooms(){return bathrooms;}

    /** Setter method of the bathrooms
     *
     * @param bathrooms
     */
    public void setBathrooms(int bathrooms){
        this.bathrooms = bathrooms;
    }

    /** Getter method of the bedrooms
     *
     * @return bedrooms
     */
    public int getBedrooms(){return bedrooms;}

    /** Setter method of the bedrooms
     *
     * @param bedrooms
     */
    public void setBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }

    /** Getter method of the floors
     *
     * @return floors
     */
    public int getFloors(){return floors;}

    /** Setter method of the floors
     *
     * @param floors
     */
    public void setFloors(int floors){
        this.floors = floors;
    }

    /** Getter method of the buildYear
     *
     * @return buildYear
     */
    public int getBuildYear(){return buildYear;}

    /** Setter method of the buildYear
     *
     * @param buildYear
     */
    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    /** Getter method of number of parking places
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

    /** Getter method of the condo's floor number
     *
     * @return condoFloorNum
     */
    public int getCondoFloorNum(){return condoFloorNum;}

    /** Setter method of the condo floor number
     *
     * @param condoFloorNum
     */
    public void setCondoFloorNum(int condoFloorNum){
        this.condoFloorNum = condoFloorNum;
    }

    /** Method to check condo has balcony or not
     *
     * @return hasBalcony
     */
    public boolean HasBalcony() { return hasBalcony;}

    /** Setter method of the balcony
     *
     * @param hasBalcony
     */
    public void setHasBalcony(boolean hasBalcony){
        this.hasBalcony = hasBalcony;
    }

    /** Method to check condo has security system or not
     *
     * @return hasSecuritySystemes
     */
    public boolean HasSecuritySystem() { return hasSecuritySystem;}

    /** Setter method of the security system
     *
     * @param hasSecuritySystem
     */
    public void setHasSecuritySystem(boolean hasSecuritySystem){
        this.hasSecuritySystem = hasSecuritySystem;
    }

    /** Method to check condo has rv parking or not
     *
     * @return hasRvParking
     */
    public boolean HasRvParking() { return hasRvParking;}

    /** Setter method of the rv parking
     *
     * @param hasRvParking
     */
    public void setHasRvParking(boolean hasRvParking){
        this.hasRvParking = hasRvParking;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Type: Condominiums {" +
                " builder" + builder +
                " condo name" + condoName +
                " heatingType" + heatingType +
                ", bathrooms" + bathrooms +
                ", bedrooms" + bedrooms +
                ", floors" + floors +
                ", number of parking places" + numOfParkingPlaces +
                ", build year" + buildYear +
                ", condo floor number" + condoFloorNum+
                ", has balcony" + hasBalcony+
                ", has security system" + hasSecuritySystem+
                ", has rv parking" + hasRvParking+
                ", list of additional info " + listOfAdditionalInfo + "}";
    }
}
