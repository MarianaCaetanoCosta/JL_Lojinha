package br.com.lojinha.pojo;

import java.util.List;

public class ProdutoPojo {
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;

    //Criado Lista de Strings
    private List<String> itensInclusos;

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

    public String getTamanho() {
        return tamanho;
    }

    //Criar condicional de tamanho
    public void setTamanho(String novoTamanho) {
        if (novoTamanho.equalsIgnoreCase("Pequeno")
                || novoTamanho.equalsIgnoreCase("Medio")
                || novoTamanho.equalsIgnoreCase("Grande")) {

            this.tamanho = novoTamanho;
        }
        else{
            throw new IllegalArgumentException("Tamanho pode ser Pequeno, Médio ou Grande. Você digitou: " + novoTamanho);
        }
    }


    //Implementação Lista de ItenInclusos
    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
