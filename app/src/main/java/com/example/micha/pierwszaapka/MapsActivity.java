package com.example.micha.pierwszaapka;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

    private ViewGroup infoWindow;
    private TextView infoTitle;
    private TextView infoSnippet;
    private int i=0;
    private float p,q;
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
        p = 52.252798F;
        q = 20.893635F;
        mMap.addMarker(new MarkerOptions().position(new LatLng(p, q)).title("Marcin").snippet("Telefon 798 998 234").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252972, 20.895915)).title("Krzysiek").snippet("Telefon 690 221 123").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252249, 20.905533)).title("Grzesiek").snippet("Telefon 502 333 765").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254807, 20.90182)).title("Marta").snippet("Telefon 669 345 543").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.261256, 20.894739)).title("Asia").snippet("Telefon 500 221 908").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254893, 20.896005)).title("Ola").snippet("Telefon 500 001 020").icon(BitmapDescriptorFactory.fromResource(R.drawable.circles)));

//        final Marker ki = mMap.addMarker(new MarkerOptions()
//                .position(new LatLng(50.08, 14.43))
//                .icon(BitmapDescriptorFactory
//                        .fromResource(R.drawable.circles)));
//
//
        final LatLng MELBOURNE = new LatLng(-37.81319, 144.96298);
        Marker melbourne = mMap.addMarker(new MarkerOptions()
                .position(MELBOURNE)
                .title("Melbourne"));
        //View.(R.drawable.circles);
        melbourne.showInfoWindow();
//
//        //}
//        mMap.addMarker(new MarkerOptions()
//                .position(new LatLng(50.08, 14.43))
//                .icon(BitmapDescriptorFactory
//                        .fromResource(R.drawable.circles)));
//
//        infoWindow = (ViewGroup)getLayoutInflater()
//                .inflate(R.layout.custom_info_contents, null);
}




}
