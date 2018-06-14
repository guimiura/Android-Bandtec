package com.example.guita.clienteapi;

import android.os.AsyncTask;

import feign.Feign;
import feign.gson.GsonDecoder;

public class LerPostagemTask extends AsyncTask<Integer, Void, Postagem> {

    @Override
    protected Postagem doInBackground(Integer... params) {

        PostagemRequest request = Feign.builder()
                .decoder(new GsonDecoder())
                .target(PostagemRequest.class,
                        "http://jsonplaceholder.typicode.com/");

        Postagem postagem = request.getPostagem(params[0]);
        return postagem;

    }

}
