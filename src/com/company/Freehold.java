package com.company;

/*
The freeholder of a property owns it outright, including
the land it's built on. If you buy a freehold, you're
responsible for maintaining your property and land, so
you'll need to budget for these costs. Most houses are
freehold but some might be leasehold – usually through
shared-ownership schemes.
 */

import java.util.Arrays;

public class Freehold extends MultipleListingService implements Neighborhood{

    private int length;//Length of property in meters
    private int width;//Width of property in meters
    private boolean isOpenLand;
    private boolean[] onLand;

    /**
     * Constructor for Freehold property
     *
     * @param address is the location of the property
     * @param price   is the cost of the property
     *
     */
    public Freehold(String address, int price) {
        super(address, price);
       // this.length = length;
        //this.width = width;
        //this.isOpenLand = isOpenLand;
        if(this.isOpenLand == false){
            onLand = new boolean[4];
        }
    }


    /**
     * Get the length of the property
     * @return length of property
     */
    public int getLength() {
        return length;
    }

    /**
     * Set the length of the property
     *  length is the length in metres
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Get the width of the property
     * @return width of property
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the width of the property
     *  width is the width in metres
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Get if the land is open
     * @return the boolean value if there is something on the land (as in it already has a purpose)
     */
    public boolean isOpenLand() {
        return isOpenLand;
    }

    /**
     * Set if the land is open
     * @param openLand is the boolean value of the land being open or not
     */
    public void setOpenLand(boolean openLand) {
        isOpenLand = openLand;
    }

    /**
     * Get what is on the land
     * @return what is on the land
     */
    public boolean[] getOnLand() {
        return onLand;
    }

    /**
     * Set what is on the land
     * @param hasResidentialBuildings is the boolean value for the land having a residential building
     * @param hasCommercialBuildings is the boolean value for the land having a commercial building
     * @param hasParkingLot is the boolean value for the land having a parking lot
     * @param forAgriculture is the boolean value for the land in use for agriculture
     */
    public void setOnLand(boolean hasResidentialBuildings, boolean hasCommercialBuildings, boolean hasParkingLot, boolean forAgriculture) {
        this.onLand = new boolean[]{hasResidentialBuildings, hasCommercialBuildings, hasParkingLot, forAgriculture};
    }

    /**
     * Get if there is a residential building on the land
     * @return the boolean value for having a residential building or not
     */
    public boolean getHasResidentialBuildings() {
        return onLand[0];
    }

    /**
     * Set if there is a residential building on the land
     * @param hasResidentialBuildings is the boolean value for the land having a residential building
     */
    public void setHasResidentialBuildings(boolean hasResidentialBuildings) {
        this.onLand[0] = hasResidentialBuildings;
    }

    /**
     * Get if there is a commercial building on the land
     * @return the boolean value for having a commercial building or not
     */
    public boolean getHasCommercialBuildings() {
        return onLand[1];
    }

    /**
     * Set if there is a commercial building on the land
     * @param hasCommercialBuildings is the boolean value for the land having a commercial building
     */
    public void setHasCommercialBuildings(boolean hasCommercialBuildings) {
        this.onLand[1] = hasCommercialBuildings;
    }

    /**
     * Get if there is a parking lot on the land
     * @return the boolean value for having a parking lot or not
     */
    public boolean getHasParkingLot() {
        return onLand[2];
    }

    /**
     * Set if there is a parking lot on the land
     * @param hasParkingLot is the boolean value for the land having a parking lot
     */
    public void setHasParkingLot(boolean hasParkingLot) {
        this.onLand[2]= hasParkingLot;
    }

    /**
     * Get if the land is being used for agricultural purposes
     * @return the boolean value for the land is being used for agricultural purposes
     */
    public boolean isForAgriculture() {
        return onLand[3];
    }

    /**
     * Set if the land is being used for agricultural purposes
     * @param forAgriculture is the boolean value for the land is being used for agricultural purposes
     */
    public void setForAgriculture(boolean forAgriculture) {
        this.onLand[3] = forAgriculture;
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
        String show = super.toString() + "\n Property Type: Freehold{ " +
                "length=" + length +
                ", width=" + width +
                ", howGoodIsNeighborhood= " + howGoodIsNeighborhood;

        if(isOpenLand == true) {
            show += ", isOpenLand=" + isOpenLand + " }";
        }
        else{
            show += ", isOpenLand=" + isOpenLand +
                    ", onLand=" + Arrays.toString(onLand) +
                    " }";
        }

        return show;
    }
}
