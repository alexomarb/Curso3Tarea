package com.example.courseracursotres_miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //arreglo de objetos Contacto
    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
*/


        //inicializar lista de contactos
        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);


        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this,2);

        GridLayoutManager glm = new GridLayoutManager(this,1);

        listaContactos.setLayoutManager(glm);

        inicializarListaContactos();
        inicializarAdaptador();


        /*
        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombresContacto));

        //escucho cuando se da click sobre un contacto
        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre),contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono),contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail),contactos.get(position).getEmail());

                startActivity(intent);

                finish();
            }
        });
*/




    }

    public ContactoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new ContactoAdaptador(contactos,this);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        //instancio el objeto
        contactos = new ArrayList<Contacto>();
        //creo los elementos del arreglo de contactos
        contactos.add(new Contacto(R.drawable.mascota1,"mascota 1"));
        contactos.add(new Contacto(R.drawable.mascota2,"mascota 2"));
        contactos.add(new Contacto(R.drawable.mascota3,"mascota 3"));
        contactos.add(new Contacto(R.drawable.mascota4,"mascota 4"));
        contactos.add(new Contacto(R.drawable.mascota5,"mascota 5"));
        contactos.add(new Contacto(R.drawable.mascota6,"mascota 6"));

    }

}