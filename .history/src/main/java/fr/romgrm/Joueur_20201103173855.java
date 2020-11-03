package fr.romgrm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur{
   
    // Attributs de class
    private String name; 
    private int numJoueur; 

    // Constructor
    public Joueur(String name, int numJoueur) {
        this.name = name; 
        this.numJoueur = numJoueur; 
    }
    //GETTER 
	public String getName() {
		return name;
	}
    //SETTER 
	public void setName(String name) {
		this.name = name;
	}
    //GETTER
	public int getNumJoueur() {
		return numJoueur;
	}
    //SETTER 
	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
    }
    

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }

    public void chooseSymbole(){
        Scanner scan = new Scanner(System.in);
        try {
            char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            System.out.println("\n" + "Tu es donc le 1er joueur avec le symbole : "  + chooseSymbol + "\n"+" Le second joueur aura le symbole : ");
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
    }

}