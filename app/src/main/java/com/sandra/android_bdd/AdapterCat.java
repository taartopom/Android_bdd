package com.sandra.android_bdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterCat  extends BaseAdapter {
    private Context context;
    private List<Categorie> listecat;
    private LayoutInflater inflater;

    /**
     * les constructeurs
     */
    public AdapterCat(Context context, List<Categorie> listecat) {
        this.context = context;
        this.listecat = listecat;
        this.inflater = inflater;
    }

    /**
     * les Methodes
     */
    @Override
    public int getCount() {
        return this.listecat.size();
    }

    @Override
    public Categorie getItem(int position) {
        return this.listecat.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =  inflater.inflate(R.layout.layout_cat,null);

        Categorie cat = getItem(position);

        TextView txtCatId =  convertView.findViewById(R.id.txtCatId);
        txtCatId.setText(""+cat.getIdCat());

        TextView txtLibelle =  convertView.findViewById(R.id.txtLibelle);
        txtLibelle.setText(""+cat.getLibelle());

        return convertView;
    }
}
