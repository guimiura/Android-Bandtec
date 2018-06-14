package com.example.guita.projetogoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaInicial extends AppCompatActivity {

    private Button btnGoku;
    private Button btnVegeta;
    private ImageView imgGoku;
    private ImageView imgGokussj;
    private ImageView imgVegeta;
    private ImageView imgVegetassj;
    private Integer contGoku, contVegeta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        this.btnGoku = (Button) findViewById(R.id.btnGoku);
        this.btnVegeta = (Button) findViewById(R.id.btnVegeta);

        this.imgGoku = (ImageView) findViewById(R.id.imgGoku);
        this.imgGokussj = (ImageView) findViewById(R.id.imgGokuSsj);
        this.imgVegeta = (ImageView) findViewById(R.id.imgVegeta);
        this.imgVegetassj = (ImageView) findViewById(R.id.imgVegetaSsj);
        contVegeta = 0;
        contGoku = 0;
    }

    public void Transformar (View v){
        if (v.getId() == this.btnGoku.getId()){
            if (contGoku >=0 && contGoku < 2){
                this.imgGoku.setVisibility(View.VISIBLE);
                contGoku++;
            }
            else if(contGoku >= 2){
                this.imgGokussj.setVisibility(View.VISIBLE);
                this.imgGoku.setVisibility(View.INVISIBLE);
            }
            else{
                return;
            }
        }
        else {
            if (contVegeta >=0 && contVegeta < 2){
                contVegeta++;
                this.imgVegeta.setVisibility(View.VISIBLE);
            }
            else if(contVegeta >= 2){
                this.imgVegetassj.setVisibility(View.VISIBLE);
                this.imgVegeta.setVisibility(View.INVISIBLE);
            }
            else{
                return;
            }
        }
    }

}
