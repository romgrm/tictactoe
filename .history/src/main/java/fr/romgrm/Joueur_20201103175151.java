package fr.romgrm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur{
   
    // Attributs de class
    private String name; 
    private int numJoueur; 
    private App app; 

    // Constructor
    public Joueur(String name, int numJoueur) {
        this.name = name; 
        this.numJoueur = numJoueur; 
    }
    /*GETTER & SETTER */ 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getNumJoueur() {
		return numJoueur;
	}
	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
    }
    ///////////////////////////////

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }

    /*CHOISIR SYMBOLE POUR LES PLAYERS */ 

    public void chooseSymbole(){
        Scanner scan = new Scanner(System.in);
        try {
            char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            if(chooseSymbol == 'x' || chooseSymbol =='X'){
              this.name = "Joueur 1";  
            }
            System.out.println("\n" + "Tu es donc le 1er joueur avec le symbole : "  + chooseSymbol + "\n"+" Le second joueur aura le symbole : " + name);
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
    }

}