package br.com.mazeProject.projetoPOO;

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
                    // adicionar funcao de adicionar perigo
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
}


