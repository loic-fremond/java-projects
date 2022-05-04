/**
 * La classe Article contient très simplement les informations sur un article : nom, prix unitaire, et le booléen indiquant si un article est soldé ou non.
 *
 * Les méthodes utilisées sont basiques :
 * - Un constructeur.
 * - Des getters() pour les trois attributs.
 *
 */

public class Article {

    protected String nom;
    protected double prixunitaire;
    protected boolean solde;

    public Article(String nom, double prixunitaire, boolean solde) {
        this.nom = nom;
        this.prixunitaire = prixunitaire;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixunitaire() {
        return prixunitaire;
    }

    protected boolean isSolde() {
        return solde;
    }

}
