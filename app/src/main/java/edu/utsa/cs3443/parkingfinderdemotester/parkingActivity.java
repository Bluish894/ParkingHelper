package edu.utsa.cs3443.parkingfinderdemotester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
/**
 * The parkingActivity manages user reservations
 * @author dwy249
 */
public class parkingActivity extends AppCompatActivity implements View.OnClickListener{
    int lot;
    int spot;
    String Spot1;
    String Spot2;
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
    boolean res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Sets up Reserve button and back button
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        setupButton(R.id.back);
        setupButton(R.id.button);
        spot = getIntent().getIntExtra("Id",0);
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
        lot = getIntent().getIntExtra("Lot",0);
    }

    private void launchCampusActivity()
    {
        /**
         * launches the previous Parking lot activity
         */
        Intent intent;
        if(lot == 1) {
            intent = new Intent(this, campusActivity.class);
        }
        else if(lot == 2)
        {
            intent = new Intent(this, CampusLot2Activity.class);
        }
        else if(lot == 3)
        {
            intent = new Intent(this, CampusLot3Activity.class);
        }
        else
        {
            intent = new Intent(this, MainActivity.class);
        }
        if (res)
        {
            intent.putExtra("reserved", true);
            intent.putExtra("Spot", spot);
            intent.putExtra("Status",true);
        }
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
        startActivity(intent);
    }
    public void onClick(View v)
    {
        /**
         * Responds to user Interaction
         */
        String text = ((Button)v).getText().toString();
        if(text.equals("Back"))
        {
            res = false;
            launchCampusActivity();
        }
        else if(text.equals("reserve"))
        {
            Toast.makeText(v.getContext(),"Spot Reserved", Toast.LENGTH_LONG).show();
            res = true;
            launchCampusActivity();
        }
    }
    private void setupButton(int buttonID){
        /**
         * Sets up buttons
         */
        Button button = findViewById(buttonID);
        button.setOnClickListener(this);
    }
}