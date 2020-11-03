package fr.romgrm;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        /* CREATION DES OBJETS */ 
        // Create Player
        Joueur joueur1 = new Joueur("Player_1", 1); 
        // Create Grid
        Grille plateau = new Grille(); 


        /* START PLAYING */ 

        System.out.println("\n" + "Bienvenue à toi jeune entrepreneur, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in); 
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0); 

        System.out.println("\n" + "Tu es donc le 1er joueur avec le symbole : " + chooseSymbol + "\n"+" Le second joueur aura le symbole : ");
        //System.out.println("\n" + "Bienvenue " + joueur1 + " !" + "\n");

        plateau.remplirTableau();

        
    }
}
