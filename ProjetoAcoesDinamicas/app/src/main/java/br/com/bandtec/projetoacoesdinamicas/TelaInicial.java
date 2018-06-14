package br.com.bandtec.projetoacoesdinamicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaInicial extends AppCompatActivity {

    private Button botao1;
    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        botao1 = (Button) findViewById(R.id.btn01);
        botao2 = (Button) findViewById(R.id.btn02);

        // injetando o comportamento de click (toque simples)
        // em um componente
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        TelaInicial.this,
                        "Clique simples",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // injetando o comportamento de "clique longo"
        botao2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(
                        TelaInicial.this,
                        "Clique longo",
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}
