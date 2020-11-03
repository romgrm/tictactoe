package fr.romgrm;

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
        // Create Player
        Joueur joueur1 = new Joueur("Player_1", 1); 
        // Create Grid
        Grille plateau = new Grille(); 

        System.out.println("\n" + "Bienvenue " + joueur1 + " !" + "\n");

        plateau.remplirTableau();

        
    }
}
