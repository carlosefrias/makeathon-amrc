package com.amrc.me1cme.makeathon_tour_guide;

import android.app.DownloadManager;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void startTourOnClick(View view) {

        String url = "http://192.168.1.126:1880/iot2020/order/4892857c-0468-11e9-abda-94c691a122d1";
        StringRequest ExampleStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //This code is executed if the server responds, whether or not the response contains data.
                //The String 'response' contains the server's response.
                //You can test it by printing response.substring(0,500) to the screen.
            }
        }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
            @Override
            public void onErrorResponse(VolleyError error) {
                //This code is executed if there is an error.
            }
        });




        Toast.makeText(this, "Tour will start now", Toast.LENGTH_LONG).show();
    }

    public void goToStarOnClick(View view) {
        String url = "http://192.168.1.126:1880/iot2020/order/833feb40-0462-11e9-abda-94c691a122d1";
        Toast.makeText(this, "AVG will go to start position", Toast.LENGTH_LONG).show();
    }
}
