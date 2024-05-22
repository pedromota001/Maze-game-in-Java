package br.com.mazeProject.projetoPOO.perigos;

public class BuracoMetal extends Perigo{


    public BuracoMetal(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setDanoPotencial(40);
        setSimbolo('B');
    }
}
