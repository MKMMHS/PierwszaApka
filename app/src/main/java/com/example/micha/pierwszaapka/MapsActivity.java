package com.example.micha.pierwszaapka;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.micha.pierwszaapka.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {
    private GoogleMap mMap;

    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(10, 10))
                .title("Hello world"));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
        Uri gmmIntentUri = Uri.parse("geo:51.9715,20.5230");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;
        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap == null) {
            return;
        }
        // Initialize map options. For example:
        // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);





    }
}