package org.example;

public class Item {
    String nome;
    Float preco;

    public Item(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

//    Funções
    void getNome(){
        System.out.println("Nome" + this.nome);
    }
}
