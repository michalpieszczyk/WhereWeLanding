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

    public landingSpots landingSpotsArray[] = new landingSpots[21];

    public int ChangeLandingSpotImage() {
        int i = getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName());
        return i;
    }

    public void AssignLandingSpotsToArray(landingSpots _landingSpotsArray[])
    {
        _landingSpotsArray[0] = new landingSpots("Tilted Towers", getResources().getIdentifier("@drawable/imgtiltedtowers", null, this.getPackageName()));
        _landingSpotsArray[1] = new landingSpots("Paradise Palms", getResources().getIdentifier("@drawable/imgparadisepalms", null, this.getPackageName()));
        _landingSpotsArray[2] = new landingSpots("Desert Village", getResources().getIdentifier("@drawable/imgdesertvillage", null, this.getPackageName()));
        _landingSpotsArray[3] = new landingSpots("Fatal Fields", getResources().getIdentifier("@drawable/imgfatalfields", null, this.getPackageName()));
        _landingSpotsArray[4] = new landingSpots("Frosty Flights", getResources().getIdentifier("@drawable/imgfrostyflights", null, this.getPackageName()));
        _landingSpotsArray[5] = new landingSpots("GUS", getResources().getIdentifier("@drawable/imggus", null, this.getPackageName()));
        _landingSpotsArray[6] = new landingSpots("Happy Hamlet", getResources().getIdentifier("@drawable/imghappyhamlet", null, this.getPackageName()));
        _landingSpotsArray[7] = new landingSpots("Haunted Hills", getResources().getIdentifier("@drawable/imghauntedhills", null, this.getPackageName()));
        _landingSpotsArray[8] = new landingSpots("Junk Junction", getResources().getIdentifier("@drawable/imgjunkjunction", null, this.getPackageName()));
        _landingSpotsArray[9] = new landingSpots("Lazy Links", getResources().getIdentifier("@drawable/imglazylinks", null, this.getPackageName()));
        _landingSpotsArray[10] = new landingSpots("Lonely Lodge", getResources().getIdentifier("@drawable/imglonelylodge", null, this.getPackageName()));
        _landingSpotsArray[11] = new landingSpots("Loot Lake", getResources().getIdentifier("@drawable/imglootlake", null, this.getPackageName()));
        _landingSpotsArray[12] = new landingSpots("Lucky Landing", getResources().getIdentifier("@drawable/imgluckylanding", null, this.getPackageName()));
        _landingSpotsArray[13] = new landingSpots("Pleasant Park", getResources().getIdentifier("@drawable/imgpleasantpark", null, this.getPackageName()));
        _landingSpotsArray[13] = new landingSpots("Polar Peak", getResources().getIdentifier("@drawable/imgpolarpeak", null, this.getPackageName()));
        _landingSpotsArray[14] = new landingSpots("Retail Row", getResources().getIdentifier("@drawable/imgretailrow", null, this.getPackageName()));
        _landingSpotsArray[15] = new landingSpots("Salty Springs", getResources().getIdentifier("@drawable/imgsaltysprings", null, this.getPackageName()));
        _landingSpotsArray[16] = new landingSpots("Shifty Shafts", getResources().getIdentifier("@drawable/imgshiftyshafts", null, this.getPackageName()));
        _landingSpotsArray[17] = new landingSpots("Snobby Shores", getResources().getIdentifier("@drawable/imgsnobbyshores", null, this.getPackageName()));
        _landingSpotsArray[18] = new landingSpots("The Block", getResources().getIdentifier("@drawable/imgtheblock", null, this.getPackageName()));
        _landingSpotsArray[19] = new landingSpots("Tomato Temple", getResources().getIdentifier("@drawable/imgtomatotemple", null, this.getPackageName()));
        _landingSpotsArray[20] = new landingSpots("Wailing Woods", getResources().getIdentifier("@drawable/imgwailingwoods", null, this.getPackageName()));
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
