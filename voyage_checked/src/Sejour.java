/**
 * Une instance de Sejour sera caractérisée par le nombre de nuits (un entier) et le prix par nuit (un double).
 * Le prix d’un séjour est simplement le nombre de nuits multiplié par le prix par nuit, auquel on ajoutera le prix forfaitaire de l’option.
 *
 * La hiérarchie de classes sera dotée :
 *
 * — de constructeurs. Les arguments sont dans l’ordre : le nom, le prix forfaitaire, le nombre de nuits et le prix par nuit.
 *
 * — de redéfinitions spécifiques de la méthode prix. Ces spécialisations ne contiennennt aucune duplication de code et sont utilisables de façon polymorphique.
 */
public class Sejour extends OptionVoyage {

    private final int nombreNuits;
    private final double prixParNuit;

    public Sejour(String nom, double prixForfaitaire, int nombreNuits, double prixParNuit) {
        super(nom, prixForfaitaire);
        this.nombreNuits = nombreNuits;
        this.prixParNuit = prixParNuit;
    }

    public double prix() {
        return (this.nombreNuits*prixParNuit)+super.prix();
    }

}
