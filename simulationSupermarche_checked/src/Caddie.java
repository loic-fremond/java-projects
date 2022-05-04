/**
 * Les caddies contiennent la liste des achats effectués (ceux qui seront scannés en caisse, on considère que l'article n'est pas dans le caddie si le consommateur ne souhaite pas l'acheter).
 *
 * Les méthodes utiles aux caddies sont :
 * - Un constructeur qui initialise un caddie vide (sans articles)
 * - La méthode remplir() permet d'ajouter une certaine quantité d'un article donné dans le caddie
 * - Les getters () concernant la taille du caddie (càd le nombre d'articles qui sont stockés dedans), et permettant d'identifier un article en particulier au sein du caddie.
 *
 */

import java.util.ArrayList;

public class Caddie {

    private ArrayList<Achat> listecaddie;
    private Article article;
    private int quantiteachetee;

    public Caddie() {
        this.listecaddie = new ArrayList<Achat>();
    }

    public void remplir (Article article, int quantite) {
        this.article = article;
        this.quantiteachetee = quantite;
        Achat achat = new Achat(this.article.getNom(), this.article.getPrixunitaire(), this.article.isSolde(), this.quantiteachetee);
        listecaddie.add(achat);

    }

    public int getCaddieSize() {
        return listecaddie.size();
    }

    public Achat getAchat(int index) {
        return listecaddie.get(index);
    }

}
