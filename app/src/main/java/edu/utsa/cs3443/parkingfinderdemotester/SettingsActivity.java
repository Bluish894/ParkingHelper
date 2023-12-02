package edu.utsa.cs3443.parkingfinderdemotester;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The CampusLot3Activity manages the third parking lot
 * @author dwy249
 */
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Creates the settings layout
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Initialize views
        TextView settingsTitle = findViewById(R.id.settingsTitle);
        Button notificationsButton = findViewById(R.id.notificationsButton);
        Button deactivateButton = findViewById(R.id.deactivateButton);
        // Click listener for Notifications Button
        notificationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            /**
             * responds to user interaction
             */{
                // Replace this with actual functionality for notifications
                showToast("Notifications Clicked!");
            }
        });

        deactivateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * responds to user interaction
                 */
                showToast("Deactivate Account Clicked");
            }
        });
    }

    private void showToast(String message){
        /**
         * displays message
         */
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}