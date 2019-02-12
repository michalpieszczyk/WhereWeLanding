package com.example.wherewelanding;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button buttonDrop;
    ImageView imgLandingSpot;
    TextView txtLandingSpot;

    //landingSpots tiltedTowers = new landingSpots("Tilted Towers", getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName()));
    //landingSpots paradisePalms = new landingSpots("Paradise Palms", getResources().getIdentifier("@drawable/imgparadisepalms", null, this.getPackageName()));

    public landingSpots landingSpotsArray[] = new landingSpots[2];


    public int ChangeLandingSpotImage() {
        int i = getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName());
        return i;
    }

    public void AssignLandingSpotsToArray(landingSpots _landingSpotsArray[])
    {
        _landingSpotsArray[0] = new landingSpots("Tilted Towers", getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName()));
        _landingSpotsArray[1] = new landingSpots("Paradise Palms", getResources().getIdentifier("@drawable/imgparadisepalms", null, this.getPackageName()));

    }

    public landingSpots ReturnRandomSpot(landingSpots _landingSpotsArray[])
    {
        int randomSpot = new Random().nextInt(_landingSpotsArray.length);
        return _landingSpotsArray[randomSpot];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgBattleBus = (ImageView) findViewById(R.id.imgBattleBus);
        int imageResource = getResources().getIdentifier("@drawable/imgbattlebus", null, this.getPackageName());
        imgBattleBus.setImageResource(imageResource);

        AssignLandingSpotsToArray(landingSpotsArray);

        imgLandingSpot = (ImageView) findViewById(R.id.imgLandingSpot);
        imgLandingSpot.setVisibility(View.GONE);
        buttonDrop = findViewById(R.id.buttonDrop);

        txtLandingSpot = findViewById(R.id.txtLandingSpot);
        txtLandingSpot.setVisibility(View.GONE);

        buttonDrop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                imgLandingSpot.setVisibility(View.GONE);
                txtLandingSpot.setVisibility(View.GONE);
                
                landingSpots generatedSpot = ReturnRandomSpot(landingSpotsArray);
                imgLandingSpot.setImageResource(generatedSpot.getSpotImage());
                txtLandingSpot.setText(generatedSpot.getSpotName());

                imgLandingSpot.setVisibility(View.VISIBLE);
                txtLandingSpot.setVisibility(View.VISIBLE);
            }


        });



    }
}
