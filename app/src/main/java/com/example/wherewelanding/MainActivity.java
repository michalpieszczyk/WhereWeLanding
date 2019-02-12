package com.example.wherewelanding;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button buttonDrop;
    ImageView imgLandingSpot;
    TextView txtLandingSpot;

    public int ChangeLandingSpotImage()
    {
        int i = getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName());
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgBattleBus = (ImageView) findViewById(R.id.imgBattleBus);
        int imageResource = getResources().getIdentifier("@drawable/imgbattlebus", null, this.getPackageName());
        imgBattleBus.setImageResource(imageResource);


        imgLandingSpot = (ImageView) findViewById(R.id.imgLandingSpot);
        imgLandingSpot.setVisibility(View.GONE);
        buttonDrop = findViewById(R.id.buttonDrop);

        txtLandingSpot = findViewById(R.id.txtLandingSpot);
        txtLandingSpot.setVisibility(View.GONE);

        buttonDrop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                imgLandingSpot.setImageResource(ChangeLandingSpotImage());
                String landingSpot = "Tilted Towers";
                txtLandingSpot.setText(landingSpot);
                imgLandingSpot.setVisibility(View.VISIBLE);
                txtLandingSpot.setVisibility(View.VISIBLE);
            }


        });



    }
}
