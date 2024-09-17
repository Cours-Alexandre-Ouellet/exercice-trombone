namespace exercice_trombone
{
    /// <summary>
    /// Usine de fabrication de trombones.
    /// </summary>
    internal class Usine
    {
        /// <summary>
        /// Niveau de qualité des trombones produits.
        /// </summary>
        public int Qualite { get; set; }

        /// <summary>
        /// Quantité de matière consommée pour la production d'un trombone.
        /// </summary>
        public int QuantiteConsommee { get; set;}

        /// <summary>
        /// Vitesse de production des trombones.
        /// </summary>
        public int VitesseProduction { get; set;}

        /// <summary>
        /// Joueur qui possède l'usine.
        /// </summary>
        private Joueur proprietaire;

        /// <summary>
        /// Crée une nouvelle usine de base.
        /// </summary>
        /// <param name="proprietaire">Le joueur qui possède l'usine.</param>
        public Usine(Joueur proprietaire)
        {
            this.proprietaire = proprietaire;
            Qualite = 0;
            QuantiteConsommee = 100;
            VitesseProduction = 1;
        }

        /// <summary>
        /// Achète une amélioration et si possible applique ces effets.
        /// </summary>
        /// <param name="amelioration">L'amélioration à acheter.</param>
        public void AcheterAmelioration(Amelioration amelioration)
        {
            if(proprietaire.Payer(amelioration.Cout))
            {
                // Attendre amelioration.TempsRecherche

                amelioration.AppliquerAmelioration(this);
            }
        }
    }
}
