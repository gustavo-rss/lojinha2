package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(1);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemAdicional = new ItemIncluso("Controle", 2);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println("Item adicional: " + primeiroItemAdicional.getItemNome()
                + "\nQuantidade Item adicional: " + primeiroItemAdicional.getItemQuantidade());
        System.out.println("Tamanho: " + meuProduto.getTamanho());
        System.out.println("Marca: " + meuProduto.getMarca());
    }
}