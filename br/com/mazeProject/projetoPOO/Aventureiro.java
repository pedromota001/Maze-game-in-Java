package br.com.mazeProject.projetoPOO;

import br.com.mazeProject.projetoPOO.tesouro.MoedaDeOuro;
import br.com.mazeProject.projetoPOO.tesouro.Tesouro;

import java.util.ArrayList;

public class Aventureiro {
    private int vidaAventureiro = 100;
    private int quantidadeDePontos = 0;
    private String nome;
    private int posicaox = 0;
    private int posicaoy = 0;
    private ArrayList<Tesouro> tesourosColetados;
    private int qtdMoedas = 0;

    public Aventureiro(String nome, int posicaox, int posicaoy){
        this.nome = nome;
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
        this.tesourosColetados = new ArrayList<>();
    }

    public int getQuantidadeDePontos() { return quantidadeDePontos; }
    public int getVidaAventureiro() {
        return vidaAventureiro;
    }


    public int getQtdMoedas() {
        return qtdMoedas;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    public int getPosicaox() {
        return posicaox;
    }

    public void setPosicaox(int posicaox) {
        this.posicaox = posicaox;
    }

    public int getPosicaoy() {
        return posicaoy;
    }

    public void setPosicaoy(int posicaoy) {
        this.posicaoy = posicaoy;
    }

    void setTesourosColetados(Tesouro t){
        this.tesourosColetados.add(t);
    }

    public ArrayList<Tesouro> getTesourosColetados() {
        return tesourosColetados;
    }

    public void moverAventureiroDireita(int tam){
        if(posicaoy == tam - 1){
            System.out.println("Voce ja esta no canto direito do mapa! ");
        }
        else{
            posicaoy++;
        }
    }
    public void moverAventureiroCima(){
        if(posicaox == 0){
            System.out.println("Voce ja esta muito pra cima, nao eh possivel subir mais!");
        }
        else{
            posicaox--;
        }
    }
    public void moverAventureiroEsquerda(){
        if(posicaoy == 0){
            System.out.println("Voce ja esta muito no canto esquerdo do mapa!");
        }
        else{
            posicaoy--;
        }
    }
    public void moverAventureiroBaixo(int tam){
        if(posicaox == tam - 1){
            System.out.println("Voce ja esta muito embaixo do mapa, nao eh possivel descer mais! ");
        }
        else{
            posicaox++;
        }
    }

    public void verificaMoedas(ArrayList<Tesouro> tesourosColetados){
        for(Tesouro t:tesourosColetados){
            if(t instanceof MoedaDeOuro){
                qtdMoedas++;
            }
        }
    }

    public void adicionarMoedas(){
        qtdMoedas++;
    }

    public void ganhaPontos(int qtdPontos){
        quantidadeDePontos += qtdPontos;
    }

    public void recuperaVida(int vida){
        vidaAventureiro += vida;
    }

    public void tiraVida(int qtdVida){
        vidaAventureiro -= qtdVida;
        if(vidaAventureiro <= 0){
            vidaAventureiro = 0;
        }
    }
}
