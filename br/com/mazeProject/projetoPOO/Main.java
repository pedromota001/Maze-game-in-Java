package br.com.mazeProject.projetoPOO;
import java.util.Scanner;
import br.com.mazeProject.projetoPOO.Labirinto;

public class Main {
    static void labirinto(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do labirinto: ");
        int tamanhoLab = scanner.nextInt();

        Labirinto labirinto = new Labirinto(tamanhoLab);

        labirinto.gerarLabirinto();

        for(int i = 0; i < tamanhoLab*tamanhoLab; i++){

        }
    }
}
