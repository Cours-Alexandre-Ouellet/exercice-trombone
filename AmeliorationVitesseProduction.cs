namespace exercice_trombone
{
    /// <summary>
    /// Effet d'amélioration de la vitesse de production des trombones.
    /// </summary>
    internal class AmeliorationVitesseProduction : EffetAmelioration
    {
        /// <inheritdoc/>
        public override void AppliquerEffet(Usine usine)
        {
            usine.VitesseProduction += valeur;
        }
    }
}
