namespace exercice_trombone
{
    /// <summary>
    /// Un effet possible d'une amélioration.
    /// </summary>
    internal abstract class EffetAmelioration
    {
        /// <summary>
        /// Valeur modifiée par l'effet
        /// </summary>
        protected int valeur;

        /// <summary>
        /// Applique l'effet sur l'usine.
        /// </summary>
        /// <param name="usine">L'usine qui reçoit l'effet.</param>
        public abstract void AppliquerEffet(Usine usine);
    }
}