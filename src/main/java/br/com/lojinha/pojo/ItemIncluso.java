package br.com.lojinha.pojo;

public class ItemIncluso {
    private String itemNome;
    private int itemQuantidade;

    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.itemNome = nomeInicial;
        this.itemQuantidade = quantidadeInicial;
    }

    public String getItemNome() {
        return itemNome;
    }

    public void setItemNome(String itemNome) {
        this.itemNome = itemNome;
    }

    public int getItemQuantidade() {
        return itemQuantidade;
    }

    public void setItemQuantidade(int itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
    }
}
