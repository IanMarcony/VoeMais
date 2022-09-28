package com.uea.voemais;

public class Aviao {
    private String nomeDaCompanhia;
    private String nomeDoAviao;

    public Aviao(String nodeDaCompanhia, String nomeDoAviao){
        this.nomeDaCompanhia = nomeDaCompanhia;
        this.nomeDoAviao = nomeDoAviao;
    }
    
    public String getNomeDaCompanhia(){
        return this.nomeDaCompanhia;
    }
    
    public void setNomeDaCompanhia(String nomeDaCompanhia){
        this.nomeDaCompanhia = nomeDaCompanhia;
    }
    
    public String getNomeDoAviao(){
        return this.nomeDoAviao;
    }
    
    
    public void  setNomeDoAviao(String nomeDoAviao){
        this.nomeDoAviao = nomeDoAviao;
    }
    
}
