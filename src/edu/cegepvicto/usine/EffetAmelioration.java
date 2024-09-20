package edu.cegepvicto.usine;

/**
 * Classe qui applique un effet d'amélioration à un usine. La classe
 * doit être spécialisée pour être appliquée à une caractéristique.
 */
public class EffetAmelioration {

    /**
     * Valeur modifiée par l'amélioration.
     */
    private int valeur;

    /**
     * Nom de la caractéristique modifiée.
     */
    private String caracteristique;

    /**
     * Applique un effet à l'usine.
     * @param usine l'usine qui reçoit l'effet d'amélioration.
     */
    public void appliquerEffet(Usine usine) {
        usine.changerCaracteristique(caracteristique, valeur);
    }
}
