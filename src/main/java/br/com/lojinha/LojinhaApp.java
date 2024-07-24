package br.com.lojinha;

import br.com.lojinha.pojo.ProdutoPojo;

public class LojinhaApp {
    public static void main(String[] args) {
        //Importar a classe pojo > Produto e instanciar o objeto
        ProdutoPojo meuProdutoPojo = new ProdutoPojo();

        //Passar valor usando o set
        meuProdutoPojo.setNome("Playstation 5");
        //meuProdutoPojo.setValor(4599.99);
        meuProdutoPojo.setValor(0.00);
        meuProdutoPojo.setMarca("Sony");
        meuProdutoPojo.setTamanho("Medio");
        meuProdutoPojo.setItensInclusos("2 Controle - 3 Jogos");

        //Imprimir usando o valor do get
        System.out.println("Nome: " + meuProdutoPojo.getNome());
        System.out.println("Valor: " + meuProdutoPojo.getValor());
        System.out.println("Marca: " + meuProdutoPojo.getMarca());
        System.out.println("Tamanho: " + meuProdutoPojo.getTamanho());
        System.out.println("Itens inclusos: " + meuProdutoPojo.getItensInclusos());
    }
}
