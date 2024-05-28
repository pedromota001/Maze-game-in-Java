package br.com.mazeProject.projetoPOO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import br.com.mazeProject.projetoPOO.Labirinto;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        //inicializando o aventureiro
        Aventureiro aventureiro = new Aventureiro("Aventureiro" , 0, 0);

        //criaçao do frame e do panel do gui swingx
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());

        //criaçao da imagem e do arquivo imagem, o primeiro utilizado para dar imagem propriamente dito e o imagefile para verificação se existe esse arquivo
        ImageIcon image = new ImageIcon("../Maze-game-in-Java/br/com/mazeProject/projetoPOO/fotos/gameover.png");
        File imageFile = new File("../Maze-game-in-Java/br/com/mazeProject/projetoPOO/fotos/gameover.png");

        //tratamento de excessao
        try{
            if(!imageFile.exists()){
                System.out.println("Imagem não encontrada!");
            } else{
                BufferedImage imagem = ImageIO.read(imageFile);
                if(imagem == null){
                    System.out.println("Erro ao carregar à imagem: formato não suportado!");
                } else{
                    System.out.println("Imagem carregada com sucesso!");
                }

            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo da imagem" + e.getMessage());
        }

        //criaçao do label para messagens
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setPreferredSize(new Dimension(200,200));

        //definição do tamanho do butao e criacao de aba para retorno de mensagens com relação ao labirinto
        Dimension buttonSize = new Dimension(50,50);
        JTextArea messageArea = new JTextArea(5,20);
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        //configuraçoes de butoes
        JButton buttonCima = new JButton("↑");
        buttonCima.setPreferredSize(buttonSize);

        JButton buttonBaixo = new JButton("↓");
        buttonBaixo.setPreferredSize(buttonSize);

        JButton buttonEsquerda = new JButton("←");
        buttonEsquerda.setPreferredSize(buttonSize);

        JButton buttonDireita = new JButton("→");
        buttonDireita.setPreferredSize(buttonSize);

        GridBagConstraints gbc = new GridBagConstraints();

        //posiçoes das coisas no gui swing
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

        //definindo as especificações do frame
        frame.setSize(900,650);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setTitle("Labirinto de Lex!");
        frame.getContentPane().setBackground(new Color(135, 248, 140));

        //caixa de dialogo inicial
        JOptionPane.showMessageDialog(null, "BEM-VINDO AVENTUREIRO", "LABIRINTO", JOptionPane.INFORMATION_MESSAGE);

        //input do tamanho do labirinto
        String stringLab = JOptionPane.showInputDialog("Digite o tamanho do labirinto que você deseja jogar: ");
        int tamanhoLab = Integer.parseInt(stringLab);
        Labirinto labirinto = new Labirinto(tamanhoLab);
        labirinto.gerarLabirinto();

        //atribuindo ações para os botoes
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
                    messageLabel.setIcon(image);
                    messageLabel.setText("PONTOS: " + aventureiro.getQuantidadeDePontos() + "   MOEDAS: " + aventureiro.getQtdMoedas());
                    messageLabel.setHorizontalTextPosition(JLabel.CENTER);
                    messageLabel.setVerticalTextPosition(JLabel.BOTTOM);
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
                    messageLabel.setIcon(image);
                    messageLabel.setText("PONTOS: " + aventureiro.getQuantidadeDePontos() + "   MOEDAS: " + aventureiro.getQtdMoedas());
                    messageLabel.setHorizontalTextPosition(JLabel.CENTER);
                    messageLabel.setVerticalTextPosition(JLabel.BOTTOM);
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
                    messageLabel.setIcon(image);
                    messageLabel.setText("PONTOS: " + aventureiro.getQuantidadeDePontos() + "   MOEDAS: " + aventureiro.getQtdMoedas());
                    messageLabel.setHorizontalTextPosition(JLabel.CENTER);
                    messageLabel.setVerticalTextPosition(JLabel.BOTTOM);
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
                    messageLabel.setIcon(image);
                    messageLabel.setText("PONTOS: " + aventureiro.getQuantidadeDePontos() + "   MOEDAS: " + aventureiro.getQtdMoedas());
                    messageLabel.setHorizontalTextPosition(JLabel.CENTER);
                    messageLabel.setVerticalTextPosition(JLabel.BOTTOM);
                    buttonDireita.setVisible(false);
                    buttonBaixo.setVisible(false);
                    buttonCima.setVisible(false);
                    buttonEsquerda.setVisible(false);
                }
            }
        });

        //adicionando o painel
        frame.add(panel);

        //tornando o visivel
        frame.setVisible(true);

    }
}
