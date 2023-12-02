package edu.utsa.cs3443.parkingfinderdemotester.model;
/**
 * The ParkingLot activity stores information for each parkingLot
 * @author dwy249
 */
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import edu.utsa.cs3443.parkingfinderdemotester.MainActivity;

public class ParkingLot {
    private ArrayList<ParkingSpot> Spots = new ArrayList<ParkingSpot>();
    private String lotName;
    private int lotPrice;
    public ParkingLot(String lotName)
    {
        /**
         * Constructor
         * @param lotName - Parking Lot name (String)
         */
        this.lotName = lotName;
    }
    public void setSpots(ArrayList<ParkingSpot> Spots)
    {
        /**
         * sets the arraylist of Spots
         * @param Spots - list of parkingSpots (ArrayList<ParkingSpot>)
         */
        this.Spots = Spots;
    }
    public void setLotName(String lotName)
    {
        /**
         * sets the lot name
         * @param lotName - Name of the lot(String)
         */
        this.lotName = lotName;
    }
    public void setLotPrice(int lotPrice)
    {
        /**
         * sets the lot price
         * @param lotPrice - Price of the lot per hour(int)
         */
        this.lotPrice = lotPrice;
    }
    public ArrayList<ParkingSpot> getSpots()
    {
        /**
         * @returns the arraylist Spots
         */
        return this.Spots;
    }
    public String getLotName()
    {
        /**
         * @returns the lot name
         */
        return lotName;
    }
    public int getLotPrice()
    {
        /**
         * @returns the lot price
         */
        return lotPrice;
    }
    public void loadSpots(MainActivity activity)
    {
        /**
         * Open each corresponding campus csv and loads data
         * @param activity - path to assets folder(MainActivity)
         */
        AssetManager manager = activity.getAssets();
        Scanner scan = null;
        String filename = lotName + ".csv";
        try {
            InputStream file = manager.open(filename);
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                ParkingSpot temp = new ParkingSpot(Boolean.parseBoolean(data[0]),Integer.valueOf(data[1]));
                Spots.add(temp);
            }
            scan.close();
        }
        catch (IOException e) { // handle exception }
        }
    }
    public String toString()
    {
        /**
         * @returns String representation of object
         */
        String temp = "";
        for(int i = 0; i < Spots.size();i++)
        {
            temp += "Spot Number: " + Spots.get(i).toString()+"\n";
        }
        return temp;
    }
}
