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
        
        Joueur joueur1 = new Joueur("Player_1", 1); 
        

        System.out.println("Bienvenue " + joueur1 + " !");
    }
}
