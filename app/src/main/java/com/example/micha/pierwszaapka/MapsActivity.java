package com.example.micha.pierwszaapka;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MapsActivity extends FragmentActivity {

    private String marcin = "Marcin";
    private TextView infoTitle;
    private TextView infoSnippet;
    public int i = 0;
    private float p, q;
    private GoogleMap mMap;
    private ViewGroup infoWindow;
    private Map<Marker, Class> allMarkersMap = new HashMap<Marker, Class>();

    private final LatLng HAMBURG = new LatLng(53.558, 9.927);
    private final LatLng KIEL = new LatLng(53.551, 9.993);
    //private Marker marker;
    private Hashtable<String, String> markers;
//    private ImageLoader imageLoader;
//    private DisplayImageOptions options;
//    private Button infoButton;
//    private OnInfoWindowElemTouchListener infoButtonListener;


//    public void onMapReady(GoogleMap map) {
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

        final MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        final MapWrapperLayout mapWrapperLayout = (MapWrapperLayout) findViewById(R.id.map_relative_layout);


        // 39 - default marker height
        // 20 - offset between the default InfoWindow bottom edge and it's content bottom edge
        //mapWrapperLayout.init(mMap, getPixelsFromDp(this, 39 + 20));

//        this.infoWindow = (ViewGroup) getLayoutInflater().inflate(R.layout.info_window, null);
//        this.infoTitle = (TextView) infoWindow.findViewById(R.id.title);
//
//        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
//            @Override
//            public View getInfoWindow(Marker marker) {
//                return null;
//            }
//
//            @Override
//            public View getInfoContents(Marker marker) {
//                infoTitle.setText(marker.getTitle());
//                mapWrapperLayout.setMarkerWithInfoWindow(marker, infoWindow);
//                return infoWindow;
//            }
//        });


        if (mMap != null) {
            setUpMapIfNeeded();
            mMap.setMyLocationEnabled(true);
        }

//        //---------------------------------------------------------------------------------------------
//
//        this.infoWindow = (ViewGroup)getLayoutInflater().inflate(R.layout.info_window, null);
//        this.infoTitle = (TextView)infoWindow.findViewById(R.id.title);
//        this.infoSnippet = (TextView)infoWindow.findViewById(R.id.snippet);
//        this.infoButton = (Button)infoWindow.findViewById(R.id.button);
//
//
//        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
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
//
//                mMap.addMarker(new MarkerOptions().position(new LatLng(52.252249, 20.905533)).title("Grzesiek").snippet("Telefon 502 333 765").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
//                View grzesiek = getLayoutInflater().inflate(R.layout.grzesiek, null);
//
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


    }


    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();


    }

    public void onButtonClickRefresh(View view){
        i++;


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

        p = 52.252798F + i;
        q = 20.893635F + i;

        mMap.addMarker(new MarkerOptions().position(new LatLng(p, q)).title(marcin).snippet("Telefon 798 998 234\nZainteresowania: siatkowka").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252972, 20.895915)).title("Krzysiek").snippet("Telefon 690 221 123 Zainteresowania: pilka nozna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.252249, 20.905533)).title("Grzesiek").snippet("Telefon 502 333 765\n Zainteresowania: ksiazki").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254807, 20.90182)).title("Marta").snippet("Telefon 669 345 543\n Zainteresowania: gokardy").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.261256, 20.894739)).title("Asia").snippet("Telefon 500 221 908\n Zainteresowania: jazda konna").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(52.254893, 20.896005)).title("Ola").snippet("Telefon 500 001 020\n Zainteresowania: bieganie").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));


}

}

