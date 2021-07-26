package com.company;

import java.util.ArrayList;


public class CoopHomes extends MultipleListingService{
    //Variables of CoopHomes class
    private String corporateName; //Name of the corporate
    private int bathrooms, bedrooms, buildYear; // integer variables of coop home class
    private ArrayList<String> ownerList = new ArrayList<>(); // list of owners of the house

    /** Constructor of the Coop Homes class
     *
     * @param address
     * @param price
     */
    public CoopHomes(String address, int price){
        super(address, price);
    }

    /** Getter method of the Owner List
     *
     * @return ownerList
     */
    public ArrayList<String> getOwnerList(){return ownerList;}

    /** Setter method of the Owner List
     *
     * @param owner
     */
    public void SetOwnerList(String owner){ownerList.add(owner);}

    /** Getter method of the CorporateName
     *
     * @return corporateName
     */
    public String getCorporateName(){return corporateName;}

    /** Setter method of the corporate name
     *
     * @param corporateName
     */
    public void setCorporateName(String corporateName){
        this.corporateName = corporateName;
    }

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

    /** Getter method of buildYear
     *
     * @return buildYear
     */
    public int getBuildYear(){return buildYear;}

    /** Setter method of buildYear
     *
     * @param buildYear
     */
    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Type: Co-Op Home{" +
                " corporateName" + corporateName +
                ", bathrooms" + bathrooms +
                ", bedrooms" + bedrooms +
                ", owner list" + ownerList + "}";
    }


}
