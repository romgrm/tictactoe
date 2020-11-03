package fr.romgrm;

public class Joueur{
   
    // Attributs de class
    private String name; 
    private int numJoueur; 

    // Constructor
    public Joueur(String name, int numJoueur) {
        this.name = name; 
        this.numJoueur = numJoueur; 
    }
    //GETTER 
	public String getName() {
		return name;
	}
    //SETTER 
	public void setName(String name) {
		this.name = name;
	}
    //GETTER
	public int getNumJoueur() {
		return numJoueur;
	}
    //SETTER 
	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
    }
    

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }



}