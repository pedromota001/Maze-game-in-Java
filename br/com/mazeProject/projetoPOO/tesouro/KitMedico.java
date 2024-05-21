package br.com.mazeProject.projetoPOO.tesouro;

public class KitMedico extends Tesouro{
    private final int vidaRecuperada = 25;

    public KitMedico(int posicaox, int posicaoy, String descricao) {
        super(posicaox, posicaoy, descricao);
        descricao = "25 pontos da sua vida foi recuperada!";
        setValorPontos(15);
    }
}
