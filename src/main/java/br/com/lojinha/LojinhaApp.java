package br.com.lojinha;

import br.com.lojinha.enuns.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        //Importar a classe pojo > Produto e instanciar o objeto
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        //Passar valor usando o set
        meuProduto.setNome("Playstation 5");
        meuProduto.setValor(30);

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

        //Navegar na losta e imprimir os itens
        System.out.println("Começando a apresentar os itens da lista");
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("Acabaram-se os itens");
        System.out.println();

        System.out.println();
        //Herança: produto nacional
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println("* Produto Nacional \nImposto Nacional: " + meuProdutoNacional.getImpostoNacional());

        System.out.println();

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Mac", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-100);
        //System.out.println("* Produto Internacional \nTaxa importação: " + meuProdutoInternacional.getTaxaImportacao());
    }
}
