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
        Grille jeu = new Grille(); 

        /* CREATION DES PIONS*/
        Pion X = new Pion('X'); // player_1
        Pion O = new Pion('O');

        /* START PLAYING */ 
        
        System.out.println("\n" + "Bienvenue à toi jeune entrepreneur, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in); 
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        /*CHOOSE SYMBOL FOR PLAYER_1 && ASSIGN SYMBOL FOR PLAYER_2*/
        joueur1.chooseSymboleJoueur1();
        if(joueur1.getsymbolJoueur() == 'x' || joueur1.getsymbolJoueur() == 'X'){
            joueur2.setsymbolJoueur('O');
        }else{
            joueur2.setsymbolJoueur('X');
        }
        joueur2.chooseSymboleJoueur2();
        
        /** ASSIGN PION TO PLAYER */

        
        /* LANCER UNE PARTIE */ 
        
        System.out.println("A ton tour " + joueur1.getName() + " , choisit ton rang entre 0 et 2 :");
        /*PRESENTATION DU TABLEAU */ 
        
        Scanner scan2 = new Scanner(System.in);
        int entreePlayerRow = scan2.nextInt() ;
        
        System.out.println("choisit ta colonne entre 0 et 2 :");
        int entreePlayerColumn = scan2.nextInt();
         

        jeu.displayGrille();
        
        jeu[entreePlayerRow][entreePlayerColumn] = X;

       
    }
}
