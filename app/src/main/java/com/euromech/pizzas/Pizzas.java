package com.euromech.pizzas;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by manana on 27/5/16.
 */
public class Pizzas implements Serializable {

    public String nombre;
    public List<String> ingredientes = new LinkedList<>();
    public float precio;
    public int tamaño;  // 0 = pequeña, 1 = mediana, 2 = familiar

    public Pizzas(String nombre, List<String> ingredientes, float precio, int tamaño) {
        this.nombre = nombre;
        this.ingredientes.addAll(ingredientes);
        this.precio = precio;
        this.tamaño = tamaño;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getIngrediente (int posicion) {
        return this.ingredientes.get(posicion);
    }

    public void addIngrediente (String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void addIngredientes (List<String> ingredientes) {
        this.ingredientes.addAll(ingredientes);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
