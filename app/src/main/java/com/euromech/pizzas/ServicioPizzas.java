package com.euromech.pizzas;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by manana on 27/5/16.
 */
public class ServicioPizzas {

    public static List<Pizzas> addPizzas() {

        float precio;
        int tamaño;
        String nombre;
        LinkedList<Pizzas> pizzas = new LinkedList<>();
        LinkedList<String> ingredientes = new LinkedList<>();

        nombre = "Barbacoa Jamón";
        ingredientes.add("Cebolla");
        ingredientes.add("Jamón");
        ingredientes.add("Barbacoa");
        precio = 7;
        tamaño = 1;
        pizzas.add(new Pizzas(nombre,ingredientes,precio,tamaño));

        ingredientes = new LinkedList<>();
        nombre = "Champi Queso";
        ingredientes.add("Cheddar");
        ingredientes.add("Jamón");
        ingredientes.add("Champiñon");
        precio = 7;
        tamaño = 1;
        pizzas.add(new Pizzas(nombre,ingredientes,precio,tamaño));

        ingredientes = new LinkedList<>();
        nombre = "Extra";
        ingredientes.add("Cheddar");
        ingredientes.add("Jamón");
        ingredientes.add("Ternera");
        ingredientes.add("Aceitunas");
        ingredientes.add("Ternera");
        ingredientes.add("Barbacoa");
        precio = 12;
        tamaño = 1;
        pizzas.add(new Pizzas(nombre,ingredientes,precio,tamaño));

        ingredientes = new LinkedList<>();
        nombre = "Hawaiana";
        ingredientes.add("Piña");
        ingredientes.add("Melón");
        ingredientes.add("Jamón");
        ingredientes.add("Tomate cherry");
        ingredientes.add("Salsa hawaiana");
        precio = 8;
        tamaño = 1;
        pizzas.add(new Pizzas(nombre,ingredientes,precio,tamaño));

        return pizzas;
    }
}
