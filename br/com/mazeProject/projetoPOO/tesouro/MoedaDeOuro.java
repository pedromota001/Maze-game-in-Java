package br.com.mazeProject.projetoPOO.tesouro;

public class MoedaDeOuro extends Tesouro{

    public MoedaDeOuro(int posicaox, int posicaoy, String descricao) {
        super(posicaox, posicaoy, descricao);
        descricao = "Parabens! ";
        setValorPontos(50);
    }
}
