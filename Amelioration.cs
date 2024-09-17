
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
        /// Liste des effets appliqués par l'amélioration
        /// </summary>
        private List<EffetAmelioration> effets;

        /// <summary>
        /// Crée une nouvelle amélioration sans effet.
        /// </summary>
        public Amelioration()
        {
            effets = new();
        }

        /// <summary>
        /// Applique les effets sur l'usine
        /// </summary>
        /// <param name="usine">L'usine qui reçoit l'amélioration</param>
        internal void AppliquerAmelioration(Usine usine)
        {
            foreach(EffetAmelioration effet in effets)
            {
                effet.AppliquerEffet(usine);
            }
        }
    }
}