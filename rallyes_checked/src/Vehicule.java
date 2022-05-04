/**
 * Il s’agit d’abord d’implémenter une classe Vehicule permettant de représenter un véhicule participant aux courses.
 *
 * Les véhicules participant aux rallyes peuvent être soit des voitures soit des motos.
 *
 * Un véhicule est caractérisé par :
 * — son nom, une chaîne de caractères, comme « Ferrari » par exemple ;
 * — sa vitesse maximale (un double) ;
 * — son poids en kg (un int) ;
 * — et le niveau de carburant de son réservoir (un entier).
 *
 * La classe Vehicule comporte :
 *
 * — un constructeur, initialisant les attributs au moyen de valeurs passées en paramètre et un constructeur par défaut initialisant le nom à "Anonyme", le niveau de carburant à zéro, la vitesse maximale à 130 et le poids à 1000 ;
 *
 * — une méthode toString produisant une String contenant toutes les caractéristiques du véhicule sauf le niveau de carburant en respectant strictement le format suivant :
 * <nom> -> vitesse max = <vitesse max> km/h, poids = <poids> kg
 * où <nom> est le nom du véhicule, <vitesse max> sa vitesse maximale
 * et <poids>, son poids ;
 *
 * — une méthode meilleur(Vehicule autreVehicule) retournant true si l’instance courante a une strictement meilleure performance que autreVehicule ;
 *
 * — les « getters » getNom(), getVitesseMax(), getPoids() et getCarburant().
 *
 * - une méthode utilitaire double performance(). Cette méthode retourne une estimation de la performance du véhicule comme le rapport entre sa vitesse maximale et son poids (plus le véhicule est léger et rapide, meilleure est sa performance, car il consomme moins d’énergie).
 *
 * - une méthode estDeuxRoues permettant de déterminer si le véhicule est un deux-roues ou non. Par défaut, un véhicule ne sera pas un deux-roues.
 */
public class Vehicule {

    private final String nom;
    private final double vitesseMax;
    private final int poids;
    private final int carburant;

    public Vehicule(String nom, double vitesseMax, int poids, int carburant) {
        this.nom = nom;
        this.vitesseMax = vitesseMax;
        this.poids = poids;
        this.carburant = carburant;
    }

    public Vehicule() {
        this.nom = "Anonyme";
        this.vitesseMax = 130.0;
        this.poids = 1000;
        this.carburant = 0;
    }

    public String toString() {
        return this.nom + " -> vitesse max = " + this.vitesseMax + " km/h, poids = " + this.poids + " kg";
    }

    public boolean meilleur(Vehicule autreVehicule) {
        return this.performance() > autreVehicule.performance();
    }

    private double performance() {
        return this.vitesseMax/this.poids;
    }

    public String getNom() {
        return this.nom;
    }

    public double getVitesseMax() {
        return this.vitesseMax;
    }

    public int getPoids() {
        return this.poids;
    }

    public int getCarburant() {
        return this.carburant;
    }

    public boolean estDeuxRoues() {
        return false;
    }

}
