package edu.cegepvicto.usine;

import java.util.ArrayList;

/**
 * Usine qui permet la production des trombones.
 */
public class Usine {

    /**
     * Les caractéristiques de l'usine
     */
    private ArrayList<Caracteristique> caracteristiques;

    /**
     * Joueur qui possède l'usine de fabrication des trombones.
     */
    private Joueur proprietaire;

    /**
     * Crée une nouvelle usine de trombones.
     * @param proprietaire le propriétaire de l'usine.
     */
    public Usine(Joueur proprietaire) {
        this.proprietaire = proprietaire;
        caracteristiques = new ArrayList<>();

        caracteristiques.add(new Caracteristique("Qualité", 0));
        caracteristiques.add(new Caracteristique("VitesseProduction", 1));
        caracteristiques.add(new Caracteristique("MatiereConsommee", 100));
     }

    /**
     * Modifie la valeur d'une caractéristique.
     * @param nom le nom de la caractéristique modifiée.
     * @param changement la magnitude du changement de la caractéristique.
     */
    public void changerCaracteristique(String nom, int changement) {
        for(Caracteristique caracteristique : caracteristiques) {
            if(caracteristique.getNom().equals(nom)) {
                caracteristique.setValeur(caracteristique.getValeur() + changement);
            }
        }
    }

    /**
     * Achète l'amélioration et l'applique sur l'usine.
     * @param amelioration l'amélioration achetée.
     */
    public void acheterAmelioration(Amelioration amelioration) {
        if(proprietaire.payer(amelioration.getCout())) {
            // Attendre amelioration.tempsRecherche

            amelioration.appliquerAmelioration(this);
        }
    }

}