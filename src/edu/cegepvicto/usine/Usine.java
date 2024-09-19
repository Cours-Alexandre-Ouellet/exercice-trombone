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
     * Achète une amélioration pour l'usine et applique les changements après le délai.
     * @param amelioration l'amélioration qui est achetée pour l'usine.
     */
    public void acheterAmelioration(Amelioration amelioration) {
        if(proprietaire.payer(amelioration.getCout())) {
            // Attendre amelioration.tempsRecherche

            qualite += amelioration.getQualite();
            matiereConsommee += amelioration.getMatiereConsommee();
            vitesseProduction += amelioration.getVitesseProduction();
        }
    }

}