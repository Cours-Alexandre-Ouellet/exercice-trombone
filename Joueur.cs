namespace exercice_trombone
{
    /// <summary>
    /// Joueur de la partie.
    /// </summary>
    internal class Joueur
    {
        /// <summary>
        /// Argent total du joueur.
        /// </summary>
        private int argent;

        /// <summary>
        /// Paie le montant donné si le joueur a assez d'argent.
        /// </summary>
        /// <param name="montant">Le montant à payer.</param>
        /// <returns>True si le montant a été payé, false sinon.</returns>
        public bool Payer(int montant)
        {
            if (argent >= montant)
            {
                argent -= montant;
                return true;
            }

            return false;
        } 
    }
}
