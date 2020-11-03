package fr.romgrm;
public class Grille {

    private char[][] plateau;

    public Grille(){
        plateau = new char[3][3];
    }

    public void remplirTableau(){
        System.out.println(plateau);
    }
    
}