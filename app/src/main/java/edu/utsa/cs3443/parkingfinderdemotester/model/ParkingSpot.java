package edu.utsa.cs3443.parkingfinderdemotester.model;
/**
 * The ParkingSpot class holds the information for individual spots.
 * @author dwy249
 */
public class ParkingSpot {
    private boolean carParked;
    private int spotNumber;
    private int pricePerHour;
    public ParkingSpot(boolean carParked,int spotNumber)
    {
        /**
         * Constructor
         * @param carParked - is spot taken (boolean)
         * @param spotNumber - spotNumber (int)
         */
        this.carParked = carParked;
        this.spotNumber = spotNumber;
    }
    public void setCarParked(boolean carParked)
    {
        /**
         * sets the carParked variable
         * @param carParked - if there is a car parked at that spot(boolean)
         */
        this.carParked = carParked;
    }
    public void setSpotNumber(int spotNumber)
    {
        /**
         * sets the spot number
         * @param spotNumber - spot number(int)
         */
        this.spotNumber = spotNumber;
    }
    public boolean getCarParked()
    {
        /**
         * @returns if car is parked or not
         */
        return this.carParked;
    }
    public int getSpotNumber()
    {
        /**
         * @returns spot number
         */
        return this.spotNumber;
    }
    public void setPricePerHour(int pricePerHour)
    /**
     * sets the spot price
     * @param spotPrice - Price of the spot per hour(int)
     */
    {
        this.pricePerHour = pricePerHour;
    }
    public int getPricePerHour()
    {
        /**
         * @returns price per hour
         */
        return pricePerHour;
    }
    public String toString()
    {
        /**
         * @returns String representation of object
         */
        String temp = String.valueOf(spotNumber);
        return temp;
    }

}
