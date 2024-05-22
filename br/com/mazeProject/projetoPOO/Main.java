package br.com.mazeProject.projetoPOO;

import br.com.mazeProject.projetoPOO.Labirinto;

public class Main {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto(10);
        labirinto.gerarLabirinto();
        labirinto.exibeLabirinto();
    }
}
