package edu.cegepvicto.usine;

/**
 * Amélioration de la qualité de la production
 */
public class AmeliorationQualite extends EffetAmelioration {

    /**
     * @inheritDoc
     */
    @Override
    public void appliquerEffet(Usine usine) {
        usine.setQualite(usine.getQualite() + valeur);
    }
}
