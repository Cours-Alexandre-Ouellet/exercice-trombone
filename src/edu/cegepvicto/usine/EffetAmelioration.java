package edu.cegepvicto.usine;

/**
 * Classe qui applique un effet d'amélioration à un usine. La classe
 * doit être spécialisée pour être appliquée à une caractéristique.
 */
public abstract class EffetAmelioration {

    /**
     * Valeur modifiée par l'amélioration.
     */
    protected int valeur;

    /**
     * Applique un effet à l'usine.
     * @param usine l'usine qui reçoit l'effet d'amélioration.
     */
    public abstract void appliquerEffet(Usine usine);
}
