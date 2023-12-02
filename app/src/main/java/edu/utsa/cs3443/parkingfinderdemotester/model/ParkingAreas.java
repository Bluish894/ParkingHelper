package edu.utsa.cs3443.parkingfinderdemotester.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import edu.utsa.cs3443.parkingfinderdemotester.MainActivity;
/**
 * The ParkingAreas class manages info for all the parking lots
 * @author dwy249
 */
public class ParkingAreas
{
    private ArrayList<ParkingLot> Lots = new ArrayList<ParkingLot>();
    public void setLots(ArrayList<ParkingLot> Lots)
    {
        /**
         * sets the arraylist of lots
         * @param lots - list of parkingLots (ArrayList<ParkingLot>)
         */
        this.Lots = Lots;
    }
    public ArrayList<ParkingLot> getLots()
    {
        /**
         * @returns the arraylist lots
         */
        return Lots;
    }
    public void LoadLots(MainActivity activity)
    {
        /**
         * Open lots.csv and loads the data
         * @param activity - path to assets folder(MainActivity)
         */
        AssetManager manager = activity.getAssets();
        Scanner scan = null;
        String filename = "Lots.csv";
        try
        {
            InputStream file = manager.open(filename);
            scan = new Scanner(file);
            while (scan.hasNextLine())
            {
                String line = scan.nextLine();
                String[] data = line.split(",");
                ParkingLot temp = new ParkingLot(data[0]);
                temp.loadSpots(activity);
                temp.setLotPrice(Integer.valueOf(data[1]));
                Lots.add(temp);
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
        for(int i = 0; i < Lots.size();i++)
        {
            temp += "Lot " + String.valueOf(i) + ": + Lots.get(i).toString()"+"\n";
        }
        return temp;
    }
}
