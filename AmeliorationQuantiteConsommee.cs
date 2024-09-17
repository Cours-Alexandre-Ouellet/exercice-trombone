namespace exercice_trombone
{
    /// <summary>
    /// Effet d'amélioration de la quantité de matière consommée lors de la production des trombones.
    /// </summary>
    internal class AmeliorationQuantiteConsommee : EffetAmelioration
    {
        /// <inheritdoc/>
        public override void AppliquerEffet(Usine usine)
        {
            usine.QuantiteConsommee += valeur;
        }
    }
}
