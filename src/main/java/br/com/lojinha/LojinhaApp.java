package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(1);
        //meuProduto.setTamanho(Tamanho.MEDIO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles"); //index 0
        itensInclusos.add("3 Jogos"); //index 1
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(0));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());
    }
}