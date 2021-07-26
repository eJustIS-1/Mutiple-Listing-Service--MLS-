package com.company;

public class semiDetachedHomes extends MultipleListingService {
    /**
     *
     * @param address
     * @param price
     */
    public semiDetachedHomes(String address, int price) {
        super(address, price);
    }
    //Semi-Detached Homes will have a common wall, so..
    /**
     * @param Neighbours
     * @param Status
     */
    private String Neighbors;
    private boolean Status;

    /**
     *
     * @param Neighbours
     */
    public void setNeighbors(String Neighbours){
        if(this.Status){
            this.Neighbors = Neighbours;
        }
    }

    /**
     *
     * @return Neighbours
     */
    public String getNeighbors(){
        return this.Neighbors;
    }

    /**
     *
     * @param Status
     */
    public void settStatus(boolean Status){
        this.Status = Status ;
    }

    /**
     *
     * @return status
     */
    public boolean getStatus(){
        return this.Status ;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Property Type: SemiDetached Homes{ "
                + " Status: " + this.getStatus()
                + "; Neighbors: " + this.getNeighbors()
                + " }" ;
    }

}
