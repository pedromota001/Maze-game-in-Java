package br.com.mazeProject.projetoPOO.tesouro;

public class Localizador extends Tesouro{


    public Localizador(int posicaox, int posicaoy, String descricao) {
        super(posicaox, posicaoy, descricao);
        descricao = "Voce ganhou um localizador, as proximas 5 posicoes serao reveladas!";
        setValorPontos(25);
    }
}
