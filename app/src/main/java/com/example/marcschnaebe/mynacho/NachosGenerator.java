package com.example.marcschnaebe.mynacho;

import com.example.marcschnaebe.util.Util;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by christop.hirschi on 11.10.2017.
 */

public class NachosGenerator {

    private static ArrayList<String> listNachosNames = new ArrayList<>();

    public NachosGenerator(GoogleMap mMap) {

        listNachosNames.add("Caraponcho");
        listNachosNames.add("Salamuchos");
        listNachosNames.add("Buritops");
        listNachosNames.add("Mustaupicos");
        listNachosNames.add("Bulbiatchos");
        listNachosNames.add("Maracachu");
    }

    /**
     *
     * @param myPositionMarker Marqueur de la position du joueur
     * @return new Nachos
     */
    public static Nachos addNewWildNachos(Marker myPositionMarker) {

        LatLng position = myPositionMarker.getPosition();
        double latitude = Util.randomDouble(position.latitude - 0.001, position.latitude + 0.001);
        double longitude = Util.randomDouble(position.longitude - 0.001, position.longitude + 0.001);
        int pv = Util.randomInteger(5, 30);
        String name = listNachosNames.get(Util.randomInteger(0, 5));

        return new Nachos(latitude, longitude, name, pv);

    }

}