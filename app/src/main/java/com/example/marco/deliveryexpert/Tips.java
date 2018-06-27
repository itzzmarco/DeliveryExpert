package com.example.marco.deliveryexpert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tips extends AppCompatActivity {

    //Get all Views
    TextView v_mtips;
    TextView v_ctips;
    TextView v_tipday;
    //Cash tips
    int cash = 0;
    int dCash[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        setUp();
    }

    private void setUp() {
        //Get all Views
        v_mtips = findViewById(R.id.view_mtips);
        v_ctips = findViewById(R.id.view_ctips);
        v_tipday = findViewById(R.id.view_tipday);

        //Sets current month
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatMonth = new SimpleDateFormat("MMM");
        SimpleDateFormat format = new SimpleDateFormat("EEE");
        String formattedMonth = formatMonth.format(date);
        String formattedDay = format.format(date);

        dCash = new int[Calendar.getInstance().getActualMaximum(Calendar.MONTH)];

        v_mtips.setText(formattedMonth + " Tips:");

        //Total tips for the month
        v_ctips.setText(Integer.toString(cash));

        //Total tips day
        v_tipday.setText(formattedDay + " Tips: " + 0);

        //Buttton set up
        Button mButton = findViewById(R.id.b_addtip);
        mButton.setOnClickListener(onClickListener);
    }



    private void updateUI() {
        int day = Calendar.DAY_OF_MONTH;
        //Sets current month
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatMonth = new SimpleDateFormat("MMM");
        SimpleDateFormat format = new SimpleDateFormat("EEE");
        String formattedMonth = formatMonth.format(date);
        String formattedDay = format.format(date);

        v_mtips.setText(formattedMonth + " Tips:");

        //Total tips for the month
        v_ctips.setText(Integer.toString(cash));

        //Total tips day
        v_tipday.setText(formattedDay + " Tips: " + dCash[day]);
    }

    //Button call
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText addtips = findViewById(R.id.t_addtip);
            int day = Calendar.DAY_OF_MONTH;
            String tip = addtips.getText().toString();

            if (tip.matches("")) {
            }

            else {
                dCash[day] += Integer.valueOf(tip);

                addtips.getText().clear();

                updateUI();
            }
        }
    };
}
