package fr.romgrm;

import java.util.Arrays;


 public class Grille {
    // je créer un array double de la class Pion car mon tableau va recevoir des "Pions" (considéré comme un type), de valeur char
    Pion[][] plateau;


public Grille() {
    //Avec mon constructor j'initialise mon tableau avec 3 lignes et 3 columns pour faire 9 cases comme dans un morpion
    this.plateau = new Pion[3][3];
}



public void displayGrille(){
    //je créer une fonction qui va m'afficher mon tableau graphiquement grâce a des traits. Les numéros et chiffres vont aider l'utilisateur à placer son pion
    System.out.println("      A      B      C");
        for(int i = 0 ; i< this.plateau.length ; i++){
            System.out.println((i+1) +" | " + this.plateau[i][0] + " | " + this.plateau[i][1] + " | " + this.plateau[i][2] + " |");
            if(i<2) {
                System.out.println("  ----------------------");
            }
        }
}

/** GETTER & SETTER */
public Pion[][] getPlateau() {
    return plateau;
}

// public void setPlateau(int row, int column) {
//     this.plateau[row][column].forme('O'); 
// };









//     int number; 
//     char[][] plateau = {{' ', '|', ' ', '|', ' '},
//                             {'-', '+', '-', '+', '-'},
//                             {' ', '|', ' ', '|', ' '},
//                             {'-', '+', '-', '+', '-'},
//                             {' ', '|', ' ', '|', ' '}};

//     public Grille(){
//         this.plateau = plateau; 
//         this.number = 1;
//     }

    
        
//         //printPlateau(plateau); 
//         //System.out.println(printPlateau(plateau));                    
        
    
//     public static void  printPlateau(char[][] plateau){
//         // for (int i = 0; i < plateau.length; i++) {
//         //     for (int j = 0; j < plateau[i].length; j++) {
//         //         plateau[i][j] =   
//         //     }
//         // }
        
        
//         for (char[] row : plateau) {
//             for (char column : row) {
//                 System.out.print(column);
//             }
//         System.out.println();
//         }
//     }
    
 }