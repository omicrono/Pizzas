package com.euromech.pizzas;

import android.widget.TextView;

/**
 * Created by Omicrono on 27/5/16.
 */
public class PizzasViewHolder {

    private TextView tvNombre;
    private TextView tvIngrediente;
    private TextView tvPrecio;
    private TextView tvTamaño;
    private Pizzas item;

    public PizzasViewHolder(TextView tvNombre, TextView tvIngrediente, TextView tvPrecio, TextView tvTamaño, Pizzas item) {
        this.tvNombre = tvNombre;
        this.tvIngrediente = tvIngrediente;
        this.tvPrecio = tvPrecio;
        this.tvTamaño = tvTamaño;
        //this.item = item;
        bindItem(item);
    }

    public void bindItem(Pizzas item) {
        this.item = item;
        tvNombre.setText(item.getNombre());
        tvIngrediente.setText(item.getIngredientes().toString());
        tvPrecio.setText("Precio: "+String.valueOf(item.getPrecio())+"€");
        switch (item.getTamaño())
        {
            case 0:
                tvTamaño.setText("Pequeña");
                break;
            case 1:
                tvTamaño.setText("Mediana");
                break;
            case 2:
                tvTamaño.setText("Familiar");
                break;
            default:
                tvTamaño.setText("No disponible");
                break;
        }
    }

    public TextView getTvNombre() {
        return tvNombre;
    }

    public void setTvNombre(TextView tvNombre) {
        this.tvNombre = tvNombre;
    }

    public TextView getTvIngrediente() {
        return tvIngrediente;
    }

    public void setTvIngrediente(TextView tvIngrediente) {
        this.tvIngrediente = tvIngrediente;
    }

    public TextView getTvPrecio() {
        return tvPrecio;
    }

    public void setTvPrecio(TextView tvPrecio) {
        this.tvPrecio = tvPrecio;
    }

    public TextView getTvTamaño() {
        return tvTamaño;
    }

    public void setTvTamaño(TextView tvTamaño) {
        this.tvTamaño = tvTamaño;
    }

    public Pizzas getItem() {
        return item;
    }

    public void setItem(Pizzas item) {
        this.item = item;
    }

}
