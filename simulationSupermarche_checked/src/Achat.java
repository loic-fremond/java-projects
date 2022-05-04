/**
 * Les achats sont des articles. Dès lors, la classe Achat héritera de la classe Article.
 * Les achats sont caractérisés en plus par la quantité achetée pour chaque article, ainsi que le montant de cet achat (le prix unitaire multiplié par la quantité achetée).
 *
 * Les méthodes sont :
 * - Un constructeur pour les achats.
 * - Un getter() pour le montant d'achat.
 * - Une méthode afficher() qui affichera dans la console un message légèrement différent selon que l'article est en solde ou non.
 *
 */

public class Achat extends Article {

    private int quantiteachetee;
    private double montantachat;

    public Achat(String nom, double prixunitaire, boolean solde, int quantiteachetee) {

        super(nom, prixunitaire, solde);
        this.quantiteachetee = quantiteachetee;
        this.montantachat = prixunitaire * this.quantiteachetee;

    }

    public void afficher() {
        if (solde == true) {
            System.out.println(nom + " : " + prixunitaire + " x " + quantiteachetee + " = " + montantachat/2 + " euros (1/2 prix)");
        } else {
            System.out.println(nom + " : " + prixunitaire + " x " + quantiteachetee + " = " + montantachat + " euros");
        }
    }

    public double getMontant() {
        return montantachat;
    }

}
