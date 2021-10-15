package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    //attributes
    private String nome;
    private String marca;
    private double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    //constructor
    public Produto(String marcaInicial, Tamanho novoTamanho){
        this.marca = marcaInicial;
        this.tamanho = novoTamanho;
    }


    //getter
    public double getValor() {
        return this.valor;
    }

    //setter with validations
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores do que zero");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    //type Enum tamanho
    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }


    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}
