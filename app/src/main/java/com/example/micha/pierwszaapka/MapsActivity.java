package com.example.micha.pierwszaapka;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity {

    private String marcin = "Marcin";
    private float i = 0;
    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

        if (mMap != null) {
            setUpMapIfNeeded();
            mMap.setMyLocationEnabled(true);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();

    }

    public void onButtonClickRefresh(View view) throws InterruptedException {

        i=i+0.0006F;
        this.mMap.clear();

        Marker mar = mMap.addMarker(new MarkerOptions().position(new LatLng(52.252922 - i, 20.895920 + i)).title(marcin).snippet("Telefon 798 998 234\nZainteresowania: siatkowka").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Marker krzys = mMap.addMarker(new MarkerOptions().position(new LatLng(52.252798 + i, 20.893635 - i)).title("Krzysiek").snippet("Telefon 690 221 123 Zainteresowania: pilka nozna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Marker grzes = mMap.addMarker(new MarkerOptions().position(new LatLng(52.252972 - i, 20.895915 + i)).title("Grzesiek").snippet("Telefon 502 333 765\n Zainteresowania: ksiazki").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Marker marti = mMap.addMarker(new MarkerOptions().position(new LatLng(52.254807 + i, 20.90182 - i)).title("Marta").snippet("Telefon 669 345 543\n Zainteresowania: gokardy").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Marker aska = mMap.addMarker(new MarkerOptions().position(new LatLng(52.261256 - i, 20.894739 + i)).title("Asia").snippet("Telefon 500 221 908\n Zainteresowania: jazda konna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Marker olo = mMap.addMarker(new MarkerOptions().position(new LatLng(52.254893 + i, 20.896005 - i)).title("Ola").snippet("Telefon 500 001 020\n Zainteresowania: bieganie").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        Thread.sleep(3000);
    }

    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;

        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap == null) {
            return;
        }
    }
}

