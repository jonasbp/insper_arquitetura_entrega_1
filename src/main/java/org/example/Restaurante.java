package org.example;

import java.util.ArrayList;

public class Restaurante {
//    Atributos
    String nome;
    String avaliacao;
    static ArrayList<String> cardapio = new ArrayList<>();
//    Funções
    void getNome(){
        System.out.println("Nome" + this.nome);
    }

    static void adicionarItem(String item){
        cardapio.add(item);
    }

    void imprimirMenu(){
        for (String item : cardapio){
            System.out.println(item);
        }
    }
}
