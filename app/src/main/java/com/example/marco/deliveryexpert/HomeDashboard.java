package com.example.marco.deliveryexpert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView bankCard, ideasCard, addCard, linksCard, wifiCard:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);
        bankCard = (CardView) findViewById(R.id.bankcardId):
        ideasCard = (CardView) findViewById(R.id.ideas_card):
        addCard = (CardView) findViewById(R.id.add_card):
        linksCard = (CardView) findViewById(R.id.links_card):
        wifiCard = (CardView) findViewById(R.id.wifi_card):

    }

    @Override
    public void onClick(View view) {

    }
}
