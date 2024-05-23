package br.com.mazeProject.projetoPOO.tesouro;

import br.com.mazeProject.projetoPOO.Aventureiro;

public class Localizador extends Tesouro{


    public Localizador(int posicaox, int posicaoy) {
        super(posicaox, posicaoy);
        setSimbolo('L');
        setValorPontos(25);
    }


    public void revelador(Aventureiro aventureiro, int tamanho, char estrutura[][]){
        int posicaoInicialX = aventureiro.getPosicaox();
        int posicaoInicialY = aventureiro.getPosicaoy();

        if(aventureiro.getPosicaoy() == tamanho-1){
            posicaoInicialX++;
            posicaoInicialY = 0;

            for(int i = 0; i < 5 ; i++){
                System.out.println(estrutura[posicaoInicialX][posicaoInicialY]);
                posicaoInicialY++;
            }
        } else{
            for(int y = 0 ; y < 5; y++){
                posicaoInicialY++;

                if(posicaoInicialY == tamanho-1){
                    posicaoInicialY = 0;
                    posicaoInicialX++;
                }
                System.out.println(estrutura[posicaoInicialX][posicaoInicialY]);
            }
        }


    }

}
