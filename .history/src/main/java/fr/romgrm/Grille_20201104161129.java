package fr.romgrm;

import java.util.Arrays;

public class Grille {

    private char[][] plateau; 

    public Grille(){
        this.plateau = 
        {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};
    }

    
        
        printPlateau(plateau); 
        //System.out.println(printPlateau(plateau));                    
        
    
    public static void  printPlateau(char[][] plateau){
        // for (int i = 0; i < plateau.length; i++) {
        //     for (int j = 0; j < plateau[i].length; j++) {
        //         plateau[i][j] =   
        //     }
        // }
        
        
        for (char[] row : plateau) {
            for (char column : row) {
                System.out.print(column);
            }
        System.out.println();
        }
    }
    
}