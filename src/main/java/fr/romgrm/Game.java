package fr.romgrm;

import java.util.Scanner; 

public class Game {
    public void gameInit() {
        
        /* INITIALISATION DU JEU */ 
        System.out.println("\n" + "Bienvenue à toi jeune entrepreneur, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in);
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        Joueur joueur1 = new Joueur("Player_1", ' '); 
        Joueur joueur2 = new Joueur("Player_2", ' ');

        joueur1.chooseSymboleJoueur1();
        
        if(joueur1.getsymbolJoueur() == 'x' || joueur1.getsymbolJoueur() == 'X'){
            joueur2.setsymbolJoueur('O');
        }else{
            joueur2.setsymbolJoueur('X');
        }
        joueur2.chooseSymboleJoueur2();
    }
}