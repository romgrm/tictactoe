package fr.romgrm;

public class Pion{

     char forme; 
    //private int position;

    public Pion(char forme) {
        this.forme = forme;
        //this.position = position;
    }

    public char getForme() {
        return forme;
    }

    public void setForme(char symbolJoueur) {
        this.forme = symbolJoueur;
    }
  

    
}