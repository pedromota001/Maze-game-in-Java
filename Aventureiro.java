import br.com.mazeProject.projetoPOO.tesouro.Tesouro;

import java.util.ArrayList;

public class Aventureiro {
    private String nome;
    private int posicao;
    private ArrayList<Tesouro> tesourosColetados;

    public Aventureiro(String nome, int posicao){
        this.nome = nome;
        this.posicao = posicao;
        this.tesourosColetados = new ArrayList<>();
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setPosicao(int posicao){
        this.posicao = posicao;
    }

    int getPosicao(){
        return posicao;
    }

    void setTesourosColetados(ArrayList<Tesouro> tesourosColetados){
        this.tesourosColetados = tesourosColetados;
    }

    public ArrayList<Tesouro> getTesourosColetados() {
        return tesourosColetados;
    }
}
