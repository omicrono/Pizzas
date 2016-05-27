package com.euromech.pizzas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lo primero es consultar las pizzas que tenemos
        List<Pizzas> pizzas = ServicioPizzas.consultaPizzas();

        // Ahora hay que representarlas en pantalla mediante el listView que hemos creado en el activity_main
        ListView lvPizzas = (ListView) findViewById(R.id.lvPizzas);

        // Ahora como el list view necesita un adapter que es el contenedor de lso datos, tengo que crearlo y relacionarlo
        PizzasArrayAdapter adapter = new PizzasArrayAdapter(pizzas);
        lvPizzas.setAdapter(adapter);
    }
}
