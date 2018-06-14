package com.example.guita.clienteapi;

import android.os.AsyncTask;
import feign.Feign;
import feign.gson.GsonDecoder;

public class LerUsuarioTask extends AsyncTask<Integer, Void, Usuario> {

    @Override
    protected Usuario doInBackground(Integer... params) {

        UsuarioRequest request = Feign.builder()
                .decoder(new GsonDecoder())
                .target(UsuarioRequest.class,
                        "http://jsonplaceholder.typicode.com/");

        Usuario usuario = request.getUsuario (params[0]);
        return usuario;

    }

}
