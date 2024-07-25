package br.com.lojinha;

import br.com.lojinha.enuns.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        //Importar a classe pojo > Produto e instanciar o objeto
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        //Passar valor usando o set
        meuProduto.setNome("Playstation 5");
        meuProduto.setValor(4599.99);

        //Item 0 -> 2 Controle
        //Item 1 -> 3 Jogos

        //Criar lista vazia
        List<ItemIncluso> itensInclusos = new ArrayList<>();
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); //0
        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso);//1
        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 1);
        itensInclusos.add(terceiroItemIncluso);//2
        //meu produto recebe os itens da lista de ItensInclusos
        meuProduto.setItensInclusos(itensInclusos);

        //Imprimir usando o valor do get
        System.out.println("Nome: " + meuProduto.getNome());
        System.out.println("Valor: " + meuProduto.getValor());
        System.out.println("Marca: " + meuProduto.getMarca());
        System.out.println("Tamanho: " + meuProduto.getTamanho());

        System.out.println();

        //Imprime o quantidade de itens da lista
        System.out.println("Número de itens da lista: " + meuProduto.getItensInclusos().size());
        System.out.println();
        //Imprime o item da lista pelo id informado
        System.out.println("* Primeiro Item:");
        System.out.println("Nome: " + meuProduto.getItensInclusos().get(0).getNome());
        System.out.println("Quantidade: " + meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println();
        System.out.println("* Segundo Item:");
        System.out.println("Nome: " + meuProduto.getItensInclusos().get(1).getNome());
        System.out.println("Quantidade: " +meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println();
        System.out.println("* Terceiro Item: ");
        System.out.println("Nome: " + meuProduto.getItensInclusos().get(2).getNome());
        System.out.println("Quantidade: " + meuProduto.getItensInclusos().get(2).getQuantidade());
    }
}
