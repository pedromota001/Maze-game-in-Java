package br.com.mazeProject.projetoPOO.perigos;

public class Espinho extends Perigo{

    public Espinho(int posicaoLabirinto, int danoPotencial) {
        super(posicaoLabirinto, danoPotencial);
        danoPotencial = 15;
    }
}
