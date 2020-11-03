package fr.romgrm;

import java.util.Arrays;

public class Grille {

    //private char[][] plateau;

    // public Grille(){
    //     plateau = new char[3][3];
    // }

    public void remplirTableau(){
        char[][] plateau = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};
                            
        for (char[] row : plateau) {
            for (char column : row) {
                System.out.println(column);
            }
            System.out.println();
        }
        
        System.out.println(Arrays.toString(plateau));
    }
    
}