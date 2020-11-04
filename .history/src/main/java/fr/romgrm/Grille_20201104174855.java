package fr.romgrm;

import java.util.Arrays;


 public class Grille {
    Pion[][] plateau;
//     int number; 
//     char[][] plateau = {{' ', '|', ' ', '|', ' '},
//                             {'-', '+', '-', '+', '-'},
//                             {' ', '|', ' ', '|', ' '},
//                             {'-', '+', '-', '+', '-'},
//                             {' ', '|', ' ', '|', ' '}};

public Grille() {
    this.plateau = new Pion[3][3];
}



public void displayGrille(){
    System.out.println("      A      B       C");
        for(int i = 0 ; i< this.plateau.length ; i++){
            System.out.println((i+1) +" | " + this.plateau[i][0] + " | " + this.plateau[i][1] + " | " + this.plateau[i][2] + " |");
            if(i<2) {
                System.out.println("  ----------------------");
            }
        }
}

public Pion[][] getPlateau() {
    return plateau;
}

public void setPlateau(Pion[][] plateau) {
    this.plateau = plateau;
};

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