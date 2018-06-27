package com.example.marco.deliveryexpert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView bankCard, ideasCard, addCard, wifiCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);
        //defining Cards
        bankCard = (CardView) findViewById(R.id.tips_card);
        ideasCard = (CardView) findViewById(R.id.ideas_card);
        addCard = (CardView) findViewById(R.id.add_card);

        wifiCard = (CardView) findViewById(R.id.miles_card);
        // Add Click listener to the cards
        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()){
            case R.id.tips_card : i = new Intent(this, Tips.class);startActivity(i);break;
            case R.id.add_card : i = new Intent(this, Add.class);startActivity(i);break;
            case R.id.ideas_card : i = new Intent(this, Ideas.class);startActivity(i);break;
            case R.id.miles_card : i = new Intent(this, Miles.class);startActivity(i);break;
            default:break ;
        }


    }
}
