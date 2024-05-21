package br.com.mazeProject.projetoPOO.tesouro;

public class Localizador extends Tesouro{


    public Localizador(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setDescricao("Voce ganhou um localizador, as proximas 5 posicoes serao reveladas!");
        setValorPontos(25);
        setSimbolo('L');
    }
}
