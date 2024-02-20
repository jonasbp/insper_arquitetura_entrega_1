package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        Print menu
        System.out.println("\nMenu Principal:");
        System.out.println("1. Cadastrar restaurante");
        System.out.println("2. Listar restaurantes");
        System.out.println("3. Cadastrar item no menu de um restaurante");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        String opcao = scanner.next();

        if (opcao.equals("1")) {
            System.out.println("Digite o nome do restaurante: ");
            String nomeRestaurante = scanner.next();
            System.out.println("Digite a avaliacao do restaurante: ");
            String avaliacao = scanner.next();
            Restaurante restaurante = new Restaurante();
            restaurante.nome = nomeRestaurante;
            restaurante.avaliacao = avaliacao;
            restaurantes.add(restaurante.nome);
            System.out.println("Restaurante " + restaurante.nome + " cadastrado com sucesso!");

        } else if (opcao.equals("2")) {
            System.out.println("Restaurantes cadastrados:");
//

        } else if (opcao.equals("3")) {
            System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
            String escolha = scanner.next();
            int indice = Integer.parseInt(escolha);
//            String restaurante_escolhido = restaurantes[];
            System.out.println("Digite o nome do item: ");
            String nome_item = scanner.next();
            System.out.println("Digite o preco do item: ");
            Integer preco_item = Integer.valueOf(scanner.next());
            Item item = new Item();
            item.nome = nome_item;
            item.preco = preco_item;
            Restaurante.adicionarItem(item.nome);
            System.out.println("Item " + nome_item + " adicionado ao menu do restaurante " + " com sucesso!");

        } else if (opcao.equals("4")) {
            System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");

        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

        }
    }
}