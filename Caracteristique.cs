namespace exercice_trombone
{
    /// <summary>
    /// Caractéristique que peut posséder une usine
    /// </summary>
    internal class Caracteristique
    {

        /// <summary>
        /// La valeur de la caractéristique.
        /// </summary>
        public int Valeur { get; set; }

        /// <summary>
        /// Le nom de la caractéristique.
        /// </summary>
        public string Nom { get; private set; }

        /// <summary>
        /// Initialise une nouvelle instance de la classe Caracteristique.
        /// </summary>
        /// <param name="nom">Le nom de la nouvelle caractérique</param>
        /// <param name="valeur">La valeur de la nouvelle caractérique</param>
        public Caracteristique(string nom, int valeur)
        {
            Nom = nom;
            Valeur = valeur;
        }


    }
}