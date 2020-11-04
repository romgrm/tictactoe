package fr.romgrm;

public class Pion{

    private char forme; 
    //private int position;

    public Pion(char forme) {
        this.forme = forme;
        //this.position = position;
    }

    public void pionPlayer(Joueur joueur1){
        if(joueur1.getsymbolJoueur() == 'X'){
            System.out.println("le joueur 1 aura le symbole X"); 
        }; 
    }
}