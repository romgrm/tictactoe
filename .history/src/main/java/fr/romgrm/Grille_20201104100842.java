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
        //printPlateau(plateau); 
        //System.out.println(printPlateau(plateau));                    
        
    }
    public static void  printPlateau(char[][] plateau){
        for (char[] row : plateau) {
            for (char column : row) {
                System.out.print(column);
            }
        System.out.println();
        }
    }
    
}