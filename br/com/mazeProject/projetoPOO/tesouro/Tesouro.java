package br.com.mazeProject.projetoPOO.tesouro;

public class Tesouro {
    private String nome;
    private int posicao;
    private int valorPontos;
    public Tesouro(String nome, int posicao, int valorPontos){
        this.nome = nome;
        this.posicao = posicao;
        this.valorPontos = valorPontos;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return nome;
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
