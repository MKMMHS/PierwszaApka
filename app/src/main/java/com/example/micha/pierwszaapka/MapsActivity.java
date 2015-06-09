package com.example.micha.pierwszaapka;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

    private String marcin = "Marcin";
//    private TextView infoTitle;
//    private TextView infoSnippet;
    private int i=0;
    private float p,q;
    private GoogleMap mMap;
//    private Button infoButton;
//    private OnInfoWindowElemTouchListener infoButtonListener;
    


//    public void onMapReady(GoogleMap map) {
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();


        if (mMap != null) {
            setUpMapIfNeeded();
            mMap.setMyLocationEnabled(true);
        }
//
//        //---------------------------------------------------------------------------------------------
//
//        this.infoWindow = (ViewGroup)getLayoutInflater().inflate(R.layout.info_window, null);
//        this.infoTitle = (TextView)infoWindow.findViewById(R.id.title);
//        this.infoSnippet = (TextView)infoWindow.findViewById(R.id.snippet);
//        this.infoButton = (Button)infoWindow.findViewById(R.id.button);
//
//
//        mMap.setInfoWindowAdapter(new InfoWindowAdapter() {
//
//            // Use default InfoWindow frame
//            @Override
//            public View getInfoWindow(Marker marker) {
//                return null;
//            }
//
//            // Defines the contents of the InfoWindow
//            @Override
//            public View getInfoContents(Marker marker) {
//
//                // Getting view from the layout file info_window_layout
//                mMap.addMarker(new MarkerOptions().position(new LatLng(52.252249, 20.905533)).title("Grzesiek").snippet("Telefon 502 333 765").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
//                View grzesiek = getLayoutInflater().inflate(R.layout.grzesiek, null);
//
////                View m = getLayoutInflater().inflate(R.layout.marcin, null);
////                View ma = getLayoutInflater().inflate(R.layout.marta, null);
////                View o = getLayoutInflater().inflate(R.layout.ola, null);
////                View a = getLayoutInflater().inflate(R.layout.asia, null);
////                View k = getLayoutInflater().inflate(R.layout.krzysiek, null);
//
//
//                // Getting reference to the TextView to set title
//                //TextView note = (TextView) v.findViewById(R.id.note);
//
//                //note.setText(marker.getTitle() );
//
//                // Returning the view containing InfoWindow contents
//
//
//
//                return grzesiek;
//
//
//            }
//
//
//        });
//        // ----------------------------------------------------------------------------------------------
//
//
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();


    }

    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;

//            @Override;
//        public abstract View getInfoContents (Marker marker){
//                View v = getLayoutInflater().inflate(R.layout.custom_info_contents,null);
//            }
        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap == null) {
            return;
        }
        // Initialize map options. For example:
         mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        p = 52.252798F;
        q = 20.893635F;
        mMap.addMarker(new MarkerOptions().position(new LatLng(p, q)).title(marcin).snippet("Telefon 798 998 234\nZainteresowania: siatkowka").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252972, 20.895915)).title("Krzysiek").snippet("Telefon 690 221 123 Zainteresowania: pilka nozna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252249, 20.905533)).title("Grzesiek").snippet("Telefon 502 333 765\n Zainteresowania: ksiazki").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254807, 20.90182)).title("Marta").snippet("Telefon 669 345 543\n Zainteresowania: gokardy").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.261256, 20.894739)).title("Asia").snippet("Telefon 500 221 908\n Zainteresowania: jazda konna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254893, 20.896005)).title("Ola").snippet("Telefon 500 001 020\n Zainteresowania: bieganie").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));

}
}
