package br.com.mazeProject.projetoPOO.perigos;

public abstract class Perigo {
    private int posicaoLabirinto;
    private int danoPotencial;

    public Perigo(int posicaoLabirinto, int danoPotencial){
        this.posicaoLabirinto = posicaoLabirinto;
        this.danoPotencial = danoPotencial;
    }

    void setPosicaoLabirinto(int posicaoLabirinto){
        this.posicaoLabirinto = posicaoLabirinto;
    }
    int getPosicaoLabirinto(){
        return posicaoLabirinto;
    }

    void setDanoPotencial(int danoPotencial){
        this.danoPotencial = danoPotencial;
    }
    int getDanoPotencial(){
        return danoPotencial;
    }

}
