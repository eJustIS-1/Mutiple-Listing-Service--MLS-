package com.company;

public class pptytest {
    String type ;//Get the type from user input(Virtually)
    RentalHouse r;//For Rental house class
    townHouse t;//For town house
    semiDetachedHomes sdh;//For SemiDetachedHouse
    stackedTownHouses sth;//For Stached town house
    Freehold f;
    MultiFamily m;
    MultiGenerational mg;
    MultiPlex mp;
    Farmhouse fa;
    Condominiums con;
    CoopHomes cop;
    Detached dt;
    highvaluehomes hv ;
    ParkingSpaces ps;
    Land l;
    NewConstructions nc;
    LockersandStorage ls;

    

    /**
     *
     * @param type
     * @param address
     * @param price
     */

    public pptytest(String type, String address, int price){
        this.type = type ;
        if(this.type.equals("Rental House")){
            r = new RentalHouse(address, price);
        }
        else if(this.type.equals("Town House")){
            t = new townHouse(address, price);
        }else if(this.type.equals("Semi Detached Homes")){
            sdh = new semiDetachedHomes(address, price);
        }else if(this.type.equals("Stacked Town Houses")){
            sth = new stackedTownHouses(address, price) ;
        }else if(this.type.equals("Free Hold")){
            f = new Freehold(address, price) ;
        }else if(this.type.equals("Multi Family")){
            m = new MultiFamily(address, price);
        }
        else if(this.type.equals("Multi Generational")){
            mg = new MultiGenerational(address, price) ;
        }else if(this.type.equals("Multiplex")){
            mp = new MultiPlex(address, price) ;
        } else if(this.type.equals("Farmhouse")){
            fa = new Farmhouse(address, price) ;
        }
        else if(this.type.equals("Condominiums")){
            con = new Condominiums(address, price) ;
        }
        else if(this.type.equals("Detached")){
            dt = new Detached(address, price) ;
        }
        else if(this.type.equals("CoopHomes")){
            cop = new CoopHomes(address, price) ;
        }else if(this.type.equals("High Value")){
            hv = new highvaluehomes(address, price) ;
        }else if(this.type.equals("Land")){
            l = new Land(address, price) ;
        }
        else if(this.type.equals("Lockers and Storage")){
            ls = new LockersandStorage(address, price) ;
        }
        else if(this.type.equals("Parking Spaces")){
            ps = new ParkingSpaces(address, price) ;
        }
        else if(this.type.equals("New Constructions")){
            nc = new NewConstructions(address, price) ;
        }
    }
    public String getTypes(){
        return type ;
    }



}
