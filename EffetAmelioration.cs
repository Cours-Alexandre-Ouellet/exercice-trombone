
namespace exercice_trombone
{
    /// <summary>
    /// Représente un effet d'une amélioration.
    /// </summary>
    internal class EffetAmelioration
    {
        /// <summary>
        /// Modification faite de la valeur par l'effet de cette amélioration.
        /// </summary>
        private int valeur;

        /// <summary>
        /// Le nom de la caractéristique à modifier
        /// </summary>
        private string caracteristique;

        /// <summary>
        /// Applique l'effet sur l'usine.
        /// </summary>
        /// <param name="usine">L'usine qui reçoit l'effet.</param>
        public void AppliquerEffet(Usine usine)
        {
            usine.ChangerCaracteristique(caracteristique, valeur);
        }
    }
}