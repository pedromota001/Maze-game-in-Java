package br.com.mazeProject.projetoPOO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel controlPanel;
    private JTextArea messageArea;
    private Aventureiro aventureiro;
    private Labirinto labirinto;

    public Main() {
        labirinto = new Labirinto(10); // Tamanho do labirinto 10x10
        labirinto.gerarLabirinto();
        aventureiro = new Aventureiro("Aventureiro", 0, 0); // Posição inicial do aventureiro

        setTitle("Maze Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Área de Mensagens
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        add(new JScrollPane(messageArea), BorderLayout.CENTER);

        // Painel de Controle
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 3));

        JButton upButton = new JButton("↑");
        JButton downButton = new JButton("↓");
        JButton leftButton = new JButton("←");
        JButton rightButton = new JButton("→");

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveAventureiro(0, -1);
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveAventureiro(0, 1);
            }
        });

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveAventureiro(-1, 0);
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveAventureiro(1, 0);
            }
        });

        controlPanel.add(new JLabel(""));
        controlPanel.add(upButton);
        controlPanel.add(new JLabel(""));
        controlPanel.add(leftButton);
        controlPanel.add(new JLabel(""));
        controlPanel.add(rightButton);
        controlPanel.add(new JLabel(""));
        controlPanel.add(downButton);
        controlPanel.add(new JLabel(""));

        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void moveAventureiro(int dx, int dy) {
        int newX = aventureiro.getPosicaox() + dx;
        int newY = aventureiro.getPosicaoy() + dy;

        if (newX >= 0 && newX < labirinto.getEstrutura().length && newY >= 0 && newY < labirinto.getEstrutura()[0].length) {
            aventureiro.setPosicaox(newX);
            aventureiro.setPosicaoy(newY);

            labirinto.exibicaoEmovimentacaoAventureiro(aventureiro);

            // Limpar a área de mensagens antes de exibir as novas mensagens
            messageArea.setText("");
            // Exibir todas as mensagens no GUI
            for (String message : labirinto.getMensagens()) {
                messageArea.append(message + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}

