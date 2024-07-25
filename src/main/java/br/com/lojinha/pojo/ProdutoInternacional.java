package br.com.lojinha.pojo;

import br.com.lojinha.enuns.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaImportacao;

    //Super método extendidi da class Produto
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Polimorfismo: Método overryd - sobrescrita de método
    public void setValor(double novoValor) {
        //Condicional
        if (novoValor > -100) {
            this.valor = novoValor; //campoo valor não pode ser modificado pois é privado na classe produto
        }
        else {
            //Exceção
            try{
                throw new IllegalAccessException("Valor deve ser maiores que -100.");
            }
            catch (IllegalAccessException e){
                throw new RuntimeException(e);
            }
        }
    }

    //Get e Set
    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String getFavorito() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
