package edu.cegepvicto.usine;

/**
 * Applique l'effet d'amélioration de la matière consommée.
 */
public class AmeliorationMatiereConsommee extends EffetAmelioration {

    /**
     * @inheritDoc
     */
    @Override
    public void appliquerEffet(Usine usine) {
        usine.setMatiereConsommee(usine.getMatiereConsommee() + valeur);
    }
}
