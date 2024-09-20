package edu.cegepvicto.usine;

/**
 * Gère la valeur d'une des caractéristiques de l'usine.
 */
public class Caracteristique {

    /**
     * Valeur de la caractéristique
     */
    private int valeur;

    /**
     * Nom de la caractéristique
     */
    private String nom;

    /**
     * Contruit une nouvelle caractéristique.
     * @param nom le nom de la caractéristique.
     * @param valeur la valeur associée à la caractéristique.
     */
    public Caracteristique(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    /**
     * Accesseur de la valeur de la caractéristique.
     * @return la valeur de la caractéristique
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * Mutateur de la valeur de la caractéristique.
     * @param valeur la nouvelle valeur de la caractéristique.
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * Accesseur du nom de la caractéristique.
     * @return le nom de la caractéristique.
     */
    public String getNom() {
        return nom;
    }

}
