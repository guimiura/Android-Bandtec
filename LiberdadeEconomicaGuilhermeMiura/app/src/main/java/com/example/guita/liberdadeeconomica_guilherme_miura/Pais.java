package com.example.guita.liberdadeeconomica_guilherme_miura;

import java.io.Serializable;
import java.util.ArrayList;

public class Pais implements Serializable{

    private String nome;
    private Integer populacao;
    private Integer liberdade;
    private String categoria;
    private String idh;
    private String desemprego;

    public Pais(String nome, Integer populacao, Integer liberdade) {
        this.nome = nome;
        this.populacao = populacao;
        this.liberdade = liberdade;

        if(liberdade > 80 && liberdade <= 100){
            this.categoria = "Livre";
            this.idh = "0.85";
            this.desemprego = "5%";
        }
        else if(liberdade > 70 && liberdade <= 80){
            this.categoria = "Quase livre";
            this.idh = "0.77";
            this.desemprego = "7%";
        }
        else if(liberdade > 60 && liberdade <= 70){
            this.categoria = "Moderadamente livre";
            this.idh = "0.72";
            this.desemprego = "10%";
        }
        else if(liberdade > 50 && liberdade <= 60){
            this.categoria = "Quase não livre";
            this.idh = "0.65";
            this.desemprego = "15%";
        }
        else if(liberdade > 0 && liberdade <= 50){
            this.categoria = "Reprimido";
            this.idh = "0.50";
            this.desemprego = "25%";
        }
    }

    public String getIdh() {
        return idh;
    }

    public void setIdh(String idh) {
        this.idh = idh;
    }

    public String getDesemprego() {
        return desemprego;
    }

    public void setDesemprego(String desemprego) {
        this.desemprego = desemprego;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Integer getLiberdade() {
        return liberdade;
    }

    public void setLiberdade(Integer liberdade) {
        this.liberdade = liberdade;
    }
}
