package com.example.marcschnaebe.mynacho;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

/**
 * Created by anthony.fleury on 20.10.2017.
 */

public class Player {

    /* -------  Consts  ------ */

    private static int maxTeamSize = 6;

    /* -------  Attributes  ------ */

    private Nachos target = null;

    private Marker marker;

    public ArrayList<Nachos> team = new ArrayList<Nachos>();

    //public ArrayList<Item> bag = new ArrayList<Item>();  //Pour le sac


    /* -------  Constructor ------- */

     public Player(Marker myMarker){
         marker = myMarker;
     }

     /* -------  Methods ------- */

    public void initTeam(){
        for (int i = 0 ; i < 1; i++){
            team.add(i, NachosGenerator.addNewWildNachos(marker));
        }
    }

    /* -------  Getter & Setter  ------ */

    public static int getMaxTeamSize(){ return maxTeamSize;}

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Nachos getTarget() {
        return target;
    }

    public void setTarget(Nachos target) {
        this.target = target;
    }


}
