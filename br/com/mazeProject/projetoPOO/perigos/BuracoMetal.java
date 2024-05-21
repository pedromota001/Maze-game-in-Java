package br.com.mazeProject.projetoPOO.perigos;

public class BuracoMetal extends Perigo{

    public BuracoMetal(int posicaoLabirinto, int danoPotencial) {
        super(posicaoLabirinto, danoPotencial);
        danoPotencial = 40;
    }
}
