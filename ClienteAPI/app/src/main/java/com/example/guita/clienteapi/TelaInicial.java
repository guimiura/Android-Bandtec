package com.example.guita.clienteapi;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TelaInicial extends AppCompatActivity {

    private EditText edit1;
    private TextView txtTitulo;
    private TextView txtConteudo;
    private TextView txtNomeUsu;
    private TextView txtUsernameUsu;
    private TextView txtEmailUsu;
    private LerUsuarioTask lerUsuarioTask;
    private LerPostagemTask lerPostagemTask;
    private ExcluirPostagemTask excluirPostagemTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        this.edit1 = (EditText) findViewById(R.id.edit1);
        this.txtConteudo = (TextView) findViewById(R.id.txtConteudo);
        this.txtTitulo = (TextView) findViewById(R.id.txtTitulo);

        this.txtNomeUsu = (TextView) findViewById(R.id.txtNomeUsu);
        this.txtUsernameUsu = (TextView) findViewById(R.id.txtUsernameUsu);
        this.txtEmailUsu = (TextView) findViewById(R.id.txtEmailUsu);

        this.lerPostagemTask = new LerPostagemTask();
        this.lerUsuarioTask = new LerUsuarioTask();
        this.excluirPostagemTask = new ExcluirPostagemTask();

        StrictMode.ThreadPolicy policy = new
                StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
    }

    public void consultar(View v){
        Integer id = Integer.parseInt(this.edit1.getText().toString());

        Postagem postagemDaInternet = this.lerPostagemTask.doInBackground(id);
        Usuario postagemDainternet2 = this.lerUsuarioTask.doInBackground(id);


        if (postagemDaInternet == null || postagemDainternet2 == null)
            return;

        this.txtTitulo.setText(postagemDaInternet.getTitle());
        this.txtConteudo.setText(postagemDaInternet.getBody());

        this.txtNomeUsu.setText(postagemDainternet2.getName());
        this.txtUsernameUsu.setText(postagemDainternet2.getUsername());
        this.txtEmailUsu.setText(postagemDainternet2.getEmail());

    }

    public void excluir(View v){
        Integer id = Integer.parseInt(this.edit1.getText().toString());

        try {
            this.excluirPostagemTask.doInBackground(id);
            Toast.makeText(this, "Excluido com sucesso.", Toast.LENGTH_SHORT).show();
        } catch (Exception e){
            Toast.makeText(this, "Erro ao excluir", Toast.LENGTH_SHORT).show();
        }

    }

}
