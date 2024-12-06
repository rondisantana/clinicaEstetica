package com.clinicaEstetica;

public class Funcionaria extends Pessoa{
    private String cargo;

    public Funcionaria(String nome, String telefone, String cargo) {
        super(nome, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Funcionária: " + getNome() + ", Telefone: " +
                getTelefone() + ", Cargo: " + cargo);
    }
}
