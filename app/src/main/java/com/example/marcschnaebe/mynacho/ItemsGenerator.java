package com.example.marcschnaebe.mynacho;

import com.example.marcschnaebe.util.Util;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by marc.schnaebe on 21.10.2017.
 */

public class ItemsGenerator {

    private static final Map<String, String> nachoPotionMap = new HashMap<String, String>(){{ put("name", "nachopotion"); put("points", "20"); }};
    private static final Map<String, String> upgradeFireMap = new HashMap<String, String>(){{ put("name", "upgradefire"); put("points", "10"); }};
    private static final Map<String, String> upgradeRockMap = new HashMap<String, String>(){{ put("name", "upgraderock"); put("points", "10"); }};
    private static final Map<String, String> upgradeElectricMap = new HashMap<String, String>(){{ put("name", "upgradeelectric"); put("points", "10"); }};
    private static final Map<String, String> upgradeGrassMap = new HashMap<String, String>(){{ put("name", "upgradegrass"); put("points", "10"); }};
    private static final Map<String, String> upgradeGroundMap = new HashMap<String, String>(){{ put("name", "upgradeground"); put("points", "10"); }};
    private static final Map<String, String> upgradeWaterMap = new HashMap<String, String>(){{ put("name", "upgradewater"); put("points", "10"); }};

    public static ArrayList<Map> itemList = new ArrayList<Map>(){{
        add(nachoPotionMap);
        add(upgradeFireMap);
        add(upgradeRockMap);
        add(upgradeElectricMap);
        add(upgradeGrassMap);
        add(upgradeGroundMap);
        add(upgradeWaterMap);
    }};

    /**
     * Creates a new Nachos.
     *
     * @param myPositionMarker Marqueur de la position du joueur
     * @return new Item
     */
    public static Item addNewItem(Marker myPositionMarker) {

        //On récupère une liste d'un item au hasard
        Map<String, String> mapItems = itemList.get(Util.randomInteger(0, itemList.size()-1));

        double latitude = 0;
        double longitude = 0;

        //On choisit une position au hasard d'après la position du joueur
        if(myPositionMarker != null){
            LatLng position = myPositionMarker.getPosition();
            latitude = Util.randomDouble(position.latitude - 0.0015, position.latitude + 0.0015);
            longitude = Util.randomDouble(position.longitude - 0.0015, position.longitude + 0.0015);
        }

        //Attributs
        String name = mapItems.get("name");
        int upgradePoints = Integer.parseInt(mapItems.get("points"));

        return new Item(latitude, longitude, name, upgradePoints);

    }
}