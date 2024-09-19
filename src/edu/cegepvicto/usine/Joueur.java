package edu.cegepvicto.usine;

/**
 * Classe représentant la personne qui joue au jeu
 */
public class Joueur {

    /**
     * Les fonds disponibles par le joueur
     */
    private int argent;

    /**
     * Le joueur paie le montant indiqué si possible.
     * @param montant le montant à payer
     * @return true si le montant a pu être payé, false sinon.
     */
    public boolean payer(int montant) {
        if(argent >= montant) {
            argent -= montant;
            return true;
        }

        return false;
    }

}
