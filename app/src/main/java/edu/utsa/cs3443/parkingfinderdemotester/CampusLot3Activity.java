package edu.utsa.cs3443.parkingfinderdemotester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
/**
 * The CampusLot3Activity manages the third parking lot
 * @author dwy249
 */
public class CampusLot3Activity extends AppCompatActivity implements View.OnClickListener{

    boolean status;
    int size = 18;
    boolean change = false;
    int Id = 0;
    boolean parked1;
    boolean parked2;
    boolean parked3;
    boolean parked4;
    boolean parked5;
    boolean parked6;
    boolean parked7;
    boolean parked8;
    boolean parked9;
    boolean parked10;
    boolean parked11;
    boolean parked12;
    boolean parked13;
    boolean parked14;
    boolean parked15;
    boolean parked16;
    boolean parked17;
    boolean parked18;
    boolean parked19;
    boolean parked20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Creates and loads parking lot
         */
        boolean r = getIntent().getBooleanExtra("reserved", false);
        if(r)
        {
            Id = getIntent().getIntExtra("Spot",0);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_lot3);
        status = getIntent().getBooleanExtra("Status", false);
        parked1 = getIntent().getBooleanExtra("Parked0", false);
        parked2 = getIntent().getBooleanExtra("Parked1", false);
        parked3 = getIntent().getBooleanExtra("Parked2", false);
        parked4 = getIntent().getBooleanExtra("Parked3", false);
        parked5 = getIntent().getBooleanExtra("Parked4", false);
        parked6 = getIntent().getBooleanExtra("Parked5", false);
        parked7 = getIntent().getBooleanExtra("Parked6", false);
        parked8 = getIntent().getBooleanExtra("Parked7", false);
        parked9 = getIntent().getBooleanExtra("Parked8", false);
        parked10 = getIntent().getBooleanExtra("Parked9", false);
        parked11 = getIntent().getBooleanExtra("Parked10", false);
        parked12 = getIntent().getBooleanExtra("Parked11", false);
        parked13 = getIntent().getBooleanExtra("Parked12", false);
        parked14 = getIntent().getBooleanExtra("Parked13", false);
        parked15 = getIntent().getBooleanExtra("Parked14", false);
        parked16 = getIntent().getBooleanExtra("Parked15", false);
        parked17 = getIntent().getBooleanExtra("Parked16", false);
        parked18 = getIntent().getBooleanExtra("Parked17", false);
        parked19 = getIntent().getBooleanExtra("Parked18", false);
        parked20 = getIntent().getBooleanExtra("Parked19", false);
        ImageButton imageButton1;
        imageButton1 = findViewById(R.id.imageButton34);
        imageButton1 = Parked(imageButton1,parked1);
        setupImageButton(R.id.imageButton34);
        parked1 = setChange(parked1);
        ImageButton imageButton2;
        imageButton2 = findViewById(R.id.imageButton35);
        imageButton2 = Parked(imageButton2,parked2);
        setupImageButton(R.id.imageButton35);
        parked2 = setChange(parked2);
        ImageButton imageButton3;
        imageButton3 = findViewById(R.id.imageButton36);
        imageButton3 = Parked(imageButton3,parked3);
        setupImageButton(R.id.imageButton36);
        parked3 = setChange(parked3);
        ImageButton imageButton4;
        imageButton4 = findViewById(R.id.imageButton37);
        imageButton4 = Parked(imageButton4,parked4);
        setupImageButton(R.id.imageButton37);
        parked4 = setChange(parked4);
        ImageButton imageButton5;
        imageButton5 = findViewById(R.id.imageButton38);
        imageButton5 = Parked(imageButton5,parked5);
        setupImageButton(R.id.imageButton38);
        parked5 = setChange(parked5);
        ImageButton imageButton6;
        imageButton6 = findViewById(R.id.imageButton39);
        imageButton6 = Parked(imageButton6,parked6);
        setupImageButton(R.id.imageButton39);
        parked6 = setChange(parked6);
        ImageButton imageButton7;
        imageButton7 = findViewById(R.id.imageButton40);
        imageButton7 = Parked(imageButton7,parked7);
        setupImageButton(R.id.imageButton40);
        parked7 = setChange(parked7);
        ImageButton imageButton8;
        imageButton8 = findViewById(R.id.imageButton41);
        imageButton8 = Parked(imageButton8,parked8);
        setupImageButton(R.id.imageButton41);
        parked8 = setChange(parked8);
        ImageButton imageButton9;
        imageButton9 = findViewById(R.id.imageButton42);
        imageButton9 = Parked(imageButton9,parked9);
        setupImageButton(R.id.imageButton42);
        parked9 = setChange(parked9);
        ImageButton imageButton10;
        imageButton10 = findViewById(R.id.imageButton43);
        imageButton10 = Parked(imageButton10,parked10);
        setupImageButton(R.id.imageButton43);
        parked10 = setChange(parked10);
        ImageButton imageButton11;
        imageButton11 = findViewById(R.id.imageButton44);
        imageButton11 = Parked(imageButton11,parked11);
        setupImageButton(R.id.imageButton44);
        parked11 = setChange(parked11);
        ImageButton imageButton12;
        imageButton12 = findViewById(R.id.imageButton45);
        imageButton12 = Parked(imageButton12,parked12);
        setupImageButton(R.id.imageButton45);
        parked12 = setChange(parked12);
        ImageButton imageButton13;
        imageButton13 = findViewById(R.id.imageButton46);
        imageButton13 = Parked(imageButton13,parked13);
        setupImageButton(R.id.imageButton46);
        parked13 = setChange(parked13);
        ImageButton imageButton14;
        imageButton14 = findViewById(R.id.imageButton47);
        imageButton14 = Parked(imageButton14,parked14);
        setupImageButton(R.id.imageButton47);
        parked14 = setChange(parked14);
        ImageButton imageButton15;
        imageButton15 = findViewById(R.id.imageButton48);
        imageButton15 = Parked(imageButton15,parked15);
        setupImageButton(R.id.imageButton48);
        parked15 = setChange(parked15);
        ImageButton imageButton;
        imageButton = findViewById(R.id.imageButton49);
        imageButton = Parked(imageButton,parked16);
        setupImageButton(R.id.imageButton49);
        parked16 = setChange(parked16);
        ImageButton imageButton17;
        imageButton17 = findViewById(R.id.imageButton50);
        imageButton17 = Parked(imageButton17,parked17);
        setupImageButton(R.id.imageButton50);
        parked17 = setChange(parked17);
        ImageButton imageButton18;
        imageButton18 = findViewById(R.id.imageButton51);
        imageButton18 = Parked(imageButton18,parked18);
        setupImageButton(R.id.imageButton51);
        parked18 = setChange(parked18);
        ImageButton imageButton19;
        imageButton19 = findViewById(R.id.imageButton52);
        imageButton19 = Parked(imageButton19,parked19);
        setupImageButton(R.id.imageButton52);
        parked19 = setChange(parked19);
        ImageButton imageButton20;
        imageButton20 = findViewById(R.id.imageButton54);
        imageButton20 = Parked(imageButton20,parked20);
        setupImageButton(R.id.imageButton54);
        parked20 = setChange(parked20);
        setupButton(R.id.back3);
        setupButton(R.id.unreserve2);
    }
    private boolean setChange(boolean parked)
    {
        /**
         * Determines if the parked variable needs to be changed
         * @param parked - if there is a car parked at that spot or not(Boolean)
         * @returns true - returns true if parked needs to be changed
         * @returns parked - returns original state of parked if change is false.
         */
        if(change)
        {
            change = false;
            return true;
        }
        return parked;
    }
    private void launchParkingActivity(int id) {
        /**
         * Launches the ParkingActivity
         */
        Intent intent = new Intent(this, parkingActivity.class);
        intent.putExtra("Id",id);
        intent.putExtra("Parked0",parked1);
        intent.putExtra("Parked1",parked2);
        intent.putExtra("Parked2",parked3);
        intent.putExtra("Parked3",parked4);
        intent.putExtra("Parked4",parked5);
        intent.putExtra("Parked5",parked6);
        intent.putExtra("Parked6",parked7);
        intent.putExtra("Parked7",parked8);
        intent.putExtra("Parked8",parked9);
        intent.putExtra("Parked9",parked10);
        intent.putExtra("Parked10",parked11);
        intent.putExtra("Parked11",parked12);
        intent.putExtra("Parked12",parked13);
        intent.putExtra("Parked13",parked14);
        intent.putExtra("Parked14",parked15);
        intent.putExtra("Parked15",parked16);
        intent.putExtra("Parked16",parked17);
        intent.putExtra("Parked17",parked18);
        intent.putExtra("Parked18",parked19);
        intent.putExtra("Parked19",parked20);
        intent.putExtra("Lot",3);
        startActivity(intent);
    }
    private void launchMapActivity()
    {
        /**
         * Launches the MapActivity
         */
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        /**
         * Responds to user interaction
         */
        if(v.getId() == R.id.imageButton34)
        {
            Check(parked1,v);
        }
        else if(v.getId() == R.id.imageButton35)
        {
            Check(parked2,v);
        }
        else if(v.getId() == R.id.imageButton36)
        {
            Check(parked3,v);
        }
        else if(v.getId() == R.id.imageButton37)
        {
            Check(parked4,v);
        }
        else if(v.getId() == R.id.imageButton38)
        {
            Check(parked5,v);
        }
        else if(v.getId() == R.id.imageButton39)
        {
            Check(parked6,v);
        }
        else if(v.getId() == R.id.imageButton40)
        {
            Check(parked7,v);
        }
        else if(v.getId() == R.id.imageButton41)
        {
            Check(parked8,v);
        }
        else if(v.getId() == R.id.imageButton42)
        {
            Check(parked9,v);
        }
        else if(v.getId() == R.id.imageButton43)
        {
            Check(parked10,v);
        }
        else if(v.getId() == R.id.imageButton44)
        {
            Check(parked11,v);
        }
        else if(v.getId() == R.id.imageButton45)
        {
            Check(parked12,v);
        }
        else if(v.getId() == R.id.imageButton46)
        {
            Check(parked13,v);
        }
        else if(v.getId() == R.id.imageButton47)
        {
            Check(parked14,v);
        }
        else if(v.getId() == R.id.imageButton48)
        {
            Check(parked15,v);
        }
        else if(v.getId() == R.id.imageButton49)
        {
            Check(parked16,v);
        }
        else if(v.getId() == R.id.imageButton50)
        {
            Check(parked17,v);
        }
        else if(v.getId() == R.id.imageButton51)
        {
            Check(parked18,v);
        }
        else if(v.getId() == R.id.imageButton52)
        {
            Check(parked19,v);
        }
        else if(v.getId() == R.id.imageButton54)
        {
            Check(parked20,v);
        }
        else if(((Button)v).getText().toString().equals("Back"))
        {
            launchMapActivity();
        }
        else if(((Button)v).getText().toString().equals("Unreserve"))
        {
            if(Id != 0)
            {
                ImageButton imageButton;
                imageButton = findViewById(Id);
                imageButton.setImageResource(R.drawable.plus);
                unReserve();
                Toast.makeText(v.getContext(),"Your Spot has been unreserved", Toast.LENGTH_LONG).show();
            }
            else if(Id == 0)
            {
                Toast.makeText(v.getContext(),"Spot not reserved", Toast.LENGTH_LONG).show();
            }
        }
    }
    private void setupImageButton(int buttonID){
        /**
         * Sets up image buttons
         */
        ImageButton button = findViewById(buttonID);
        button.setOnClickListener(this);
    }
    private void setupButton(int buttonID){
        /**
         * sets up buttons
         */
        Button button = findViewById(buttonID);
        button.setOnClickListener(this);
    }
    private ImageButton Parked(ImageButton imageButton,boolean parked)
    {
        /**
         * Sets all the image buttons to either red or green
         * @param imageButton - Blank image button(ImageButton)
         * @param parked - if there is a car parked at that spot or not(Boolean)
         * @returns imageButton - returns set image button
         */
        if (parked)
        {
            imageButton.setImageResource(R.drawable.red);
            setupImageButton(imageButton.getId());
        }
        else
        {
            if(imageButton.getId() == Id)
            {
                imageButton.setImageResource(R.drawable.red);
                change = true;
            }
            else
            {
                imageButton.setImageResource(R.drawable.plus);
            }
        }
        return imageButton;
    }
    private void unReserve()
    {
        /**
         * Unreserves a spot on the map
         */
        if(Id == R.id.imageButton34)
        {
            parked1 = false;
        }
        else if(Id == R.id.imageButton35)
        {
            parked2 = false;
        }
        else if(Id == R.id.imageButton36)
        {
            parked3 = false;
        }
        else if(Id == R.id.imageButton37)
        {
            parked4 = false;
        }
        else if(Id == R.id.imageButton38)
        {
            parked5 = false;
        }
        else if(Id == R.id.imageButton39)
        {
            parked6 = false;
        }
        else if(Id == R.id.imageButton40)
        {
            parked7 = false;
        }
        else if(Id == R.id.imageButton41)
        {
            parked8 = false;
        }
        else if(Id == R.id.imageButton42)
        {
            parked9 = false;
        }
        else if(Id == R.id.imageButton43)
        {
            parked10 = false;
        }
        else if(Id == R.id.imageButton44)
        {
            parked11 = false;
        }
        else if(Id == R.id.imageButton45)
        {
            parked12 = false;
        }
        else if(Id == R.id.imageButton46)
        {
            parked13 = false;
        }
        else if(Id == R.id.imageButton47)
        {
            parked14 = false;
        }
        else if(Id == R.id.imageButton48)
        {
            parked15 = false;
        }
        else if(Id == R.id.imageButton49)
        {
            parked16 = false;
        }
        else if(Id == R.id.imageButton50)
        {
            parked17 = false;
        }
        else if(Id == R.id.imageButton51)
        {
            parked18 = false;
        }
        else if(Id == R.id.imageButton52)
        {
            parked19 = false;
        }
        else if(Id == R.id.imageButton54)
        {
            parked20 = false;
        }
        status = false;
    }
    private void Check(boolean parked,View v)
    {
        /**
         * Checks to see if a spot is already reserved or if the user has a spot reserved
         * @param v - the View(View)
         * @param parked - if there is a car parked at that spot or not(Boolean)
         */
        if(parked)
        {
            Toast.makeText(v.getContext(),"Spot Already Reserved", Toast.LENGTH_LONG).show();
        }
        else
        {
            if(status)
            {
                Toast.makeText(v.getContext(),"Unreserve current spot", Toast.LENGTH_LONG).show();
            }
            else {
                launchParkingActivity(v.getId());
            }
        }
    }
}