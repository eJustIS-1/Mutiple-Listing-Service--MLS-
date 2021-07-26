package com.company;

public class stackedTownHouses extends townHouse {

    private int floorNumber;
    private String mobility;
    private String outDoorSpace;


    public stackedTownHouses(String address, int price) {
        super(address, price);
    }

    /**
     *
     * @return the floor number
     */
    public int getFloorNumber(){
        return this.floorNumber ;
    }
    /**
     *
     * @param floorNumber floor number
     */
    public void setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber ;
    }

    /**
     *
     * @return mobility
     */

    public String getMobility(){
        return this.mobility ;
    }

    /**
     *
     * @param mobility
     */
    public void setMobility(String mobility){
        this.mobility = mobility;
    }

    /**
     *
     * @return outDoor space-- meaning being the view!
     */

    public String getOutDoorSpace(){
        return this.outDoorSpace ;
    }

    /**
     *
     * @param outDoorSpace
     */
    public void setOutDoorSpace(String outDoorSpace){
        this.outDoorSpace =  outDoorSpace;
    }
    @Override
    public String toString(){
        return super.toString() +  "\n Property Type: Stacked Town house{ "
                + " Floor number: " + this.getFloorNumber()
                +"; Mobility: " + this.getMobility()
                + "; Out Doorspace: " + this.getOutDoorSpace()
                + " }" ;
    }

}
