package br.com.lojinha.pojo;

import br.com.lojinha.enuns.Tamanho;

import java.util.List;

public class ProdutoPojo {
    private String nome;
    private String marca;
    private double valor;
    //Usar enumerador tamanho
    private Tamanho tamanho;
    //Criado Lista de Strings
    private List<String> itensInclusos;

    //Contrutores
    public ProdutoPojo(String marcaInicial, Tamanho tamanhoInicial){
        //Definir comandos que serão iniciados durante a instanciação
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    //Métodos Get/Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        //Condicional
        if (novoValor > 0) {
            this.valor = novoValor;
        }
        else {
            //Exceção
            try{
                throw new IllegalAccessException("Valor deve ser maior que 0.");
            }
            catch (IllegalAccessException e){
                throw new RuntimeException(e);
            }
        }
    }

    //Altere os métodos get/set para receber o enumetador Tamanho
    public Tamanho getTamanho() {
        return this.tamanho;
    }

    //Criar condicional de tamanho
    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }


    //Implementação Lista de ItenInclusos
    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
