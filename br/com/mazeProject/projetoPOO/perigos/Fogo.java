package br.com.mazeProject.projetoPOO.perigos;

public class Fogo extends Perigo{

    public Fogo(int posicaoLabirinto, int danoPotencial) {
        super(posicaoLabirinto, danoPotencial);
        danoPotencial = 30;
    }
}
