/**
 * Comme méthodes publiques, la classe Commemoratif doit en tout cas fournir :
 *
 * — des constructeurs conformes à la méthode main() fournie. Ces paramètres, s’ils ne sont pas fournis, ont les valeurs par défaut indiquées pour les timbres de base ;
 *
 * — une méthode toString() produisant une représentation d’un Commemoratif respectant strictement le format suivant :
 * Timbre de code <code> datant de <annee> (provenance <pays>) ayant pour valeur faciale <valeur faciale> euros
 * Timbre celebrant un evenement
 *
 * - Il doit être possible de calculer le prix de vente d’un timbre Commemoratif au moyen d’une méthode double vente().
 * Le prix de vente d’un timbre commémoratif est le double du prix de vente d’un timbre quelconque.
 *
 */
public class Commemoratif extends Timbre {

    public Commemoratif() {
        super();
    }

    public Commemoratif(String code) {
        super(code);
    }

    public Commemoratif(String code, int annee) {
        super(code,annee);
    }

    public Commemoratif(String code, int annee, String paysorigine) {
        super(code,annee,paysorigine);
    }
    public Commemoratif(String code, int annee, String paysorigine, double valeurfaciale) {
        super(code,annee,paysorigine,valeurfaciale);
    }

    public String toString() {
        return "Timbre de code " + this.getCode() + " datant de " + this.getAnnee() + " (provenance " + this.getPays() + ") ayant pour valeur faciale " + this.getValeurFaciale() + " euros" + "\n" + "Timbre celebrant un evenement";
    }

    public double vente() {
        double prixdevente = 0;
        if (this.age() < 5 && this.age() >= 0) {
            prixdevente = this.getValeurFaciale()*2;
        } else if (this.age() >= 5) {
            prixdevente = this.getValeurFaciale()*this.age()*2.5*2;
        }
        return prixdevente;
    }

}
