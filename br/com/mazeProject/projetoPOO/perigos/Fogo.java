package br.com.mazeProject.projetoPOO.perigos;

public class Fogo extends Perigo{


    public Fogo(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setDanoPotencial(30);
        setSimbolo('F');
    }
}
