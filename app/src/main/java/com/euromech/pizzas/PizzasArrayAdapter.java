package com.euromech.pizzas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Omicrono on 27/5/16.
 */
public class PizzasArrayAdapter extends BaseAdapter {

    private List<Pizzas> data;


    public PizzasArrayAdapter(List<Pizzas> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;    // aqui deberia devolver el id del elemento, como es algo que no tengo contemplado, devuelvo su posicion como si fuese el id
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Pizzas pizzas = data.get(position);

        // Ahora creamos la vista siempre que no este creada con anterioridad
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.pizzas_list_items, parent, false);

            TextView tvNombre = (TextView) convertView.findViewById(R.id.tvNombre);
            TextView tvIngredientes = (TextView) convertView.findViewById(R.id.tvIngredientes);
            TextView tvPrecio = (TextView) convertView.findViewById(R.id.tvPrecio);
            TextView tvTamaño = (TextView) convertView.findViewById(R.id.tvTamaño);

            PizzasViewHolder pizzasViewHolder = new PizzasViewHolder(tvNombre, tvIngredientes, tvPrecio, tvTamaño, pizzas);
            convertView.setTag(pizzasViewHolder);
        } else {
            ((PizzasViewHolder)convertView.getTag()).bindItem(pizzas);
        }

        return convertView;
    }
}
