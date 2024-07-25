package br.com.lojinha.pojo;

import br.com.lojinha.enuns.Tamanho;

public class ProdutoNacional extends Produto{
    private double impostoNacional;

    //Importado o construtor da classe importada Produto
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Construtor produto nacional
    public double getImpostoNacional(){
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional){
        this.impostoNacional = novoImpostoNacional;
    }
}
