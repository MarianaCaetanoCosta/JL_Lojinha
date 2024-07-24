package br.com.lojinha;

import br.com.lojinha.pojo.ProdutoPojo;

public class LojinhaApp {
    public static void main(String[] args) {
        //Importar a classe pojo > Produto e instanciar o objeto
        ProdutoPojo meuProdutoPojo = new ProdutoPojo();

        //Passar valor aos atributos da classe
        meuProdutoPojo.nome = "Playstation 5";
        meuProdutoPojo.valor = 4599.99;
        meuProdutoPojo.marca = "Sony";
        meuProdutoPojo.tamanho = "Medio";
        meuProdutoPojo.itensInclusos = "2 Controle - 3 Jogos";

        System.out.println("Nome: " + meuProdutoPojo.nome);
        System.out.println("Valor: " + meuProdutoPojo.valor);
        System.out.println("Marca: " + meuProdutoPojo.marca);
        System.out.println("Tamanho: " + meuProdutoPojo.tamanho);
        System.out.println("Itens inclusos: " + meuProdutoPojo.itensInclusos);
    }
}
