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

        System.out.println("Bienvenue à toi jeune entrepreneur, quel est ton nom ? ");
        Scanner scan = new Scanner(System.in); 
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("très bien " + entreTonNom + ", choisit une lettre, soit X, soit O : ");

        System.out.println("\n" + "Bienvenue " + joueur1 + " !" + "\n");

        plateau.remplirTableau();

        
    }
}
