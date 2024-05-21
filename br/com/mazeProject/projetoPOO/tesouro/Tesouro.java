package br.com.mazeProject.projetoPOO.tesouro;

public abstract class Tesouro {
    private String descricao;
    private int posicaox;
    private int posicaoy;
    private int valorPontos;
    private char simbolo;
    public Tesouro(int posicaox, int posicaoy){
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    void setPosicaox(int posicaox){
        this.posicaox = posicaox;
    }
    public int getPosicaox(){
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
