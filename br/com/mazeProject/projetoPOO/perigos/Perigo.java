package br.com.mazeProject.projetoPOO.perigos;

public abstract class Perigo {
    private int posicaoLabirinto;
    private int danoPotencial;
    public Perigo(int posicaoLabirinto){
        this.posicaoLabirinto = posicaoLabirinto;
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
