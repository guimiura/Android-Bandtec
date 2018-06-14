package com.example.guita.clienteapi;

import android.os.AsyncTask;

import feign.Feign;

public class ExcluirPostagemTask extends AsyncTask<Integer, Void, Void > {

    @Override
    protected Void doInBackground(Integer... params) {
        PostagemRequest request = Feign.builder()
                .target(PostagemRequest.class, "http://jsonplaceholder.typicode.com/");

        request.excluir(params[0]);
        return null;
    }
}
