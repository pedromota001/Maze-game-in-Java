package br.com.mazeProject.projetoPOO.perigos;

public class Espinho extends Perigo{


    public Espinho(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setDanoPotencial(15);
        setSimbolo('E');
    }
}
