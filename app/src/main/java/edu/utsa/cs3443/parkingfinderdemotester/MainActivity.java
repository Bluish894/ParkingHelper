package edu.utsa.cs3443.parkingfinderdemotester;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.parkingfinderdemotester.model.ParkingAreas;

/**
 * Main Activity class that handles the application's menu starting screen.
 * This class initializes buttons and sets click listeners to start either
 * the ParkingPageActivity or SettingsActivity based on user interaction.
 *
 * @author hamza itani
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ParkingAreas T = new ParkingAreas();
    /**
     * Called when the activity is starting. This is where most initialization should go:
     * calling setContentView(int) to inflate the activity's UI, using findViewById(int)
     * to programmatically interact with widgets in the UI, registering click listeners, etc.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously
     *                           being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T.LoadLots(this);
        // Setup buttons for the main activity
        int[] buttonIds = {R.id.parking_page_button, R.id.settings_button};
        for (int id : buttonIds) {
            setupButton(id);
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param view The view that was clicked.
     */
    @Override
    public void onClick(View view) {
        // Determine which button was clicked and start the corresponding activity
        if (view.getId() == R.id.parking_page_button) {
            // Launch Parking Page
            Intent intent = new Intent(this, ParkingPage.class);
            int spots1 = 0;
            int spots2 = 0;
            int spots3 = 0;
            for(int i = 0; i < T.getLots().size();i++)
            {
                for(int x = 0; x < T.getLots().get(i).getSpots().size();x++)
                {
                    if(i == 0 && T.getLots().get(i).getSpots().get(x).getCarParked() == false)
                    {
                        spots1++;
                    }
                    else if(i == 1 && T.getLots().get(i).getSpots().get(x).getCarParked() == false)
                    {
                        spots2++;
                    }
                    else if(i == 2 && T.getLots().get(i).getSpots().get(x).getCarParked() == false)
                    {
                        spots3++;
                    }
                    intent.putExtra("Parked" + String.valueOf(i)+String.valueOf(x), T.getLots().get(i).getSpots().get(x).getCarParked());
                }
            }
            intent.putExtra("Spots1",spots1);
            intent.putExtra("Spots2",spots2);
            intent.putExtra("Spots3",spots3);
            startActivity(intent);
        } else if (view.getId() == R.id.settings_button)
        {
            // Launch Settings Page
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
    }

    /**
     * Sets up a button with the given ID by finding it in the layout and setting its click listener.
     *
     * @param buttonID The resource ID of the button to setup.
     */
    private void setupButton(int buttonID) {
        Button button = findViewById(buttonID);
        button.setOnClickListener(this);
    }
}
