/**
 * Les méthodes publiques de la classe Rare sont :
 *
 * — des constructeurs, avec l’ordre suivant pour les paramètres : le code, l’année d’émission, le pays d’origine, la valeur faciale et le nombre d’exemplaires recensés.
 * Le nombre d’exemplaires doit toujours être fourni lors des appels aux constructeurs.
 * Les autres paramètres, s’ils ne sont pas fournis, ont les valeurs par défaut indiquées pour les timbres de base ;
 *
 * — un getter getExemplaires() ;
 *
 * — une méthode toString() produisant une représentation d’un Rare respectant strictement le format suivant :
 * Timbre de code <code> datant de <annee> (provenance <pays>) ayant pour valeur faciale <valeur faciale> euros
 * Nombre d’exemplaires -> <exemplaires>
 *
 * - Il doit être possible de calculer le prix de vente d’un timbre Rare au moyen d’une méthode double vente().
 * Le prix de vente d’un timbre rare part du calcul d’un prix de base : de 600 euros si le nombre d’exemplaires recensés est inférieur à 100, de 400 francs si le nombre d’exemplaires est entre 100 et 1000 et 50 euros sinon. Le prix de vente du timbre est alors donné par la formule prix_base * (age_timbre / 10.0). Les différentes constantes impliquées dans le calcul sont données en attribut de la classe Timbre.
 *
 */

public class Rare extends Timbre {

    private final int nombreexemplaires;

    public Rare(int nombreexemplaires) {
        super();
        this.nombreexemplaires = nombreexemplaires;
    }

    public Rare(String code, int nombreexemplaires) {
        super(code);
        this.nombreexemplaires = nombreexemplaires;
    }

    public Rare(String code, int annee, int nombreexemplaires) {
        super(code, annee);
        this.nombreexemplaires = nombreexemplaires;
    }

    public Rare(String code, int annee, String paysorigine, int nombreexemplaires) {
        super(code, annee, paysorigine);
        this.nombreexemplaires = nombreexemplaires;
    }

    public Rare(String code, int annee, String paysorigine, double valeurfaciale, int nombreexemplaires) {
        super(code, annee, paysorigine, valeurfaciale);
        this.nombreexemplaires = nombreexemplaires;
    }

    public int getExemplaires() {
        return this.nombreexemplaires;
    }

    public String toString() {
        return "Timbre de code " + this.getCode() + " datant de " + this.getAnnee() + " (provenance " + this.getPays() + ") ayant pour valeur faciale " + getValeurFaciale() + " euros" + "\n" + "Nombre d'exemplaires -> " + this.nombreexemplaires;
    }

    public double vente() {
        double prixvente = 0;
        double prixbase = 0;
        if (this.nombreexemplaires < BASE_1_EXEMPLAIRES) {
            prixbase = PRIX_BASE_1;
        } else if (this.nombreexemplaires >= BASE_1_EXEMPLAIRES && this.nombreexemplaires <= BASE_2_EXEMPLAIRES) {
            prixbase = PRIX_BASE_2;
        } else {
            prixbase = PRIX_BASE_3;
        }
        prixvente = prixbase * (this.age()/10.0);
        return prixvente;
    }

}
