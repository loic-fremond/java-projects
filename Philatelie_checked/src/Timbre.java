/**
 * Les méthodes publiques de la classe Timbre sont :
 *
 * — des constructeurs, avec l’ordre suivant pour les paramètres : le code, l’année d’émission, le pays d’origine, et la valeur faciale ;
 * Chacun de ces paramètres admet une valeur par défaut :
 * VALEUR_TIMBRE_DEFAUT pour la valeur faciale, PAYS_DEFAUT pour le pays, ANNEE_COURANTE pour l’année et CODE_DEFAUT pour le code ;
 * La construction d’un timbre peut donc se faire avec zéro, un, deux, trois ou quatre paramètres ;
 *
 * — une méthode vente() retournant le prix de vente sous la forme d’un double ;
 * Le prix de vente d’un timbre quelconque est sa valeur faciale si le timbre a moins que cinq ans. Sinon le prix de vente vaut la valeur faciale multipliée par l’âge du timbre et par le coefficient 2.5.
 *
 * — une méthode toString() produisant une représentation d’un Timbre respectant strictement le format suivant :
 * Timbre de code <code> datant de <annee> (provenance <pays>) ayant pour valeur faciale <valeur faciale> euros
 *
 * — la méthode age() retournant l’âge du timbre sous la forme d’un int (différence entre ANNEE_COURANTE et l’année d’émission du timbre) ;
 *
 * — les getters getCode(), getAnnee(), getPays() et getValeurFaciale().
 *
 */
public class Timbre {

    public static final int ANNEE_COURANTE = 2016;
    public static final int VALEUR_TIMBRE_DEFAUT = 1;
    public static final String PAYS_DEFAUT = "Suisse";
    public static final String CODE_DEFAUT = "lambda";

    public static final int BASE_1_EXEMPLAIRES = 100;
    public static final int BASE_2_EXEMPLAIRES = 1000;
    public static final double PRIX_BASE_1 = 600;
    public static final double PRIX_BASE_2 = 400;
    public static final double PRIX_BASE_3 = 50;
    private final String code;
    private final int annee;
    private final String paysorigine;
    private final double valeurfaciale;

    public Timbre() {
        this.code = CODE_DEFAUT;
        this.annee = ANNEE_COURANTE;
        this.paysorigine = PAYS_DEFAUT;
        this.valeurfaciale = VALEUR_TIMBRE_DEFAUT;
    }

    public Timbre(String code) {
        this.code = code;
        this.annee = ANNEE_COURANTE;
        this.paysorigine = PAYS_DEFAUT;
        this.valeurfaciale = VALEUR_TIMBRE_DEFAUT;
    }

    public Timbre(String code, int annee) {
        this.code = code;
        this.annee = annee;
        this.paysorigine = PAYS_DEFAUT;
        this.valeurfaciale = VALEUR_TIMBRE_DEFAUT;
    }

    public Timbre(String code, int annee, String paysorigine) {
        this.code = code;
        this.annee = annee;
        this.paysorigine = paysorigine;
        this.valeurfaciale = VALEUR_TIMBRE_DEFAUT;
    }
    public Timbre(String code, int annee, String paysorigine, double valeurfaciale) {
        this.code = code;
        this.annee = annee;
        this.paysorigine = paysorigine;
        this.valeurfaciale = valeurfaciale;
    }

    public String toString() {
        return "Timbre de code " + code + " datant de " + annee + " (provenance " + paysorigine + ") ayant pour valeur faciale " + valeurfaciale + " euros";
    }

    public double vente() {
        double prixdevente = 0;
        if (this.age() < 5 && this.age() >= 0) {
            prixdevente = this.valeurfaciale;
        } else if (this.age() >= 5) {
            prixdevente = this.valeurfaciale*this.age()*2.5;
        }
        return prixdevente;
    }

    public int age() {
        return ANNEE_COURANTE - annee;
    }

    public String getCode() {
        return code;
    }

    public int getAnnee() {
        return annee;
    }

    public String getPays() {
        return paysorigine;
    }

    public double getValeurFaciale() {
        return valeurfaciale;
    }

}
