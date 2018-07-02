package com.example.marco.deliveryexpert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class WelcomeScreen extends AppCompatActivity {
    // Add Enter Button Press to bring up HomeDashboard
    Button btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsub = (Button)findViewById(R.id.button);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeDashboard();
            }
        });



    }

    private void openHomeDashboard() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }


}




