package com.company;


/*
A multifamily home is any residential property that contains
more than one housing unit, such as a duplex, a townhouse
or an apartment complex.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MultiFamily extends MultipleListingService implements Neighborhood{

    private int numHousingUnits; // number of housing units
    private int numMainEntrances; // can be 1 to enter the building and different doors within to specific living areas, or different entrances for each living area
    private ArrayList<String> applianceList = new ArrayList<>(); // list of appliances
    private int[][] housingEssentialInfo; /*
     * first [] is the number of housing units
     * second [] is the following list, in the same order:
     *      full bathroom, half bathroom, bedrooms, appliances
     */
    private boolean[][] housingAppearanceInfo; /*
     * first [] is the number of housing units
     * second [] is the following list, in the same order:
     *      hasBalcony, hasPorch, hasPatio, hasPool, hasBasement,
     *      hasAttic, hasParkingGarage
     */

    /**
     * Constructs a Multi-family House
     *
     * @param address is the location of the property
     * @param price is the cost of the property
     *  numHousingUnits is the number of living units in the construction
     * @pre. numHousingUnits >= 2
     *  numMainEntrances is the number of main entrances in the construction
     * @pre. numMainEntrances >= 1
     */
    public MultiFamily(String address, int price) {
        super(address, price);
       // this.numMainEntrances = numMainEntrances;
       // this.numHousingUnits = numHousingUnits;
        housingEssentialInfo = new int[numHousingUnits][4];
        housingAppearanceInfo = new boolean[numHousingUnits][7];
    }

    /**
     * Get the number of living units in the construction
     * @return number of living units
     */
    public int getNumHousingUnits() {
        return numHousingUnits;
    }

    /**
     * Set the number of living units in the construction
     * @param numHousingUnits is the number of living units
     * @pre. numHousingUnits >= 2
     */
    public void setNumHousingUnits(int numHousingUnits) {
        this.numHousingUnits = numHousingUnits;
    }

    /**
     * Gets the information of each housing unit, which includes how many full bathroom, half bathroom,
     * bedrooms, and appliances.
     * @return how many full bathroom, half bathroom, bedrooms, and appliances in each housing unit
     */
    public int[][] getHousingEssentialInfo() {
        return housingEssentialInfo;
    }

    /**
     * Set the number of full bathroom, half bathroom, bedroom, and appliances of a certain housing unit
     * @param housingUnitNum is the housing unit that the information is for
     * @pre. housingUnitNum >= 1
     * @param fullBathroom is the number of full bathrooms
     * @pre. fullBathroom >= 1
     * @param halfBathroom is the number of half bathrooms
     * @pre. halfBathroom >= 0
     * @param bedroom is the number of bedrooms
     * @pre. bedroom >= 1
     * @param appliances is the number of appliances
     * @pre. appliances >= 0
     */
    public void setHousingEssentialInfo(int housingUnitNum, int fullBathroom, int halfBathroom, int bedroom, int appliances) {
        this.housingEssentialInfo[housingUnitNum-1] = new int[]{fullBathroom, halfBathroom, bedroom, appliances};
    }

    /**
     * Get the number of full bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return the number of full bathrooms in the housing unit
     */
    public int getNumFullBathroom(int housingUnitNum) {
        return housingEssentialInfo[housingUnitNum-1][0];
    }

    /**
     * Set the number of full bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param numFullBathroom is the number of full bathrooms in the housing unit
     * @pre. numFullBathroom >= 1
     */
    public void setNumFullBathroom(int housingUnitNum, int numFullBathroom) {
        this.housingEssentialInfo[housingUnitNum-1][0] = numFullBathroom;
    }

    /**
     * Get the number of half bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return the number of half bathrooms in the housing unit
     */
    public int getNumHalfBathroom(int housingUnitNum) {
        return housingEssentialInfo[housingUnitNum-1][1];
    }

    /**
     * Set the number of full bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param numHalfBathroom is the number of full bathrooms in the housing unit
     * @pre. numHalfBathroom >= 0
     */
    public void setNumHalfBathroom(int housingUnitNum, int numHalfBathroom) {
        this.housingEssentialInfo[housingUnitNum-1][1] = numHalfBathroom;
    }

    /**
     * Get the number of bedrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return the number of bedrooms in the housing unit
     */
    public int getNumBedroom(int housingUnitNum) {
        return housingEssentialInfo[housingUnitNum-1][2];
    }

    /**
     * Set the number of full bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param numBedroom is the number of full bathrooms in the housing unit
     * @pre. numBedroom >= 1
     */
    public void setNumBedroom(int housingUnitNum, int numBedroom) {
        this.housingEssentialInfo[housingUnitNum-1][2] = numBedroom;
    }

    /**
     * Get the number of appliances of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return the number of appliances in the housing unit
     */
    public int getNumAppliances(int housingUnitNum) {
        return housingEssentialInfo[housingUnitNum-1][3];
    }

    /**
     * Set the number of full bathrooms of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param numAppliances is the number of full bathrooms in the housing unit
     * @pre. numAppliances >= 0
     */
    public void setNumAppliances(int housingUnitNum, int numAppliances) {
        this.housingEssentialInfo[housingUnitNum-1][3] = numAppliances;
    }

    /**
     * Get the number of main entrances in the construction
     * @return the number of main entrances
     */
    public int getNumMainEntrances() {
        return numMainEntrances;
    }

    /**
     * Set the number of main entrances in the construction
     * @param entrances is the number of main entrances
     * @pre. entrances >= 1
     */
    public void setNumMainEntrances(int entrances) {
        this.numMainEntrances = entrances;
    }

    /**
     * Get the appliances of the property
     * @return list of the appliances
     */
    public ArrayList<String> getApplianceList() {
        return applianceList;
    }

    /**
     * Add the appliance of the property
     * @param appliance the appliance that is being added to the property
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
     * Gets the appearance information of each housing unit
     * @return true or false hasBalcony, hasPorch, hasPatio, hasPool, hasBasement, hasAttic, hasParkingGarage
     */
    public boolean[][] getHousingAppearanceInfo() {
        return housingAppearanceInfo;
    }

    /**
     * Set if the certain appearances are found in a certain housing unit
     * @param housingUnitNum the living unit that the following is being set for
     * @param hasBalcony boolean value if it has a balcony or not
     * @param hasPorch boolean value if it has a porch or not
     * @param hasPatio boolean value if it has a patio or not
     * @param hasPool boolean value if it has a pool or not
     * @param hasBasement boolean value if it has a basement or not
     * @param hasAttic boolean value if it has an attic or not
     * @param hasParkingGarage boolean value if it has a parking garage or not
     */
    public void setHousingAppearanceInfo(int housingUnitNum, boolean hasBalcony, boolean hasPorch,
                                         boolean hasPatio, boolean hasPool, boolean hasBasement, boolean hasAttic,
                                         boolean hasParkingGarage) {
        this.housingAppearanceInfo[housingUnitNum-1] = new boolean[]{hasBalcony, hasPorch, hasPatio,
                hasPool, hasBasement, hasAttic, hasParkingGarage};
    }

    /**
     * Get the boolean value of balcony of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for balcony for the housing unit
     */
    public boolean getHasBalcony(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][0];
    }

    /**
     * Set the boolean value of balcony of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasBalcony is the boolean value for balcony for the housing unit
     */
    public void setHasBalcony(int housingUnitNum, boolean hasBalcony) {
        this.housingAppearanceInfo[housingUnitNum-1][0] = hasBalcony;
    }

    /**
     * Get the boolean value of porch of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for porch for the housing unit
     */
    public boolean getHasPorch(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][1];
    }

    /**
     * Set the boolean value of porch of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasPorch is the boolean value for porch for the housing unit
     */
    public void setHasPorch(int housingUnitNum, boolean hasPorch) {
        this.housingAppearanceInfo[housingUnitNum-1][1] = hasPorch;
    }

    /**
     * Get the boolean value of patio of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for patio for the housing unit
     */
    public boolean getHasPatio(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][2];
    }

    /**
     * Set the boolean value of patio of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasPatio is the boolean value for patio for the housing unit
     */
    public void setHasPatio(int housingUnitNum, boolean hasPatio) {
        this.housingAppearanceInfo[housingUnitNum-1][2] = hasPatio;
    }

    /**
     * Get the boolean value of pool of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for pool for the housing unit
     */
    public boolean getHasPool(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][3];
    }

    /**
     * Set the boolean value of pool of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasPool is the boolean value for pool for the housing unit
     */
    public void setHasPool(int housingUnitNum, boolean hasPool) {
        this.housingAppearanceInfo[housingUnitNum-1][3] = hasPool;
    }

    /**
     * Get the boolean value of basement of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for basement for the housing unit
     */
    public boolean getHasBasement(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][4];
    }

    /**
     * Set the boolean value of basement of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasBasement is the boolean value for basement for the housing unit
     */
    public void setHasBasement(int housingUnitNum, boolean hasBasement) {
        this.housingAppearanceInfo[housingUnitNum-1][4] = hasBasement;
    }

    /**
     * Get the boolean value of attic of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for attic for the housing unit
     */
    public boolean getHasAttic(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][5];
    }

    /**
     * Set the boolean value of attic of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasAttic is the attic value for pool for the housing unit
     */
    public void setHasAttic(int housingUnitNum, boolean hasAttic) {
        this.housingAppearanceInfo[housingUnitNum-1][5] = hasAttic;
    }

    /**
     * Get the boolean value of parking garage of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @return true or false for parking garage for the housing unit
     */
    public boolean getHasParkingGarage(int housingUnitNum) {
        return housingAppearanceInfo[housingUnitNum-1][6];
    }

    /**
     * Set the boolean value of parking garage of a specific housing unit
     * @param housingUnitNum is the housing unit being asked for
     * @pre. housingUnitNum >= 1
     * @param hasParkingGarage is the parking garage value for pool for the housing unit
     */
    public void setHasParkingGarage(int housingUnitNum, boolean hasParkingGarage) {
        this.housingAppearanceInfo[housingUnitNum-1][6] = hasParkingGarage;
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
        return super.toString() + "\nProperty Type: MultiFamily{ " +
                "numHousingUnits= " + numHousingUnits +
                ", numMainEntrances= " + numMainEntrances +
                ", housingEssentialInfo= " + Arrays.toString(housingEssentialInfo) +
                ", applianceList= " + applianceList +
                ", housingAppearanceInfo= " + Arrays.toString(housingAppearanceInfo) +
                ", howGoodIsNeighborhood= " + howGoodIsNeighborhood +
                " }";
    }
}
