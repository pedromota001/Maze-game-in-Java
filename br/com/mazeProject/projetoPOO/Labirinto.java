package br.com.mazeProject.projetoPOO;

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
    }


    private void adicionarTesourosAleatorios() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(tamanho);
            int y = random.nextInt(tamanho);
            int tipoAleatorio = random.nextInt(3); // Gera um número aleatório entre 0 e 2
            char tipoTesouro = (char) ('A' + tipoAleatorio);
            switch (tipoTesouro) {
                case 'A':
                    MoedaDeOuro moedaDeOuro = new MoedaDeOuro(x,y);
                    estrutura[moedaDeOuro.getPosicaox()][moedaDeOuro.getPosicaoy()] = moedaDeOuro.getSimbolo();
                    listaDeTesouros.add(moedaDeOuro);
                    break;
                case 'B':
                    Localizador localizador = new Localizador(x,y);
                    estrutura[localizador.getPosicaox()][localizador.getPosicaoy()] = localizador.getSimbolo();
                    listaDeTesouros.add(localizador);
                    break;
                case 'C':
                    KitMedico kitMedico = new KitMedico(x,y);
                    estrutura[kitMedico.getPosicaox()][kitMedico.getPosicaoy()] = kitMedico.getSimbolo();
                    listaDeTesouros.add(kitMedico);
                    break;
            }
        }
    }
    public void adicionarPerigosAleatorios(){
        //implementar
    }
}


