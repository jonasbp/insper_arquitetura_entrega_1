package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
//    Atributos
    String nome;
    String avaliacao;
    static List<Item> cardapio = new ArrayList<>();
//    Funções
    void getNome(){
        System.out.println("Nome" + this.nome);
    }

    static void adicionarItem(Item item){
        cardapio.add(item);
    }

    static void imprimirMenu(){
        for (Item item : cardapio){
            System.out.println(item.nome + " - R$" + item.preco);
        }
    }
}
