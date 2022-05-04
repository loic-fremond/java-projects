/**
 * Une instance de Transport sera caractérisée par un booléen indiquant si le trajet est long.
 *
 * Le prix du transport vaut la constante TARIF_LONG (1500.0) si le trajet est long et TARIF_BASE (200.0) sinon, auquel on ajoutera le prix forfaitaire de l’option. Les constantes seront publiquement accessibles.
 *
 * La classe OptionVoyage se spécialise en deux sous-classes : Transport et Sejour.
 *
 * La hiérarchie de classes sera dotée :
 *
 * — de constructeurs. Les arguments sont dans l’ordre : le nom, le prix forfaitaire et un booléen (valant true si le trajet est long et false sinon) pour les Transport.
 * Par défaut, un Transport a un trajet court.
 *
 * — de redéfinitions spécifiques de la méthode prix. Ces spécialisations ne contiennennt aucune duplication de code et sont utilisables de façon polymorphique.
 *
 */
public class Transport extends OptionVoyage {

    private final boolean trajetLong;
    public static final double TARIF_LONG = 1500.0;
    public static final double TARIF_BASE = 200.0;

    public Transport(String nom, double prixForfaitaire, boolean trajetLong) {
        super(nom, prixForfaitaire);
        this.trajetLong = trajetLong;
    }

    public Transport(String nom, double prixForfaitaire) {
        super(nom, prixForfaitaire);
        this.trajetLong = false;
    }

    public double prix() {
        double prixTransport;
        if (this.trajetLong) {
            prixTransport = TARIF_LONG + super.prix();
        } else {
            prixTransport = TARIF_BASE + super.prix();
        }
        return prixTransport;
    }

}
