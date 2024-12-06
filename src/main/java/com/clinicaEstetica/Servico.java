package com.clinicaEstetica;

public class Servico {
    private String tipo;
    private String data;
    private String hora;
    private String profissional;

    public Servico(String tipo, String data, String hora, String profissional) {
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.profissional = profissional;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }
}
