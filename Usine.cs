namespace exercice_trombone
{
    /// <summary>
    /// Usine de fabrication de trombones.
    /// </summary>
    internal class Usine
    {
        /// <summary>
        /// Liste des caracteristiques d'une usine.
        /// </summary>
        private List<Caracteristique> caracteristiques;

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
            caracteristiques = new List<Caracteristique>()
            {
                new Caracteristique("Qualite", 0),
                new Caracteristique("VitesseProduction" , 1),
                new Caracteristique("QuantiteConsommee", 100)
            };
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

        /// <summary>
        /// Change la valeur d'une caractéristique de l'usine en utilisant son nom.
        /// </summary>
        /// <param name="nom">Le nom de la caractéristique à changer.</param>
        /// <param name="changement">La valeur du changement à faire.</param>
        public void ChangerCaracteristique(string nom, int changement)
        {
            foreach(Caracteristique caracteristique in caracteristiques)
            {
                if(c.Nom == nom)
                {
                    c.Valeur += changement;
                    return;
                }
            }
        }
    }
}
