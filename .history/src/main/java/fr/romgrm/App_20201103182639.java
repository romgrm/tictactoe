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

        /* CREATION DES JOUEURS */ 
        Joueur joueur1 = new Joueur("Player_1", ' '); 
        Joueur joueur2 = new Joueur("Player_2", ' '); 

        /*CREATION DE LA GRID */
        Grille plateau = new Grille(); 


        /* START PLAYING */ 

        System.out.println("\n" + "Bienvenue à toi jeune entrepreneur, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in); 
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        /*CHOOSE SYMBOL*/
        joueur1.chooseSymbole();
        joueur2.chooseSymbole2();

       

        plateau.remplirTableau();

        
    }
}
