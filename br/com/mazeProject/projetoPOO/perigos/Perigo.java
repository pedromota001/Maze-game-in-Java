package br.com.mazeProject.projetoPOO.perigos;

public abstract class Perigo {
    private int posicaox;
    private int posicaoy;
    private int danoPotencial;
    private char simbolo;

    public Perigo(int posicaox, int posicaoy){
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public int getPosicaox() {
        return posicaox;
    }

    public void setPosicaox(int posicaox) {
        this.posicaox = posicaox;
    }

    public int getPosicaoy() {
        return posicaoy;
    }

    public void setPosicaoy(int posicaoy) {
        this.posicaoy = posicaoy;
    }

    void setDanoPotencial(int danoPotencial){
        this.danoPotencial = danoPotencial;
    }
    int getDanoPotencial(){
        return danoPotencial;
    }

}
