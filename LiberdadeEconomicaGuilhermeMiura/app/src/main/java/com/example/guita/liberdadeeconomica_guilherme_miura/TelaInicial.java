package com.example.guita.liberdadeeconomica_guilherme_miura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaInicial extends AppCompatActivity {

    private EditText editNomePais;
    private EditText editPopulacaoPais;
    private EditText editLiberdadePais;
    private Pais pais1;
    private Pais pais2;
    private Integer contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        this.editLiberdadePais = (EditText) findViewById(R.id.editLiberdadePais);
        this.editNomePais = (EditText) findViewById(R.id.editNomePais);
        this.editPopulacaoPais = (EditText) findViewById(R.id.editPopulacaoPais);
        this.contador = 0;
    }

    public void CadastrarPais(View v){

        Integer populacao =
                Integer.parseInt(this.editPopulacaoPais.getText().toString());

        Integer liberdade =
                Integer.parseInt(this.editLiberdadePais.getText().toString());

        if(this.editNomePais.getText().length() < 3){
            Toast.makeText(this, R.string.toastErroNomePais,
                    Toast.LENGTH_SHORT).show();
        }
        else if (populacao < 1000){
            Toast.makeText(this, R.string.toastErroPopulacao,
                    Toast.LENGTH_SHORT).show();
        }
        else if (liberdade < 0 || liberdade > 100){
            Toast.makeText(this, R.string.toastErroLiberdade,
                    Toast.LENGTH_SHORT).show();
        }
        else{
            if (contador == 0) {
                this.pais1 = new Pais(this.editNomePais.getText().toString(),
                        populacao, liberdade);
                contador++;
            }
            else{
                this.pais2 = new Pais(this.editNomePais.getText().toString(),
                        populacao, liberdade);
                contador++;
            }
        }

        if (contador == 2){
            Intent telaSecundaria = new Intent(this, TelaSecundaria.class);

            telaSecundaria.putExtra ("objeto1", this.pais1);
            telaSecundaria.putExtra("objeto2", this.pais2);
            startActivity(telaSecundaria);
        }
        else{
            this.editLiberdadePais.setText("");
            this.editNomePais.setText("");
            this.editPopulacaoPais.setText("");
        }

    }

}
