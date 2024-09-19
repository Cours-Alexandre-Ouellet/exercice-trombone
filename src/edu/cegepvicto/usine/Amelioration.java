package edu.cegepvicto.usine;

import java.util.ArrayList;

/**
 * Représente une façon d'améliorer la production de l'usine
 */
public class Amelioration {

    /**
     * Coût d'achat de l'amélioration.
     */
    private int cout;

    /**
     * Temps nécessaire pour rechercher l'amélioration.
     */
    private int tempsRecherche;

    /**
     * Liste des effets de l'amélioration.
     */
    private ArrayList<EffetAmelioration> effets;

    /**
     * Génère une nouvelle amélioration vide.
     */
    public Amelioration() {
        effets = new ArrayList<>();
    }

    /**
     * Accesseur du coût de l'amélioration.
     * @return le coût de l'amélioration.
     */
    public int getCout() {
        return cout;
    }

    /**
     * Accesseur du temps de recherche de l'amélioration.
     * @return le temps de recherche de l'amélioration.
     */
    public int getTempsRecherche() {
        return tempsRecherche;
    }

    /**
     * Applique une amélioration sur l'usine.
     * @param usine l'usine à améliorer.
     */
    public void appliquerAmelioration(Usine usine)
    {
        for (EffetAmelioration effet : effets) {
            effet.appliquerEffet(usine);
        }
    }
}
