package com.clinicaEstetica;

public class Cliente extends Pessoa {
    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + getNome() + ", Telefone: " + getTelefone());
    }
}
