package classes;

import java.util.ArrayList;

public class Semestre {
    private String nome;
    private boolean ativa;
    private ArrayList<iObserver> observadores;

   
    public Semestre(String nome, boolean ativa) {
        this.nome = nome;
        this.ativa = ativa;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean Ativada() {
        return ativa;
    }

   
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
        notifyObserver();
    }

    public void addObervadores (iObserver observer){
        observadores.add(observer);
    }

    public void removeObervadores (iObserver observer){
        observadores.remove(observer);
    }

    public void notifyObserver() {
        for (int i = 0; i < observadores.size(); i++) {
       observadores.get(i).update(ativa);
    }
}
}