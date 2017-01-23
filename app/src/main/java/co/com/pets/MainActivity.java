package co.com.pets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarPpal);
        setSupportActionBar(miActionBar);

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

        mascotas.add(new Mascota(R.drawable.perro,"Perro",0));
        mascotas.add(new Mascota(R.drawable.cerdo,"Cerdo",0));
        mascotas.add(new Mascota(R.drawable.elefante,"Elefante",0));
        mascotas.add(new Mascota(R.drawable.gato,"Gato",0));
        mascotas.add(new Mascota(R.drawable.leon,"Leon",0));
        mascotas.add(new Mascota(R.drawable.panda_bear,"Oso Panda",0));
        mascotas.add(new Mascota(R.drawable.vaca,"Vaca",0));
    }


    public void mascotasFavoritas(View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }



}
