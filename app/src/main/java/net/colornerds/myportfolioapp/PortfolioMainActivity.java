package net.colornerds.myportfolioapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;

import android.widget.Toast;

public class PortfolioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);

        //custom title font
        Typeface titleTypeface = Typeface.createFromAsset(getAssets(), "Thick Marker Talls.ttf");
        TextView titleTextview = (TextView) findViewById(R.id.textView1);
        titleTextview.setTypeface(titleTypeface);

        //Popular Movies button click
        final Button popBn;
        popBn = (Button) findViewById(R.id.popmovies);
        popBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"Popular Movie App Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
        //Stock Hawk button click
        Button stockBn;
        stockBn = (Button) findViewById(R.id.stockhawk);
        stockBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"Stock Hawk App Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
        //Build it Bigger button click
        Button buildBn;
        buildBn = (Button) findViewById(R.id.builditbigger);
        buildBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"Build It Bigger App Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
        //Make your app button click
        Button makeBn;
        makeBn = (Button) findViewById(R.id.makeyourapp);
        makeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"MAke Your App Material Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
        //Go Ubiquitous button click
        Button ubiBn;
        ubiBn = (Button) findViewById(R.id.goubi);
        ubiBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"Go Ubiquitous App Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
        //capstone button click
        Button capstoneBn;
        capstoneBn = (Button) findViewById(R.id.capstone);
        capstoneBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((getBaseContext()),"Capstone App Coming Soon!",Toast.LENGTH_LONG) .show();
            }

        });
    }
}