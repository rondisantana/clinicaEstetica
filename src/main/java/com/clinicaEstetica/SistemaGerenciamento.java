package com.clinicaEstetica;

import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Servico> servicos;

    public SistemaGerenciamento() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }

    // Métodos específicos para cada operação
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void agendarServico(Servico servico) {
        servicos.add(servico);
    }

    public void atualizarCliente(int id, String novoTelefone) {
        if (id < clientes.size()) {
            Cliente cliente = clientes.get(id);
            cliente.setTelefone(novoTelefone);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void atualizarProduto(int id, int novaQuantidade) {
        if (id < produtos.size()) {
            Produto produto = produtos.get(id);
            produto.setQuantidade(novaQuantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void gerarRelatorioClientes() {
        System.out.println("Relatório de Clientes:");
        for (Cliente cliente : clientes) {
            cliente.exibirInformacoes();
        }
    }

    public void gerarRelatorioProdutos() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }
    }

    public void gerarRelatorioServicos() {
        System.out.println("Relatório de Serviços:");
        for (Servico servico : servicos) {
            System.out.println("Tipo: " + servico.getTipo() + ", Data: " + servico.getData() + ", Hora: " + servico.getHora());
        }
    }
}