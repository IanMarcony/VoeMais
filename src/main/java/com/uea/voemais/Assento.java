package com.uea.voemais;


public class Assento {
    private int numero;
    private String tipoAssento;
    private boolean disponivel;

    public Assento(int numero, String tipoAssento, boolean disponivel) {
        this.numero = numero;
        this.tipoAssento = tipoAssento;
        this.disponivel = disponivel;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoAssento() {
        return tipoAssento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoAssento(String tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
}
