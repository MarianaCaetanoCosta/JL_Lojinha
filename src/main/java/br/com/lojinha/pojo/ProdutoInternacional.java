package br.com.lojinha.pojo;

import br.com.lojinha.enuns.Tamanho;

public class ProdutoInternacional extends Produto{
    private double taxaImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
}
