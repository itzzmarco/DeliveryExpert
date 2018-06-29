package com.example.marco.deliveryexpert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {
    // TODO Add Enter Button Press to bring up HomeDashboard
    LinearLayout l1,l2;
    Button btnsub;
    Animation uptodown,downtoup;

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
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);

    }

    private void openHomeDashboard() {
        Intent intent = new Intent(this, HomeDashboard.class);
        startActivity(intent);
    }


}

    // Do something in response to button click


