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
        Random random = new Random();
        for(int i = 0; i < tamanho; i++){
            for(int y = 0; y < tamanho; y++){
                int tesouroOuPerigo = random.nextInt(3); // numero aleatorio entre 0 e 2
                if(tesouroOuPerigo == 0){ //para adicionar tesouro naquela posição do labirinto

                }
            }
        }
    }

    private void adicionarTesourosAleatorios(int x, int y) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int tipoAleatorio = random.nextInt(3); // Gera um número aleatório entre 0 e 2
            char tipoTesouro = (char) ('A' + tipoAleatorio);
            switch (tipoTesouro) {
                case 'A':
                    MoedaDeOuro moedaDeOuro = new MoedaDeOuro(x,y);
                    listaDeTesouros.add(moedaDeOuro);
                    break;
                case 'B':
                    Localizador localizador = new Localizador(x,y);
                    listaDeTesouros.add(localizador);
                    break;
                case 'C':
                    KitMedico kitMedico = new KitMedico(x,y);
                    listaDeTesouros.add(kitMedico);
                    break;
            }
        }
    }
    public void adicionarPerigosAleatorios(){
        //implementar
    }
}


