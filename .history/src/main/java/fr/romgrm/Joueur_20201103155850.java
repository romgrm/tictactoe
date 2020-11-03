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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
    }
    
    @Override
    public String toString() {
        return 
            getName()+ " " + getNumJoueur();
    }



}