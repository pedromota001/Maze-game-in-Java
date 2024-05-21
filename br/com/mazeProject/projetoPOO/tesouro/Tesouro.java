package br.com.mazeProject.projetoPOO.tesouro;

public abstract class Tesouro {
    private int posicao;
    private int valorPontos;
    public Tesouro(int posicao, int valorPontos){
        this.posicao = posicao;
        this.valorPontos = valorPontos;
    }


    void setPosicao(int posicao){
        this.posicao = posicao;
    }
    int getPosicao(){
        return posicao;
    }

    void setValorPontos(int valorPontos){
        this.valorPontos = valorPontos;
    }
    int getValorPontos(){
        return valorPontos;
    }

}
