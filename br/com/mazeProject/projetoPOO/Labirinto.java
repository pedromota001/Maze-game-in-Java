package br.com.mazeProject.projetoPOO;

import br.com.mazeProject.projetoPOO.Aventureiro;
import br.com.mazeProject.projetoPOO.perigos.BuracoMetal;
import br.com.mazeProject.projetoPOO.perigos.Espinho;
import br.com.mazeProject.projetoPOO.perigos.Fogo;
import br.com.mazeProject.projetoPOO.perigos.Perigo;
import br.com.mazeProject.projetoPOO.tesouro.KitMedico;
import br.com.mazeProject.projetoPOO.tesouro.Localizador;
import br.com.mazeProject.projetoPOO.tesouro.MoedaDeOuro;
import br.com.mazeProject.projetoPOO.tesouro.Tesouro;

import java.util.ArrayList;
import java.util.Random;

public class Labirinto {
    private char [][] estrutura;
    private ArrayList<Tesouro> listaDeTesouros;
    private ArrayList<Perigo> listaDePerigos;
    private int tamanho;

    public Labirinto(int tamanho){
        this.tamanho = tamanho;
        this.estrutura = new char[tamanho][tamanho];
        this.listaDePerigos = new ArrayList<>();
        this.listaDeTesouros = new ArrayList<>();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void gerarLabirinto(){
        //implementar
        Random random = new Random();
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                int tesouroOuPerigo = random.nextInt(3); // 0 a 2
                if(tesouroOuPerigo == 0){
                    adicionarTesourosAleatorios(i,j); // adiciona um tesouro aleatorio na posição que o loop se encontra da matriz.
                }
                else if(tesouroOuPerigo == 1){
                    adicionarPerigosAleatorios(i,j);
                }
                else{
                    break;
                }
            }
        }
    }


    private void adicionarTesourosAleatorios(int x, int y) {
        Random random = new Random();
        int tipoAleatorio = random.nextInt(3); // Gera um número aleatório entre 0 e 2
        char tipoTesouro = (char) ('A' + tipoAleatorio);
        switch (tipoTesouro) {
            case 'A':
                MoedaDeOuro moedaDeOuro = new MoedaDeOuro(x,y);
                estrutura[x][y] = moedaDeOuro.getSimbolo();
                listaDeTesouros.add(moedaDeOuro);
                break;
            case 'B':
                Localizador localizador = new Localizador(x,y);
                estrutura[x][y] = localizador.getSimbolo();
                listaDeTesouros.add(localizador);
                break;
            case 'C':
                KitMedico kitMedico = new KitMedico(x,y);
                estrutura[x][y] = kitMedico.getSimbolo();
                listaDeTesouros.add(kitMedico);
                break;
        }
    }
    public void adicionarPerigosAleatorios(int x, int y){
        Random random = new Random();
        int tipoAleatorio = random.nextInt(3);
        char tipoPerigos = (char) ('A' + tipoAleatorio);
        switch (tipoPerigos){
            case 'A':
                Fogo fogo = new Fogo(x, y);
                estrutura[x][y] = fogo.getSimbolo();
                listaDePerigos.add(fogo);
                break;
            case 'B':
                Espinho espinho = new Espinho(x,y);
                estrutura[x][y] = espinho.getSimbolo();
                listaDePerigos.add(espinho);
                break;
            case 'C':
                BuracoMetal buracoMetal = new BuracoMetal(x,y);
                estrutura[x][y] = buracoMetal.getSimbolo();
                listaDePerigos.add(buracoMetal);
                break;
        }
    }

    public void exibicaoEmovimentacaoAventureiro(Aventureiro aventureiro){
        int posicaoxA = aventureiro.getPosicaox();
        int posicaoyA = aventureiro.getPosicaoy();
        if(estrutura[posicaoxA][posicaoyA] == 'M'){
            MoedaDeOuro moedaDeOuro  = new MoedaDeOuro(posicaoxA,posicaoyA);
            aventureiro.setTesourosColetados(moedaDeOuro);
            aventureiro.ganhaPontos(moedaDeOuro.getValorPontos());
            removeTesouro(posicaoxA,posicaoyA);
            listaDeTesouros.remove(moedaDeOuro);
            System.out.println("Parabens, voce ganhou uma moeda de ouro!!! Agora ja sao: " + aventureiro.getQtdMoedas());
        }
        else if(estrutura[posicaoxA][posicaoyA] == 'L'){
            Localizador localizador = new Localizador(posicaoxA, posicaoyA);
            localizador.revelador(aventureiro, tamanho, estrutura);
            aventureiro.setTesourosColetados(localizador);
            aventureiro.ganhaPontos(localizador.getValorPontos());
            removeTesouro(posicaoxA, posicaoyA);
            listaDeTesouros.remove(localizador);
            System.out.println("Localizador encontrado, as proximas 5 posicoes serao reveladas, fique atento! ");
        }
        else if(estrutura[posicaoxA][posicaoyA] == 'K'){
            KitMedico kitMedico = new KitMedico(posicaoxA, posicaoyA);
            aventureiro.recuperaVida(kitMedico.getVidaRecuperada());
            aventureiro.setTesourosColetados(kitMedico);
            aventureiro.ganhaPontos(kitMedico.getValorPontos());
            removeTesouro(posicaoxA, posicaoyA);
            listaDeTesouros.remove(kitMedico);
            System.out.println("Voce teve 25 pontos da sua vida recuperada, tome cuidado!");
        }
        else if(estrutura[posicaoxA][posicaoyA] == 'F'){
            System.out.println("Voce caiu no fogo, tome cuidado, perdeu 30 pontos da sua vida!");
            aventureiro.tiraVida(25);
        }
        else if(estrutura[posicaoxA][posicaoyA] == 'E'){
            System.out.println("Voce caiu nos espinhos, tome cuidado, perdeu 15 pontos da sua vida! ");
            aventureiro.tiraVida(15);
            System.out.println("Sua vida atual: " + aventureiro.getVidaAventureiro());
        }
        else{
            System.out.println("Voce caiu num buraco, tome cuidado, perdeu 40 pontos da sua vida! ");
            aventureiro.tiraVida(40);
            System.out.println("Sua vida atual: " + aventureiro.getVidaAventureiro());
        }
    }

    public String toString(Aventureiro aventureiro){
        int posicaoX = aventureiro.getPosicaox();
        int posicaoY = aventureiro.getPosicaoy();

        if(estrutura[posicaoX][posicaoY] == 'M'){
            return "Parabéns você ganhou uma moeda de ouro!!";
        } else if(estrutura[posicaoX][posicaoY] == 'L'){
            return "Localizador encontrado, as proximas 5 posicoes serao reveladas, fique atento! ";
        } else if(estrutura[posicaoX][posicaoY] == 'K'){
            return "Voce teve 25 pontos da sua vida recuperada, tome cuidado!";
        } else if(estrutura[posicaoX][posicaoY] == 'F'){
            return "Voce caiu no fogo, tome cuidado, perdeu 30 pontos da sua vida!";
        } else if(estrutura[posicaoX][posicaoY] == 'E'){
            return "Voce caiu nos espinhos, tome cuidado, perdeu 15 pontos da sua vida!";
        } else if(estrutura[posicaoX][posicaoY] == 'B'){
            return "Voce caiu num buraco, tome cuidado, perdeu 40 pontos da sua vida!";
        }
        return "Espaço vazio!";
    }
    public boolean verificaVida(Aventureiro aventureiro){
        if(aventureiro.getVidaAventureiro() == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public void adicionaTesouroFinal(int tamanho){
        Random random = new Random();
        int x = random.nextInt();
    }
    public void removeTesouro(int x, int y){
        if(estrutura[x][y] == 'M' || estrutura[x][y] == 'L' || estrutura[x][y] == 'K'){
            estrutura[x][y] = ' ';
        }
    }




    public void exibeLabirinto() {
        System.out.print("  ");
        for (int coluna = 0; coluna < tamanho; coluna++) {
            System.out.print(coluna + " ");
        }
        System.out.println();

        for (int linha = 0; linha < tamanho; linha++) {
            System.out.print(linha + " ");

            for (int coluna = 0; coluna < tamanho; coluna++) {
                System.out.print(estrutura[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}


