package com.clinicaEstetica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento sistema = new SistemaGerenciamento();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Sistema de Gerenciamento - Clínica de Estética e Loja de Lingerie");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Agendar Serviço");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Atualizar Produto");
            System.out.println("6. Gerar Relatório de Clientes");
            System.out.println("7. Gerar Relatório de Produtos");
            System.out.println("8. Gerar Relatório de Serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, telefoneCliente);
                    sistema.cadastrarCliente(cliente);
                    break;
                case 2:
                    System.out.print("Nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Descrição: ");
                    String descricaoProduto = scanner.nextLine();
                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto, descricaoProduto);
                    sistema.cadastrarProduto(produto);
                    break;
                case 3:
                    System.out.print("Tipo de Serviço: ");
                    String tipoServico = scanner.nextLine();
                    System.out.print("Data (AAAA-MM-DD): ");
                    String dataServico = scanner.nextLine();
                    System.out.print("Hora (HH:MM): ");
                    String horaServico = scanner.nextLine();
                    System.out.print("Profissional: ");
                    String profissionalServico = scanner.nextLine();
                    Servico servico = new Servico(tipoServico, dataServico, horaServico, profissionalServico);
                    sistema.agendarServico(servico);
                    break;
                case 4:
                    System.out.print("ID do Cliente para atualizar: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Novo Telefone: ");
                    String novoTelefone = scanner.nextLine();
                    sistema.atualizarCliente(idCliente, novoTelefone);
                    break;
                case 5:
                    System.out.print("ID do Produto para atualizar: ");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    sistema.atualizarProduto(idProduto, novaQuantidade);
                    break;
                case 6:
                    sistema.gerarRelatorioClientes();
                    break;
                case 7:
                    sistema.gerarRelatorioProdutos();
                    break;
                case 8:
                    sistema.gerarRelatorioServicos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}