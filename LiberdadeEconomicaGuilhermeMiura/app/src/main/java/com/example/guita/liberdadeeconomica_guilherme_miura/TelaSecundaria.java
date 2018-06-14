package com.example.guita.liberdadeeconomica_guilherme_miura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaSecundaria extends AppCompatActivity {

    private TextView txtResultadoPaisMaisLivre;
    private TextView txtResultadoPaisMenosLivre;
    private TextView txtResultadoCategoria;
    private TextView txtResultadoMenorCategoria;
    private TextView txtResultadoHabitantes;
    private TextView txtResultadoHabitantes2;
    private TextView txtResultadoIdh;
    private TextView txtResultadoIdh2;
    private TextView txtResultadoDesemprego;
    private TextView txtResultadoDesemprego2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_secundaria);

        Pais pais1 = (Pais) getIntent().getSerializableExtra("objeto1");
        Pais pais2 = (Pais) getIntent().getSerializableExtra("objeto2");

        this.txtResultadoPaisMaisLivre = (TextView) findViewById(R.id.txtResultadoPaisMaisLivre);
        this.txtResultadoPaisMenosLivre = (TextView) findViewById(R.id.txtResultadoPaisMenosLivre);

        this.txtResultadoCategoria = (TextView) findViewById(R.id.txtResultadoCategoria);
        this.txtResultadoMenorCategoria = (TextView) findViewById(R.id.txtResultadoMenorCategoria);

        this.txtResultadoHabitantes = (TextView) findViewById(R.id.txtResultadoHabitantes);
        this.txtResultadoHabitantes2 = (TextView) findViewById(R.id.txtResultadoHabitantes2);

        this.txtResultadoIdh = (TextView) findViewById(R.id.txtResultadoIdh);
        this.txtResultadoIdh2 = (TextView) findViewById(R.id.txtResultadoIdh2);

        this.txtResultadoDesemprego = (TextView) findViewById(R.id.txtDesemprego);
        this.txtResultadoDesemprego2 = (TextView) findViewById(R.id.txtDesemprego2);


        if (pais1.getLiberdade() > pais2.getLiberdade()){
            this.txtResultadoPaisMaisLivre.setText(pais1.getNome());
             this.txtResultadoCategoria.setText(pais1.getCategoria());
            this.txtResultadoHabitantes.setText(pais1.getPopulacao().toString());
            this.txtResultadoIdh.setText(pais1.getIdh());
            this.txtResultadoDesemprego.setText(pais1.getDesemprego());

            this.txtResultadoPaisMenosLivre.setText(pais2.getNome());
            this.txtResultadoMenorCategoria.setText(pais2.getCategoria());
            this.txtResultadoHabitantes2.setText(pais2.getPopulacao().toString());
            this.txtResultadoIdh2.setText(pais2.getIdh());
            this.txtResultadoDesemprego2.setText(pais2.getDesemprego());

        }
        else{
            this.txtResultadoPaisMaisLivre.setText(pais2.getNome());
            this.txtResultadoCategoria.setText(pais2.getCategoria());
            this.txtResultadoHabitantes.setText(pais2.getPopulacao().toString());
            this.txtResultadoIdh.setText(pais2.getIdh());
            this.txtResultadoDesemprego.setText(pais2.getDesemprego());

            this.txtResultadoPaisMenosLivre.setText(pais1.getNome());
            this.txtResultadoMenorCategoria.setText(pais1.getCategoria());
            this.txtResultadoHabitantes2.setText(pais1.getPopulacao().toString());
            this.txtResultadoIdh2.setText(pais1.getIdh());
            this.txtResultadoDesemprego2.setText(pais1.getDesemprego());

        }

    }
}
