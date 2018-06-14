package com.example.guita.clienteapi;

import feign.Param;
import feign.RequestLine;

public interface UsuarioRequest {

    @RequestLine("GET /users/{id}/")
    Usuario getUsuario(@Param("id") Integer id);

}
