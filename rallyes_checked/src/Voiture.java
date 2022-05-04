/**
 * Une voiture (classe Voiture) est caractérisée par une information supplémentaire indiquant sa catégorie (« course » ou « tourisme »).
 *
 * Les méthodes de Voiture sont :
 * - Un constructeur.
 *
 * - Une méthode toString renvoyant la représentation d’une voiture sous la forme d’une String, qui respecte strictement le format suivant :
 * <nom> -> vitesse max = <vitesse max> km/h, poids = <poids> kg, Voiture de <categorie>
 * où <nom> est le nom du véhicule, <vitesse max> sa vitesse maximale, <poids>, son poids et <categorie>, sa catégorie ;
 *
 * - Une méthode estDeuxRoues testant si le véhicule est un deux-roues. Dans le cas d'une voiture, c'est évidemment faux, et c'est la valeur par défaut de véhicule (faux) qui s'applique.
 */
public class Voiture extends Vehicule {

    private final String categorie;

    public Voiture(String nom, double vitesseMax, int poids, int carburant, String categorie) {
        super(nom, vitesseMax, poids, carburant);
        this.categorie = categorie;
    }

    public String toString() {
        return super.toString() + ", Voiture de " + this.categorie;
    }

    public boolean estDeuxRoues() {
        return super.estDeuxRoues();
    }

    public String getCategorie() {
        return this.categorie;
    }

}
