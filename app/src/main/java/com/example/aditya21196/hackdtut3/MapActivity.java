package com.example.aditya21196.hackdtut3;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.Map;

import static com.example.aditya21196.hackdtut3.MainActivity._state;

public class MapActivity extends AppCompatActivity {

    public GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        switch (_state) {
            case "Andhra Pradesh":
                //code
                gotoLocation(22.9734,78.6569,10);
                break;
            case "Arunachal Pradesh":
                //code
                break;
            case "Assam":
                //code
                break;
            case "Bihar":
                //code
                break;
            case "Chhattisgarh":
                //code
                break;
            case "Goa":
                //code
                break;
            case "Gujarat":
                //code
                break;
            case "Haryana":
                //code
                break;
            case "Himachal Pradesh":
                //code
                break;
            case "Jammu and Kashmir":
                //code
                break;
            case "Jharkhand":
                //code
                break;
            case "Karnataka":
                //code
                break;
            case "Kerala":
                //code
                break;
            case "Madhya Pradesh":
                //code
                break;
            case "Maharashtra":
                //code
                break;
            case "Manipur":
                //code
                break;
            case "Meghalaya":
                //code
                break;
            case "Mizoram":
                //code
                break;
            case "Nagaland":
                //code
                break;
            case "Odisha":
                //code
                break;
            case "Punjab":
                //code
                break;
            case "Rajasthan":
                //code
                break;
            case "Sikkim":
                //code
                break;
            case "Tamil Nadu":
                //code
                break;
            case "Telangana":
                //code
                break;
            case "Tripura":
                //code
                break;
            case "Uttar Pradesh":
                //code
                break;
            case "Uttarakhand":
                //code
                break;
            case "West Bengal":
                //code
                break;
            case "Andaman and Nicobar Islands":
                //code
                break;
            case "Chandigarh":
                //code
                break;
            case "Dadra and Nagar Haveli":
                //code
                break;
            case "Daman and Diu":
                //code
                break;
            case "Lakshadweep":
                //code
                break;
            case "Delhi":
                //code
                break;
            case "Puducherry":
                //code
                break;
        }




    }

    private void gotoLocation(double lat, double lng, int Zoom) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, Zoom);
        map.animateCamera(update);

    }
}
