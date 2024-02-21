package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        Print menu
        while (true) {
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
                restaurantes.add(restaurante);
                System.out.println("Restaurante " + restaurante.nome + " cadastrado com sucesso!");
            } else if (opcao.equals("2")) {
                if (restaurantes.isEmpty()) {
                    System.out.println("Nenhum restaurante cadastrado.");
                } else {
                    System.out.println("Restaurantes cadastrados:");
                }
//                 Lista restaurantes com número de cada
                for (int i = 0; i < restaurantes.size(); i++) {
                    Restaurante restaurante = restaurantes.get(i);
                    System.out.println(i + 1 + ": " + restaurante.nome);
                    restaurante.imprimirMenu();
                    System.out.println(" ");
                }
            } else if (opcao.equals("3")) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu:");
                int escolhido = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha novamente
                System.out.print("Digite o nome do item: ");
                String nomeItem = scanner.nextLine();
                System.out.print("Digite o preco do item: ");
                float precoItem = scanner.nextFloat();
                Item item = new Item(nomeItem, precoItem);
                if (escolhido >= 1 && escolhido <= restaurantes.size()) {
                    Restaurante restauranteEscolhido = restaurantes.get(escolhido - 1);
                    restauranteEscolhido.adicionarItem(item);
                    System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante com sucesso!");
                } else {
                    System.out.println("Número de restaurante inválido.");
                }
                System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante com sucesso!");
            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;

            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        }
    }
}