package edu.cegepvicto.usine;

/**
 * Représente une façon d'améliorer la production de l'usine
 */
public class Amelioration {

    /**
     * Changement dans la qualité de la production.
     */
    private int qualite;

    /**
     * Changement dans la qualité de matière consommée.
     */
    private int matiereConsommee;

    /**
     * Changement dans la vitesse de production.
     */
    private int vitesseProduction;

    /**
     * Coût d'achat de l'amélioration.
     */
    private int cout;

    /**
     * Temps nécessaire pour rechercher l'amélioration.
     */
    private int tempsRecherche;

    /**
     * Accesseur de l'amélioration de la qualité.
     * @return la valeur d'amélioration de la qualité.
     */
    public int getQualite() {
        return qualite;
    }

    /**
     * Accesseur de l'amélioration de la matière consommée.
     * @return la valeur de la matière consommée.
     */
    public int getMatiereConsommee(){
        return matiereConsommee;
    }

    /**
     * Accesseur de l'amélioration de la vitesse de production.
     * @return valeur d'amélioration de la vitesse de production.
     */
    public int getVitesseProduction() {
        return vitesseProduction;
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
}
