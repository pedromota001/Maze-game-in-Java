package br.com.mazeProject.projetoPOO;
import java.util.Scanner;
import br.com.mazeProject.projetoPOO.Labirinto;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Main {
    static void labirinto(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame();
        JPanel jpanel = new JPanel();

        frame.setSize(900,650);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setTitle("Labirinto de Lex!");
        frame.getContentPane().setBackground(new Color(0,255,255));

        JOptionPane.showMessageDialog(null, "BEM VINDO AVENTUREIRO", "LABIRINTO", JOptionPane.INFORMATION_MESSAGE);

        frame.setVisible(true);






        System.out.println("Digite o valor do labirinto: ");
        int tamanhoLab = scanner.nextInt();

        Labirinto labirinto = new Labirinto(tamanhoLab);

        labirinto.gerarLabirinto();

        for(int i = 0; i < tamanhoLab*tamanhoLab; i++){

        }
    }
}
