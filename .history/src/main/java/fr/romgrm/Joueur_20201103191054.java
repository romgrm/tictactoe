package fr.romgrm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur{
   
    // Attributs de class
    private String name; 
    private char symbolJoueur; 
    private App app; 

    // Constructor
    public Joueur(String name, char symbolJoueur) {
        this.name = name; 
        this.symbolJoueur = symbolJoueur; 
    }
    /*GETTER & SETTER */ 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getsymbolJoueur() {
		return symbolJoueur;
	}
	public void setsymbolJoueur(char symbolJoueur) {
		this.symbolJoueur = symbolJoueur;
    }
    ///////////////////////////////

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }

    /*CHOISIR SYMBOLE POUR LES PLAYERS */ 


     Scanner scan = new Scanner(System.in);
     //char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
    public void chooseSymboleJoueur1(){
        //Scanner scan = new Scanner(System.in);
        try {
            char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            if(chooseSymbol == 'x' || chooseSymbol =='X'){
              this.symbolJoueur = 'X';  
            }else if(chooseSymbol == 'o' || chooseSymbol =='O'){
                this.symbolJoueur = 'O';  
              }
            System.out.println("\n" + "Tu es donc le " + this.name + " et tu auras le symbole : "  + this.symbolJoueur + "\n");
            
            //System.out.println("le joueur 2 aura donc le symbole : " + this.symbolJoueur);
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
    }
    public void chooseSymboleJoueur2(){
        chooseSymboleJoueur1();
        // if(symbolJoueur == 'x' || symbolJoueur == 'X'){
        //     this.symbolJoueur = 'Y'; 
        // }
        System.out.println("\n" + "Le " + this.name + " auras donc le symbole : "  + this.symbolJoueur + "\n");
    }

}