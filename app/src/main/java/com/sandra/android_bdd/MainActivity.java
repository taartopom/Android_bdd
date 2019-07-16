package com.sandra.android_bdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private DataBaseManager dbm;
    private ListView lvCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Creation de l'espace memoire
         */
        dbm =  new DataBaseManager(this);
        lvCat = findViewById(R.id.lvCat);

        lvCat.setAdapter(new AdapterCat(this, dbm.getAllcategorie()));

/*------------------------------------------------------------------------*/
        /**
         * Pour ajouter une categorire en base
         */
       // dbm.insertCategorie("DVD");
        //dbm.insertCategorie("LIVRE");
        //dbm.insertCategorie("CD");

/*------------------------------------------------------------------------*/
        /**
         * Pour supprimer une categorie de la base
         */
        //dbm.deleteCategorie(4);

/*------------------------------------------------------------------------*/
        /**
         * Pour afficher la liste des categories
         */
        //Log.i("ListeCat", "" +dbm.getAllcategorie());

    }
}
