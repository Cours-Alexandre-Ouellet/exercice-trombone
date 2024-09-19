package edu.cegepvicto.usine;

import java.lang.annotation.Inherited;

/**
 * Améliore la vitesse de production d'un usine.
 */
public class AmeliorationVitesseProduction extends EffetAmelioration {

    /**
     * @inheritDoc
     */
    @Override
    public void appliquerEffet(Usine usine) {
        usine.setVitesseProduction(usine.getVitesseProduction() + valeur);
    }
}
