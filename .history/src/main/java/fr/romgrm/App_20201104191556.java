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
        System.out.println("Voici la grille de jeu : ");
        plateau.displayGrille();
        System.out.println("\n" + "A ton tour " + joueur1.getName() + " , choisit la ligne ou tu souhaites mettre ton pion, entre 1 et 3 : ");
        
        Scanner scan2 = new Scanner(System.in);
        int entreePlayerRow = scan2.nextInt(3);
        System.out.println("\n" + "Ensuite, choisit lettre que tu veux pour la colonne : ");
        String entreePlayerColumn = scan2.next().toLowerCase();
        int column = -1;
        int row = -1;
        
        switch (entreePlayerColumn) {
            case "a":
                column = 0;
                break;
            case "b":
                column = 1;
                break;
            case "c":
                column = 2;
                break;
            default:
                System.out.println("Cette colonne n'existe pas! Entrez a, b ou c .");
                break;
        }

        switch (entreePlayerRow) {
            case 1:
                row = 0;
                break;
            case 2:
                row = 1;
            case 3:
                row = 2;     
            default:
                System.out.println("Cette ligne n'existe pas! Entrez 1, 2 ou 3 .");
                break;
        }
         

        
        //X.pionPlayer(joueur1);
        //jeu[entreePlayerRow][entreePlayerColumn] = X;

       
    }
}
