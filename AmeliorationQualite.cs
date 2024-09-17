namespace exercice_trombone
{
    /// <summary>
    /// Effet d'amélioration de la qualité des trombones.
    /// </summary>
    internal class AmeliorationQualite : EffetAmelioration
    {
        /// <inheritdoc/>
        public override void AppliquerEffet(Usine usine)
        {
            usine.Qualite += valeur;
        }
    }
}
