/**
 * Une option (classe OptionVoyage) est caractérisée par :
 *
 * — son nom, une chaîne de caractères ;
 *
 * — et son prix forfaitaire (un double).
 *
 * La classe OptionVoyage se spécialise en deux sous-classes : Transport et Sejour.
 *
 * La classe OptionVoyage comporte :
 *
 * — un constructeur initialisant les attributs au moyen de valeurs passées en paramètre ;
 *
 * — une méthode getNom retournant le nom de l’option ;
 *
 * — une méthode double prix() retournant le prix forfaitaire de l’option ;
 *
 * — une méthode toString produisant une représentation de l’option sous la forme d’une chaîne de caractères, selon le format suivant :
 * <nom> -> <prix> euros
 *
 */
public class OptionVoyage {

    private final String nom;
    private final double prixForfaitaire;

    public OptionVoyage(String nom, double prixForfaitaire) {
        this.nom = nom;
        this.prixForfaitaire = prixForfaitaire;
    }

    public String getNom() {
        return this.nom;
    }

    public double prix() {
        return this.prixForfaitaire;
    }

    public String toString() {
        return this.nom + " -> " + this.prix() + " euros" ;
    }

}
