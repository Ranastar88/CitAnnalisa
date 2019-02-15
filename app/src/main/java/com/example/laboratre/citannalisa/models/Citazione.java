package com.example.laboratre.citannalisa.models;

public class Citazione {
    private String frase;
    private String immagine;

    public Citazione(){
        this.frase = "";
        this.immagine = "";
    }

    public Citazione(String f,String i){
        this.frase = f;
        this.immagine = i;
    }

    public String GetFrase(){
        return this.frase;
    }

    public void SetFrase(String frase){
        this.frase = frase;
    }

    public String GetImmagine(){
        return this.immagine;
    }

    public void SetImmagine(String immagine){
        this.immagine = immagine;
    }
}
