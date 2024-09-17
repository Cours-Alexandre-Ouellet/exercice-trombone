
namespace exercice_trombone
{
    /// <summary>
    /// Représente un effet d'une amélioration.
    /// </summary>
    internal abstract class EffetAmelioration
    {
        /// <summary>
        /// Modification faite de la valeur par l'effet de cette amélioration.
        /// </summary>
        protected int valeur;

        /// <summary>
        /// Applique l'effet sur l'usine.
        /// </summary>
        /// <param name="usine">L'usine qui reçoit l'effet.</param>
        public abstract void AppliquerEffet(Usine usine);
    }
}