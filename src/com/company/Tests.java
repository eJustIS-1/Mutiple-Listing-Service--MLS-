package com.company;
import static org.junit.Assert.*;

import com.company.*;
import org.junit.Test;

public class Tests {


        /**
         * Test case for seeing singleton
         */
        @Test
        public void test1() {
            var si = Singleton.getInstance();

            /**
             * Construction of property record
             */
            MultiFamily m1 = new MultiFamily("1 JK Road",100);
            m1.setNumMainEntrances(1);
            m1.setNumHousingUnits(5);
            MultiPlex mp1 = new MultiPlex("2 JK Road",120);
            mp1.setNumHousingUnits(3);
            mp1.setMainEntrances(3);
            mp1.setLikeAnAptBuilding(false);
            MultiPlex mp2 = new MultiPlex("3 JK Road",150);
            mp2.setNumHousingUnits(4);
            mp2.setMainEntrances(4);
            mp2.setLikeAnAptBuilding(true);
            MultiGenerational mg1 = new MultiGenerational("4 JK Road",135);
            mg1.setHowGenerationalFriendly(8);
            Freehold f1 = new Freehold("5 JK Road", 200);
            f1.setLength(50);
            f1.setWidth(40);
            f1.setOpenLand(false);
            Freehold f2 = new Freehold("6 JK Road",210);
            f2.setLength(80);
            f2.setWidth(70);
            f2.setOpenLand(true);

            /**
             * Storing of each record in cache
             */
            si.storeCache(m1.getId(), m1);
            si.storeCache(mp1.getId(), mp1);
            si.storeCache(mp2.getId(), mp2);
            si.storeCache(mg1.getId(), mg1);
            si.storeCache(f1.getId(), f1);
            si.storeCache(f2.getId(), f2);

            /**
             * Getting the cache of each record
             */
            si.getCache(m1.getId());
            si.getCache(mp1.getId());
            si.getCache(mp2.getId());
            si.getCache(mg1.getId());
            si.getCache(f1.getId());
            si.getCache(f2.getId());

            /**
             * Shows all the cache stored at once
             */
            si.showAllCache();

            /**
             * The 2 records are deleted from the cache
             */
            si.deleteCache(m1.getId(), m1);
            si.deleteCache(f1.getId(), f1);

            /**
             * Getting the cache of each record again, but 2 of them are now deleted
             */
            si.getCache(m1.getId());
            si.getCache(mp1.getId());
            si.getCache(mp2.getId());
            si.getCache(mg1.getId());
            si.getCache(f1.getId());
            si.getCache(f2.getId());

            /**
             * Shows all the cache stored at once
             */
            si.showAllCache();

        }
    @Test
    public void test2() {
        var si = Singleton.getInstance();

        /**
         * Construction of property record
         */
        pptytest m1 = new pptytest("Multi Family" , "1 JK Road",100);
        m1.m.setNumMainEntrances(1);
        m1.m.setNumHousingUnits(5);
        pptytest mp1 = new pptytest("Multiplex", "2 JK Road",120);
        mp1.mp.setNumHousingUnits(3);
        mp1.mp.setMainEntrances(3);
        mp1.mp.setLikeAnAptBuilding(false);
        pptytest mp2 = new pptytest("Multiplex", "3 JK Road",150);
        mp2.mp.setNumHousingUnits(4);
        mp2.mp.setMainEntrances(4);
        mp2.mp.setLikeAnAptBuilding(true);
        pptytest mg1 = new pptytest("Multi Generational", "4 JK Road",135);
        mg1.mg.setHowGenerationalFriendly(8);
        pptytest f1 = new pptytest("Free Hold", "5 JK Road", 200);
        f1.f.setLength(50);
        f1.f.setWidth(40);
        f1.f.setOpenLand(false);
        pptytest f2 = new pptytest("Free Hold", "6 JK Road",210);
        f2.f.setLength(80);
        f2.f.setWidth(70);
        f2.f.setOpenLand(true);

        /**
         * Storing of each record in cache
         */
        si.storeCache(m1.m.getId(), m1.m);
        si.storeCache(mp1.mp.getId(), mp1.mp);
        si.storeCache(mp2.mp.getId(), mp2.mp);
        si.storeCache(mg1.mg.getId(), mg1.mp);
        si.storeCache(f1.f.getId(), f1.f);
        si.storeCache(f2.f.getId(), f2.f);

        /**
         * Getting the cache of each record
         */
        si.getCache(m1.m.getId());
        si.getCache(mp1.mp.getId());
        si.getCache(mp2.mp.getId());
        si.getCache(mg1.mg.getId());
        si.getCache(f1.f.getId());
        si.getCache(f2.f.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

        /**
         * The 2 records are deleted from the cache
         */
        si.deleteCache(m1.m.getId(), m1.m);
        si.deleteCache(f1.f.getId(), f1.f);

        /**
         * Getting the cache of each record again, but 2 of them are now deleted
         */
        si.getCache(m1.m.getId());
        si.getCache(mp1.mp.getId());
        si.getCache(mp2.mp.getId());
        si.getCache(mg1.mg.getId());
        si.getCache(f1.f.getId());
        si.getCache(f2.f.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

    }
    /**
     * Test case for {Town House, Semi Detatched house, Stacked town house, along with a little implementation
     * of singleton caching}
     */

    @Test
    public void test3(){
        var si = Singleton.getInstance();
        pptytest test1 = new pptytest("Rental House", "J-K st" , 110) ;
        test1.r.setBedRoomNumber(4);
        test1.r.setCoporateName("Kane Coop");
        assertEquals("This rental house is owned by Kane Coop and has 4 rooms and is priced at 110$" ,
                test1.r.getDescription());
        pptytest test2 = new pptytest("Town House", "j-k st", 210);
        test2.t.setDescription("Old look brings back the 1980's vibes, compact but spacious");
        test2.t.setCounty("derby");
        assertEquals("derby", test2.t.getCounty());
        pptytest test3 =  new pptytest("Semi Detached Homes", "K-l st" , 70) ;
        test3.sdh.settStatus(false);
        assertEquals(null,test3.sdh.getNeighbors());
        test3.sdh.settStatus(true);
        test3.sdh.setNeighbors("2 families");
        assertEquals("2 families" , test3.sdh.getNeighbors());


        si.storeCache(test2.t.getId(), test2.t);
        si.getCache(test2.t.getId());
        si.showAllCache();
        si.deleteCache(test2.t.getId(), test2.t);
        si.showAllCache();
    }


    /**
     * Test case for seeing singleton
     */
    @Test
    public void test4() {
        var si = Singleton.getInstance();

        /**
         * Construction of property record
         */
        Condominiums c1 = new Condominiums("1 JK Road",100);
        Detached d1 = new Detached("2 JK Road",120);
        Detached d2 = new Detached("3 JK Road",150);
        Farmhouse f1 = new Farmhouse("4 JK Road",135);
        CoopHomes cop1 = new CoopHomes("5 JK Road",200);
        CoopHomes cop2 = new CoopHomes("6 JK Road",210);

        /**
         * Storing of each record in cache
         */
        si.storeCache(c1.getId(), c1);
        si.storeCache(d1.getId(), d1);
        si.storeCache(d2.getId(), d2);
        si.storeCache(f1.getId(), f1);
        si.storeCache(cop1.getId(), cop1);
        si.storeCache(cop2.getId(), cop2);

        /**
         * Getting the cache of each record
         */
        si.getCache(c1.getId());
        si.getCache(d1.getId());
        si.getCache(d2.getId());
        si.getCache(f1.getId());
        si.getCache(cop1.getId());
        si.getCache(cop2.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

        /**
         * The 2 records are deleted from the cache
         */
        si.deleteCache(c1.getId(), c1);
        si.deleteCache(cop1.getId(), cop1);

        /**
         * Getting the cache of each record again, but 2 of them are now deleted
         */
        si.getCache(c1.getId());
        si.getCache(d1.getId());
        si.getCache(d2.getId());
        si.getCache(f1.getId());
        si.getCache(cop1.getId());
        si.getCache(cop2.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

    }

    @Test
    public void test5() {
        var si = Singleton.getInstance();

        /**
         * Construction of property record
         */
        pptytest c1 = new pptytest("Condominiums" , "1 JK Road",100);
        c1.con.setBuilder("Build Inc.");
        c1.con.setCondoName("Condo 1");
        pptytest d1 = new pptytest("Detached", "2 JK Road",120);
        d1.dt.setHeatingType("Air");
        d1.dt.setBathrooms(3);
        d1.dt.setHasPool(false);
        pptytest d2 = new pptytest("Detached", "3 JK Road",150);
        d2.dt.setHeatingType("Conventional");
        d2.dt.setBathrooms(4);
        d2.dt.setHasPool(true);
        pptytest f1 = new pptytest("Farmhouse", "4 JK Road",135);
        f1.fa.setFarmType("Aglicultural");
        pptytest cop1 = new pptytest("CoopHomes", "5 JK Road", 200);
        cop1.cop.setCorporateName("Coop1");
        cop1.cop.setBuildYear(1994);
        cop1.cop.setBedrooms(3);
        pptytest cop2 = new pptytest("CoopHomes", "6 JK Road",210);
        cop2.cop.setCorporateName("Coop2");
        cop2.cop.setBuildYear(1995);
        cop2.cop.setBedrooms(2);

        /**
         * Storing of each record in cache
         */
        si.storeCache(c1.con.getId(), c1.con);
        si.storeCache(d1.dt.getId(), d1.dt);
        si.storeCache(d2.dt.getId(), d2.dt);
        si.storeCache(f1.fa.getId(), f1.fa);
        si.storeCache(cop1.cop.getId(), cop1.cop);
        si.storeCache(cop2.cop.getId(), cop2.cop);

        /**
         * Getting the cache of each record
         */
        si.getCache(c1.con.getId());
        si.getCache(d1.dt.getId());
        si.getCache(d2.dt.getId());
        si.getCache(f1.fa.getId());
        si.getCache(cop1.cop.getId());
        si.getCache(cop2.cop.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

        /**
         * The 2 records are deleted from the cache
         */
        si.deleteCache(c1.con.getId(), c1.con);
        si.deleteCache(cop1.cop.getId(), cop1.cop);

        /**
         * Getting the cache of each record again, but 2 of them are now deleted
         */
        si.getCache(c1.con.getId());
        si.getCache(d1.dt.getId());
        si.getCache(d2.dt.getId());
        si.getCache(f1.fa.getId());
        si.getCache(cop1.cop.getId());
        si.getCache(cop2.cop.getId());

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

    }


    @Test
    public void test7() {
        var si = Singleton.getInstance();

        /**
         * Construction of property record
         */

        pptytest ps1 = new pptytest("Parking Spaces", "3 Ashwal st", 300);
        ps1.ps.setDuration(3);
        ps1.ps.setStatus(true);
        ps1.ps.setParkingType("Hourly");

        pptytest ps2 = new pptytest("Parking Spaces", "4 Ashwal st", 400);
        ps1.ps.setDuration(2);
        ps1.ps.setStatus(true);
        ps1.ps.setParkingType("Monthly");
        //////
        pptytest l1 = new pptytest("Land", "4 Keele st", 600);
        l1.l.setFeatures("This land is arid, 300 km squared, with no water bodies");

        pptytest l2 = new pptytest("Land", "5 Keele st", 300);
        l1.l.setFeatures("This land is coastal, 200 km squared, with few distrbuted lakes.");

        /////
        pptytest nc1  = new pptytest("New Constructions", "100 yonge", 100);
        nc1.nc.setExpenses(1000);
        nc1.nc.setFloornum(6);
        nc1.nc.setType("Condo Building");

        pptytest nc2  = new pptytest("New Constructions", "300 yonge", 100);
        nc2.nc.setExpenses(10000);
        nc2.nc.setFloornum(60);
        nc2.nc.setType("Head Quarters");
        ////
        pptytest ls1 = new pptytest("Lockers and Storage", "Yorku", 20);
        ls1.ls.setLeaseDuration(3);
        ls1.ls.setUnitType("Locker");
        ls1.ls.setStatus(true);

        pptytest ls2 = new pptytest("Lockers and Storage", "Ryerson", 30);
        ls2.ls.setLeaseDuration(0);
        ls2.ls.setUnitType("Locker");
        ls2.ls.setStatus(false);

        /**
         * Storing of each record in cache
         */

        si.storeCache(ps1.ps.getId(), ps1.ps);
        si.storeCache(ps2.ps.getId(), ps2.ps);

        si.storeCache(l1.l.getId(), l1.l);
        si.storeCache(l2.l.getId(), l2.l);

        si.storeCache(nc1.nc.getId(), nc1.nc);
        si.storeCache(nc2.nc.getId(), nc2.nc);

        si.storeCache(ls1.ls.getId(), ls1.ls);
        si.storeCache(ls2.ls.getId(), ls2.ls);

        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();

        /**
         * The 2 records are deleted from the cache
         */
        si.deleteCache(ps1.ps.getId(), ps1.ps);
        si.deleteCache(nc1.nc.getId(), nc1.nc);

        /**
         * Getting the cache of each record again, but 2 of them are now deleted
         */
        si.storeCache(ps1.ps.getId(), ps1.ps);
        si.storeCache(ps2.ps.getId(), ps2.ps);

        si.storeCache(l1.l.getId(), l1.l);
        si.storeCache(l2.l.getId(), l2.l);

        si.storeCache(nc1.nc.getId(), nc1.nc);
        si.storeCache(nc2.nc.getId(), nc2.nc);

        si.storeCache(ls1.ls.getId(), ls1.ls);
        si.storeCache(ls2.ls.getId(), ls2.ls);
        /**
         * Shows all the cache stored at once
         */
        si.showAllCache();
    }

    }
