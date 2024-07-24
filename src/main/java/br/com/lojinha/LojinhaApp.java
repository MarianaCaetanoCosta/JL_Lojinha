package br.com.lojinha;

import br.com.lojinha.enuns.Tamanho;
import br.com.lojinha.pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        //Importar a classe pojo > Produto e instanciar o objeto
        ProdutoPojo meuProdutoPojo = new ProdutoPojo();

        //Passar valor usando o set
        meuProdutoPojo.setNome("Playstation 5");
        meuProdutoPojo.setValor(4599.99);
        //meuProdutoPojo.setValor(0.00);
        meuProdutoPojo.setMarca("Sony");

        //Usando Enumerador
        meuProdutoPojo.setTamanho(Tamanho.PEQUENO);

        //Item 0 -> 2 Controle
        //Item 1 -> 3 Jogos

        //Criar lista vazia
        List<String> itensInclusos = new ArrayList<>();

        //Adicionar itens a lista
        itensInclusos.add("2 Controle"); //id: 0
        itensInclusos.add("3 Jogos"); // id: 1
        itensInclusos.add("Cabo de energia"); //id: 2

        //meu produto recebe os itens da lista
        meuProdutoPojo.setItensInclusos(itensInclusos);

        //Imprimir usando o valor do get
        System.out.println("Nome: " + meuProdutoPojo.getNome());
        System.out.println("Valor: " + meuProdutoPojo.getValor());
        System.out.println("Marca: " + meuProdutoPojo.getMarca());

        System.out.println();
        
        System.out.println("Tamanho: " + meuProdutoPojo.getTamanho());

        System.out.println();

        //Imprime todos os itens da lista
        System.out.println("Todos os itens inclusos: " + meuProdutoPojo.getItensInclusos());

        //Imprime o quantidade de itens da lista
        System.out.println("Número de itens da lista: " + meuProdutoPojo.getItensInclusos().size());

        //Imprime o item da lista pelo id informado
        System.out.println("Item por id: " + meuProdutoPojo.getItensInclusos().get(0));
        System.out.println("Item por id: " + meuProdutoPojo.getItensInclusos().get(1));
    }
}
