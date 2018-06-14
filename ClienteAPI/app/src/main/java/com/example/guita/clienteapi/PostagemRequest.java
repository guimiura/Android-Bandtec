package com.example.guita.clienteapi;

import feign.Param;
import feign.RequestLine;

public interface PostagemRequest {

    @RequestLine("GET /posts/{id}/")
    Postagem getPostagem(@Param("id") Integer id);

    @RequestLine("DELETE /posts/{id}/")
    void excluir(@Param("id") Integer id);

}


