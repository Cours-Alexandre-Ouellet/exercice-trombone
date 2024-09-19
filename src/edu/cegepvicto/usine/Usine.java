package edu.cegepvicto.usine;

/**
 * Usine qui permet la production des trombones.
 */
public class Usine {

    /**
     * Qualité des trombones fabriqués.
     */
    private int qualite;

    /**
     * Matière consommée par la production de chaque trombone.
     */
    private int matiereConsommee;

    /**
     * Vitesse à laquelle la production des trombones se fait.
     */
    private int vitesseProduction;

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
    }

    /**
     * Accesseur de la qualité des trombones..
     * @return la valeur de la qualité des trombones.
     */
    public int getQualite() {
        return qualite;
    }

    /**
     * Mutateur de la qualité des trombones.
     * @param qualite la nouvelle qualité des trombones
     */
    public void setQualite(int qualite) {
        this.qualite = qualite;
    }

    /**
     * Accesseur de la quantité de matière consommée.
     * @return la quantité de matière consommée par la création de trombones.
     */
    public int getMatiereConsommee() {
        return matiereConsommee;
    }

    /**
     * Mutateur de la quantité de matière consommée par la création de trombones.
     * @param matiereConsommee la nouvelle quantité de matière consommée par la création de trombones.
     */
    public void setMatiereConsommee(int matiereConsommee) {
        this.matiereConsommee = matiereConsommee;
    }

    /**
     * Accesseur de la vitesse de production.
     * @return la valeur de la vitesse de production.
     */
    public int getVitesseProduction() {
        return vitesseProduction;
    }

    /**
     * Mutateur de la vitesse de production de l'usine.
     * @param vitesseProduction la nouvelle vitesse de production de l'usine.
     */
    public void setVitesseProduction(int vitesseProduction) {
        this.vitesseProduction = vitesseProduction;
    }

    /**
     * Achète une amélioration pour l'usine et applique les changements après le délai.
     * @param amelioration l'amélioration qui est achetée pour l'usine.
     */
    public void acheterAmelioration(Amelioration amelioration) {
        if(proprietaire.payer(amelioration.getCout())) {
            // Attendre amelioration.tempsRecherche

            amelioration.appliquerAmelioration(this);
        }
    }

}