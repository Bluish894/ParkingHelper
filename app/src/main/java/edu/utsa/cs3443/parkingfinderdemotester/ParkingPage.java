package edu.utsa.cs3443.parkingfinderdemotester;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * The CampusLot3Activity manages the third parking lot
 * @author Dominic Maki and Dominic Gomez
 */

public class ParkingPage extends AppCompatActivity implements View.OnClickListener {
   @Override
 protected void onCreate(Bundle savedInstanceState) {
       /**
        * Sets up the three lot buttons
        */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_page);

        setupButton(R.id.parkingLotButton1);

        setupButton(R.id.parkingLotButton2);

        setupButton(R.id.parkingLotButton3);
        int spots1 = getIntent().getIntExtra("Spots1",0);
        int spots2 = getIntent().getIntExtra("Spots2",0);
        int spots3 = getIntent().getIntExtra("Spots3",0);
       TextView tv1 = (TextView)findViewById(R.id.textView2);
       TextView tv2 = (TextView)findViewById(R.id.textView3);
       TextView tv3 = (TextView)findViewById(R.id.textView4);
       tv1.setText("Spots available: "+ String.valueOf(spots1));
       tv2.setText("Spots available: "+ String.valueOf(spots2));
       tv3.setText("Spots available: "+ String.valueOf(spots3));
    }

    public void onClick(View view) {
        /**
         * Responds to user Interaction
         */
       if(view.getId() == R.id.parkingLotButton1){
            startCampusActivity();
        } else if (view.getId() == R.id.parkingLotButton2) {
            startCampus2Activity();
       } else if (view.getId() == R.id.parkingLotButton3){
            startCampus3Activity();
        }
    }
    private void setupButton(int buttonID){
        /**
         * sets up buttons
         */
        Button button = findViewById(buttonID);
        button.setOnClickListener(this);
    }
   public void startCampusActivity(){
       /**
        * Starts CampusActivity
        */
       Intent intent = new Intent(this, campusActivity.class);
       for(int i = 0; i < 16; i ++)
       {
            boolean temp = getIntent().getBooleanExtra("Parked0" + String.valueOf(i), false);
            intent.putExtra("Parked" + String.valueOf(i),temp);
       }
       startActivity(intent);
    }
    public void startCampus2Activity(){
        /**
         * Starts Campus2Activity
         */
        Intent intent = new Intent(this, CampusLot2Activity.class);
        for(int i = 0; i < 18; i ++)
        {
            boolean temp = getIntent().getBooleanExtra("Parked1" + String.valueOf(i), false);
            intent.putExtra("Parked" + String.valueOf(i),temp);
        }
        startActivity(intent);
    }
    public void startCampus3Activity(){
        /**
         * Starts Campus3Activity
         */
        Intent intent = new Intent(this, CampusLot3Activity.class);
        for(int i = 0; i < 20; i ++)
        {
            boolean temp = getIntent().getBooleanExtra("Parked2" + String.valueOf(i), false);
            intent.putExtra("Parked" + String.valueOf(i),temp);
        }
        startActivity(intent);
    }
}