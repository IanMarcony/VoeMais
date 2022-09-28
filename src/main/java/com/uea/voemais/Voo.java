package com.uea.voemais;

public class Voo {
    private String horarioDePartida;
    private String horarioDeChegada;
    private int totalDisponivel;
    private int numeroDeParadas;
    private String preco;

    public Voo(String horarioDePartida, String horarioDeChegada, int totalDisponivel, int numeroDeParadas, String preco) {
        this.horarioDePartida = horarioDePartida;
        this.horarioDeChegada = horarioDeChegada;
        this.totalDisponivel = totalDisponivel;
        this.numeroDeParadas = numeroDeParadas;
        this.preco = preco;
    }

    public String getHorarioDePartida() {
        return horarioDePartida;
    }

    public String getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public int getTotalDisponivel() {
        return totalDisponivel;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public String getPreco() {
        return preco;
    }

    public void setHorarioDePartida(String horarioDePartida) {
        this.horarioDePartida = horarioDePartida;
    }

    public void setHorarioDeChegada(String horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }

    public void setTotalDisponivel(int totalDisponivel) {
        this.totalDisponivel = totalDisponivel;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    
}
