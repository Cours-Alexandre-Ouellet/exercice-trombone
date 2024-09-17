using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
        private int qualite;

        /// <summary>
        /// Quantité de matière consommée pour la production d'un trombone.
        /// </summary>
        private int quantiteConsommee;

        /// <summary>
        /// Vitesse de production des trombones.
        /// </summary>
        private int vitesseProduction;

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
            qualite = 0;
            quantiteConsommee = 100;
            vitesseProduction = 1;
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

                qualite += amelioration.Qualite;
                quantiteConsommee += amelioration.QuantiteConsommee;
                vitesseProduction += amelioration.VitesseProduction;
            }
        }
    }
}
