/**
 * Une pièce composée est caractérisée par la liste des pièces la constituant (pas forcément toutes simples) ainsi que le nombre maximal de pièces qui peuvent la constituer.
 *
 * Les méthodes utiles à une pièce composée sont :
 *
 * - un constructeur permettant d’initialiser le nom de la pièce composée et le nombre maximal de pièces pouvant la constituer ;
 *
 * — une méthode int taille() retournant le nombre de pièces constituant la pièce composée ;
 *
 * — une méthode int tailleMax() retournant le nombre maximal de pièces pouvant constituer la pièce composée ;
 *
 * — une méthode void construire(), permettant d’ajouter une pièce dans la liste des pièces constituant la pièce composée. Cet ajout ne sera possible que si le nombre de pièces maximal n’est pas atteint. S’il y a tentative d’ajout alors que la liste est pleine, le message "Construction impossible" sera affiché (suivi d’un saut de ligne) ;
 *
 * — une méthode toString() produisant une représentation d’une pièce Composee respectant strictement le format suivant :
 * <nom> (<description piece1>, <description piece2>, ... <description pieceN> ) (sans saut de ligne)
 * où <nom> est le nom de la pièce et <descripion pieceX> est la représentation sous forme d’une String de la X-ième pièce constituant la pièce composée. Toutes les pièces constituant la pièce composée devront être présentes.
 *
 */

import java.util.ArrayList;

public class Composee extends Piece {

    private ArrayList<Piece> pieces = new ArrayList<>();
    private final int nbreMaxPieces;

    public Composee (String nom, int nbreMaxPieces) {
        super(nom);
        this.nbreMaxPieces = nbreMaxPieces;
    }

    public int taille() {
        return this.pieces.size();
    }

    public int tailleMax() {
        return this.nbreMaxPieces;
    }

    public void construire(Piece piece) {
        if (this.pieces.size() < nbreMaxPieces) {
            this.pieces.add(piece);
        } else if (this.pieces.size() >= nbreMaxPieces) {
            System.out.println("Construction impossible");
        }
    }

        public String toString() {
            StringBuilder temporaire = new StringBuilder();
            String virgule = ",";
            for (Piece piece : pieces) {
                temporaire.append(virgule).append(piece.toString());
            }
            temporaire.deleteCharAt(temporaire.indexOf(","));
            return this.getNom() + " (" + temporaire + ")";
        }

}
