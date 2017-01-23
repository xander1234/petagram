package co.com.pets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarMascotasFavoritas);
        setSupportActionBar(miActionBar);

        //activa el boton de subir
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaContactos();
        inicializarAdaptador();

    }

    public MascotaAdaptador adaptador;

    public void  inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarListaContactos(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.cerdo,"Cerdo",5));
        mascotas.add(new Mascota(R.drawable.elefante,"Elefante",5));
        mascotas.add(new Mascota(R.drawable.leon,"Leon",5));
        mascotas.add(new Mascota(R.drawable.panda_bear,"Oso Panda",3));
        mascotas.add(new Mascota(R.drawable.vaca,"Vaca",2));
    }




}
