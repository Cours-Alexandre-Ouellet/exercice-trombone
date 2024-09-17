namespace exercice_trombone
{
    /// <summary>
    /// Amélioration des caractéristiques d'une usine.
    /// </summary>
    public class Amelioration
    {
        /// <summary>
        /// Cout d'achat de l'amélioration.
        /// </summary>
        public int Cout { get; private set; }

        /// <summary>
        /// Temps pour recherché l'amélioration.
        /// </summary>
        public int TempsRecherche { get; private set; }

        /// <summary>
        /// Amélioration de la qualité des trombones produits.
        /// </summary>
        public int Qualite { get; internal set; }

        /// <summary>
        /// Amélioration de la quantité de matière consommée.
        /// </summary>
        public int QuantiteConsommee { get; private set; }

        /// <summary>
        /// Amélioration de la vitesse de production.
        /// </summary>
        public int VitesseProduction { get; private set; }
    }
}