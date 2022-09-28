
package com.uea.voemais;

public class Destino {
    private String aeroportoDeIda;
    private String aeroportoDeChegada;
    private String dataDeIda;
    private String dataDeChegada;

    public Destino(String aeroportoDeIda, String aeroportoDeChegada, String dataDeIda, String dataDeChegada) {
        this.aeroportoDeIda = aeroportoDeIda;
        this.aeroportoDeChegada = aeroportoDeChegada;
        this.dataDeIda = dataDeIda;
        this.dataDeChegada = dataDeChegada;
    }

    public String getAeroportoDeIda() {
        return aeroportoDeIda;
    }

    public String getAeroportoDeChegada() {
        return aeroportoDeChegada;
    }

    public String getDataDeIda() {
        return dataDeIda;
    }

    public String getDataDeChegada() {
        return dataDeChegada;
    }

    public void setAeroportoDeIda(String aeroportoDeIda) {
        this.aeroportoDeIda = aeroportoDeIda;
    }

    public void setAeroportoDeChegada(String aeroportoDeChegada) {
        this.aeroportoDeChegada = aeroportoDeChegada;
    }

    public void setDataDeIda(String dataDeIda) {
        this.dataDeIda = dataDeIda;
    }

    public void setDataDeChegada(String dataDeChegada) {
        this.dataDeChegada = dataDeChegada;
    }
    
    
}
