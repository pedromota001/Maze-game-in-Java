package br.com.mazeProject.projetoPOO;
import java.awt.*;
import java.util.Scanner;
import br.com.mazeProject.projetoPOO.Labirinto;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static void labirinto(){

    }
    public static void main(String[] args) {
        Aventureiro aventureiro = new Aventureiro("Aventureiro" , 0, 0);
        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Dimension buttonSize = new Dimension(50,50);

        JButton buttonCima = new JButton();
        buttonCima.setPreferredSize(buttonSize);

        JButton buttonBaixo = new JButton();
        buttonBaixo.setPreferredSize(buttonSize);

        JButton buttonEsquerda = new JButton();
        buttonEsquerda.setPreferredSize(buttonSize);

        JButton buttonDireita = new JButton();
        buttonDireita.setPreferredSize(buttonSize);

        buttonCima.setIcon(new ImageIcon("setacima.png"));
        buttonBaixo.setIcon(new ImageIcon("setabaixo.png"));
        buttonEsquerda.setIcon(new ImageIcon("setaesquerda.png"));
        buttonDireita.setIcon(new ImageIcon("setadireita.png"));

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(buttonCima, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(buttonBaixo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(buttonEsquerda, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(buttonDireita, gbc);

        frame.setSize(900,650);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setTitle("Labirinto de Lex!");
        frame.getContentPane().setBackground(new Color(135, 248, 140));

        JOptionPane.showMessageDialog(null, "BEM VINDO AVENTUREIRO", "LABIRINTO", JOptionPane.INFORMATION_MESSAGE);
        String stringLab = JOptionPane.showInputDialog("Digite o tamanho do labirinto que voce deseja jogar: ");
        int tamanhoLab = Integer.parseInt(stringLab);
        Labirinto labirinto = new Labirinto(tamanhoLab);
        labirinto.gerarLabirinto();

        buttonCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroCima();
            }
        });

        buttonBaixo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroBaixo(tamanhoLab);
            }
        });

        buttonDireita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroDireita(tamanhoLab);
            }
        });

        buttonEsquerda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroEsquerda();
            }
        });

        frame.add(panel);

        frame.setVisible(true);









        for(int i = 0; i < tamanhoLab*tamanhoLab; i++){

        }
    }
}
