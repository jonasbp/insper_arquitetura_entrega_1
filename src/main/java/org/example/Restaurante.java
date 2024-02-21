package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
//    Atributos
    String nome;
    String avaliacao;
    ArrayList<Item> cardapio = new ArrayList<>();
//    Funções
    void getNome(){
        System.out.println("Nome" + this.nome);
    }

    public void adicionarItem(Item item){
        this.cardapio.add(item);
    }

    public void imprimirMenu(){
        for (Item item : cardapio){
            System.out.println(item.nome + " - R$" + item.preco);
        }
    }
}
