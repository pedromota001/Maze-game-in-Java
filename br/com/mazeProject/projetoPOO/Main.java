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
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setPreferredSize(new Dimension(200,200));
        GridBagConstraints gbc = new GridBagConstraints();
        Dimension buttonSize = new Dimension(50,50);
        Dimension gameOverSize = new Dimension(150, 150);
        JTextArea messageArea = new JTextArea(5,20);


        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        JButton buttonCima = new JButton("↑");
        buttonCima.setPreferredSize(buttonSize);

        JButton buttonBaixo = new JButton("↓");
        buttonBaixo.setPreferredSize(buttonSize);

        JButton buttonEsquerda = new JButton("←");
        buttonEsquerda.setPreferredSize(buttonSize);

        JButton buttonDireita = new JButton("→");
        buttonDireita.setPreferredSize(buttonSize);

        gbc.gridx = 1;
        gbc.gridy = 1;
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

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(10, 0, 0, 0);
        panel.add(scrollPane, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.insets = new Insets(10, 10, 0, 10);
        panel.add(messageLabel, gbc);



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

                messageArea.setText("");
                String temporario = labirinto.toString(aventureiro);
                messageArea.append(temporario);

                labirinto.exibicaoEmovimentacaoAventureiro(aventureiro);
                String vida = String.valueOf(aventureiro.getVidaAventureiro());
                messageLabel.setText(vida + "HP");

                if(!labirinto.verificaVida(aventureiro)) {
                    messageArea.setText("");
                    messageArea.setText("GAME OVER!");
                    messageArea.append("Quantidades de moedas coletadas: "+ aventureiro.getQtdMoedas());
                    messageArea.append("Quantidades de pontos: " + aventureiro.getQuantidadeDePontos());
                    buttonDireita.setVisible(false);
                    buttonBaixo.setVisible(false);
                    buttonCima.setVisible(false);
                    buttonEsquerda.setVisible(false);
                }
            }
        });

        buttonBaixo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroBaixo(tamanhoLab);

                messageArea.setText("");
                String temporario2 = labirinto.toString(aventureiro);
                messageArea.append(temporario2);

                labirinto.exibicaoEmovimentacaoAventureiro(aventureiro);
                String vida = String.valueOf(aventureiro.getVidaAventureiro());
                messageLabel.setText(vida + "HP");

                if(!labirinto.verificaVida(aventureiro)) {
                    messageArea.setText("");
                    messageArea.setText("GAME OVER!");
                    messageArea.append("Quantidades de moedas coletadas: "+ aventureiro.getQtdMoedas());
                    messageArea.append("Quantidades de localizadores: " + aventureiro.getQuantidadeDePontos());
                    buttonDireita.setVisible(false);
                    buttonBaixo.setVisible(false);
                    buttonCima.setVisible(false);
                    buttonEsquerda.setVisible(false);

                }
            }
        });

        buttonDireita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroDireita(tamanhoLab);

                messageArea.setText("");
                String temporario3 = labirinto.toString(aventureiro);
                messageArea.append(temporario3);

                labirinto.exibicaoEmovimentacaoAventureiro(aventureiro);
                String vida = String.valueOf(aventureiro.getVidaAventureiro());
                messageLabel.setText(vida + "HP");

                if(!labirinto.verificaVida(aventureiro)) {
                    messageArea.setText("");
                    messageArea.setText("GAME OVER!");
                    messageArea.append("Quantidades de moedas coletadas: "+ aventureiro.getQtdMoedas());
                    messageArea.append("Quantidades de localizadores: " + aventureiro.getQuantidadeDePontos());
                    buttonDireita.setVisible(false);
                    buttonBaixo.setVisible(false);
                    buttonCima.setVisible(false);
                    buttonEsquerda.setVisible(false);
                }
            }
        });

        buttonEsquerda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aventureiro.moverAventureiroEsquerda();

                messageArea.setText("");
                String temporario4 = labirinto.toString(aventureiro);
                messageArea.append(temporario4);

                labirinto.exibicaoEmovimentacaoAventureiro(aventureiro);
                String vida = String.valueOf(aventureiro.getVidaAventureiro());
                messageLabel.setText(vida + "HP");

                if(!labirinto.verificaVida(aventureiro)) {
                    messageArea.setText("");
                    messageArea.setText("GAME OVER!");
                    messageArea.append("Quantidades de moedas coletadas: "+ aventureiro.getQtdMoedas());
                    messageArea.append("Quantidades de localizadores: " + aventureiro.getQuantidadeDePontos());
                    buttonDireita.setVisible(false);
                    buttonBaixo.setVisible(false);
                    buttonCima.setVisible(false);
                    buttonEsquerda.setVisible(false);
                }
            }
        });

        frame.add(panel);

        frame.setVisible(true);

    }
}
