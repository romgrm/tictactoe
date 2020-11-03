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
    char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
    public void chooseSymboleJoueur1(){
        //Scanner scan = new Scanner(System.in);
        try {
            // char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            if(chooseSymbol == 'x' || chooseSymbol =='X'){
              this.symbolJoueur = 'X';  
            }else if(chooseSymbol == 'o' || chooseSymbol =='O'){
                this.symbolJoueur = 'O';  
              }
            System.out.println("\n" + "Tu es donc le 1er joueur avec le symbole : "  + this.symbolJoueur + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
    }
    // public void chooseSymboleJoueur2(){
    //     if(this.chooseSymbol == 'x' || this.chooseSymbol == 'X'){
    //         this.symbolJoueur = 'O';  
    //       }else if(this.chooseSymbol == 'o' || this.chooseSymbol =='O'){
    //           this.symbolJoueur = 'X';  
    //         }
    //     System.out.println("\n" + "Tu es donc le second joueur avec le symbole : " + this.symbolJoueur);
    // }

}