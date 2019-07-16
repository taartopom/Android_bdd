package com.sandra.android_bdd;

import android.content.Intent;

public class Categorie {
    private Integer idCat;
    private String libelle;

/*------------------------------------------------------------------------*/
    /**
     * Constructeurs
     */
    public Categorie(Integer idCat, String libelle) {
        this.idCat = idCat;
        this.libelle = libelle;
    }

    public Categorie(Integer idCat) {
        this.idCat = idCat;
    }

    public Categorie(String libelle) {
        this.libelle = libelle;
    }

    public Categorie() {
    }

    /*------------------------------------------------------------------------*/
    /**
     * les getters
     */
    public Integer getIdCat() {
        return idCat;
    }

    public String getLibelle() {
        return libelle;
    }
 /*------------------------------------------------------------------------*/
    /**
     * Les setters
     */
    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    /**
     * toString
     */
    @Override
    public String toString() {
        return "Categorie{" +
                "idCat=" + idCat +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
