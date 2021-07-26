package com.company;

/*
        A duplex, triplex, and fourplex homes come in various
        shapes and configurations. The difference is the number
        of families the structure is designed to hold and how
        many dedicated entrances it has. The whole property parcel
        is deeded with two, three, or four living units

        A duplex refers to a properly designed for two separate
        families. Sometimes it is called a “twin home,” as
        sometimes the layouts are mirror images, but this is
        erroneous. A duplex is actually one building with two
        living units. The arrangement does not matter. The two
        units could be side by side or one on top of the other.

        To qualify as a duplex, each unit must have a separate
        entrance, kitchen, bathroom, and utility meters.
        Each unit has the same amenities you’d find in a
        typical single-family home.

        By extension, a triplex is a building with three separate
        living units and a fourplex or a quadplex has four
        separate living units.
        */


public class MultiPlex extends MultiFamily{

    private boolean likeAnAptBuilding; // if it is like an apartment and not a like semi-detached house or something
    private int numFloors; // the number of floors excluding basement and attic if is has

    /**
     * Constructs a MultiPlex house (either duplex, triplex or quadruplex)
     *
     * @param address is the location of the property
     * @param price is the cost of the property
     * numHousingUnits is the number of living units in the multiplex house
     * @pre. 2 <= numHousingUnits <= 4
     * @note. numMainEntrances is the number of entrances, which should equal the number of living units,
     *                         because each living unit has its own entrance in a multiplex
     *  likeAnAptBuilding is if the multiplex looks like a small apartment building
     */
    public MultiPlex(String address, int price) {
        super(address, price);
       // this.likeAnAptBuilding = likeAnAptBuilding;
       /* if(this.likeAnAptBuilding == true){
            this.numFloors = numHousingUnits;
        }
        this.setNumHousingUnits(numHousingUnits);
        this.setNumMainEntrances(numHousingUnits);
        */
    }

    public void setNumFloors(int numFloors) {
        if(this.likeAnAptBuilding){
            this.numFloors = numFloors;
        }
    }
    public void setMainEntrances(int Entrances){
        this.setNumMainEntrances(Entrances);
    }

    public void setLikeAnAptBuilding(boolean bl){
        this.likeAnAptBuilding = bl;
    }

    public int getNumFloors() {
        return numFloors;
    }

    @Override
    public String toString() {
        String type = "";
        if(getNumHousingUnits() == 2){ type = "Duplex"; }
        else if(getNumHousingUnits() == 3){ type = "Triplex"; }
        else if(getNumHousingUnits() == 4){ type = "Quadruple"; }

        String show = super.toString() + "\nSpecifically a MultiPlex{ " ;

        if(likeAnAptBuilding == true) {
            show += "type= " + type +
                    ", likeAnAptBuilding= " + likeAnAptBuilding +
                    ", numFloors=" + numFloors +
                    " }";
        }
        else{
            show += "type= " + type +
                    " }";
        }
        return show;
    }
}

