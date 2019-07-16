package com.sandra.android_bdd;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * @version 1.0 par sandra
 *
 */
public class DataBaseManager extends SQLiteOpenHelper {
    /**
     * Attributs de la class DataBaseManager
     */
    private static final String DATABASE_NAME =  "gescom";
    private static final int DATABASE_VERSION  = 1;

/*------------------------------------------------------------------------------*/
    /**
     *Constructeur
     */
    public DataBaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

/*------------------------------------------------------------------------------*/
    /**
     * les méthodes
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String requete =  "CREATE table categorie(idCat INTEGER primary key autoincrement, libelle text not null)";

        // nous passons notre requete avec la methodes execute
        db.execSQL(requete);

        Log.i("DB","Creation ok");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("DB","OnUpgrate ok");
    }

    /**
     * CRUD
     */
    /*------------------------------------------------------------------------*/
//pour ajouter une categorie
    public void insertCategorie(String libelle){
        String req =  "INSERT INTO categorie(libelle) values('"+libelle+"')";

        this.getReadableDatabase().execSQL(req);

        Log.i("DB","insert ok");

    }

/*------------------------------------------------------------------------*/
    //pour supprimer un categorie avec son id
    public void deleteCategorie(Integer idCat){
        String req =  "DELETE from categorie WHERE idCat = values('"+idCat+ "')";
        this.getReadableDatabase().execSQL(req);

        Log.i("DB", "suppression ok");
    }
/*------------------------------------------------------------------------*/
    //Pour reccuperer la liste
    public List<Categorie> getAllcategorie(){
        List<Categorie> listeCat =  new ArrayList<>();

        String req =  "select * from categorie";
        Cursor cursor = this.getReadableDatabase().rawQuery(req, null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            Categorie cat =  new Categorie(cursor.getInt(0),cursor.getString(1));
            listeCat.add(cat);

            cursor.moveToNext();
        }
        cursor.close();
        return listeCat;
    }
}
