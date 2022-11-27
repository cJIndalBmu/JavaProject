package com.example.user.flight_booking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import static android.R.attr.dial;
import static android.content.Intent.ACTION_DIAL;


public class Contactus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.menu_home:
                Intent in1 = new Intent(this, MainActivity.class);
                startActivity(in1);
                return true;

        
            case R.id.menu_book:
                Intent in3 = new Intent(this, Book.class);
                startActivity(in3);
                return true;
            case R.id.menu_log:
                Intent in4 = new Intent(this, Log.class);
                startActivity(in4);
                return true;
            case R.id.menu_share:
                Intent in6 = new Intent(this, Share.class);
                startActivity(in6);
                return true;
            case R.id.menu_contact:
                Intent in5 = new Intent(this, Contactus.class);
                startActivity(in5);
                return true;


        }
        return super.onOptionsItemSelected(item);
    }

    public void Call(View v)
    {  Intent dial = new Intent();
        String PhoneNo="+91 8088-973-948";
        dial.setAction("android.intent.action.DIAL");
        dial.setData(Uri.parse("tel:"+PhoneNo));
        startActivity(dial);

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + PhoneNo));
        startActivity(dial);


    }
    public void SMS(View v)
    { String PhoneNo="+91 8088-973-948";
        Uri smsUri = Uri.parse(PhoneNo);
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra("address",PhoneNo);
        intent.setType("text/plain");
        startActivity(intent);


    }

    public void Findus(View v)
    {
        String geoCode ="geo:36.800287, 10.185343";
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(geoCode));
        startActivity(intent);

    }

}
