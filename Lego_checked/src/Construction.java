/**
 * Une construction est constituée d’une liste de composants. Elle est caractérisée par le nombre maximal de composants pouvant la constituer.
 *
 * Les méthodes permettant de définir une construction sont :
 *
 * - un constructeur permettant d’initialiser le nombre maximal de composants pouvant constituer la construction ;
 *
 * — une méthode int taille() retournant le nombre de composants constituant la construction ;
 *
 * — une méthode int tailleMax() retournant le nombre maximal de composants pouvant constituer la construction ;
 *
 * — une méthode void ajouterComposant permettant d’ajouter un composant dans la liste des composants constituant la construction. Cet ajout ne sera possible que si le nombre de composants maximal n’est pas atteint. S’il y a tentative d’ajout alors que la liste est pleine, le message "Ajout de composant impossible" sera affiché (suivi d’un saut de ligne) ; le composant à ajouter sera créé à partir des arguments fournis à la méthode ajouterComposant() ;
 *
 * — une méthode toString() produisant une représentation d’une construction respectant strictement le format suivant :
 * <description piece1> (quantite <quantite1>)
 * ...
 * <description pieceN> (quantite <quantiteN>)
 * Il s’agit d’une représentation de tous les composants de la construction (séparés par un saut de ligne) ; <descripion pieceX> est la représentation sous forme d’une String de la pièce du x-ième composant de la construction et <quantiteX> la quantité de cette pièce.
 *
 */

import java.util.ArrayList;

public class Construction {

    private final ArrayList<Composant> composants = new ArrayList<>();
    private final int nbreMaxComposants;

    public Construction(int nbreMaxComposants) {
        this.nbreMaxComposants = nbreMaxComposants;
    }

    public int taille() {
        return this.composants.size();
    }

    public int tailleMax() {
        return this.nbreMaxComposants;
    }

    public void ajouterComposant(Piece piece, int quantite) {
        if (composants.size() == nbreMaxComposants) {
            System.out.println("Ajout de composant impossible");
        } else {
            composants.add(new Composant(piece,quantite));
        }
    }

    public String toString() {
        String tempo = "";
        for (Composant composant : composants) {
            tempo += composant.getPiece().toString() + " (quantite " + composant.getQuantite() + ") \n";
        }
        return tempo;
    }

}
