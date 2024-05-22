package br.com.mazeProject.projetoPOO.tesouro;

public class KitMedico extends Tesouro{
    private final int vidaRecuperada = 25;

    public KitMedico(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setSimbolo('K');
    }
}
