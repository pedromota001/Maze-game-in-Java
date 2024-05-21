package br.com.mazeProject.projetoPOO.tesouro;

public abstract class Tesouro {
    private String descricao;
    private int posicaox;
    private int posicaoy;
    private int valorPontos;
    public Tesouro(int posicaox, int posicaoy, String descricao){
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    void setPosicaox(int posicaox){
        this.posicaox = posicaox;
    }
    int getPosicaox(){
        return posicaox;
    }

    public int getPosicaoy() {
        return posicaoy;
    }

    public void setPosicaoy(int posicaoy) {
        this.posicaoy = posicaoy;
    }

    void setValorPontos(int valorPontos){
        this.valorPontos = valorPontos;
    }
    int getValorPontos(){
        return valorPontos;
    }


}
