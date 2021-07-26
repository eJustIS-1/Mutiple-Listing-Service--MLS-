package com.company;



import java.util.UUID;

public class MultipleListingService {

    private UUID id;
    private String address;
    private int price;

    /**
     * Get the ID of the property
     * @return the UUID of the property
     */
    public UUID getId() {
        return id;
    }

    /**
     * Set the ID of the property
     * @param id the UUID of the property
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Get the address of the property
     * @return the address of the property
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the property
     * @param address of the property
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the price of the property
     * @return the price of the property
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set the price of the property
     * @param price of the property
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Constructor for the MLS record
     *
     * @param address is the location of the property
     * @param price is the cost of the property
     */
    public MultipleListingService(String address, int price) {
        this.address = address;
        this.price = price;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Listing Record Main Information{ " +
                "uuid= " + id +
                ", address= " + address +
                ", price= " + price +
                " }";
    }
}


