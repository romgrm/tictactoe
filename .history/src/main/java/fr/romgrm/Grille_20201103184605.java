package fr.romgrm;

import java.util.Arrays;

public class Grille {

    private char[][] plateau;

    public Grille(){
        plateau = new char[3][3];
    }

    public void remplirTableau(){
        
        System.out.println(Arrays.toString(plateau));
    }
    
}