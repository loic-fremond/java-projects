/**
 * Un composant est constitué :
 * — d’une pièce
 * — d’une quantité (nombre de fois qu’est utilisée la pièce)
 *
 * Les méthodes utiles à un Composant sont :
 *
 * - un constructeur permettant d’initialiser la pièce du composant et sa quantité au moyen de valeurs passées en paramètres (la pièce du composant sera initialisée au moyen d’une référence sur une pièce passée en paramètre) ;
 *
 * — les getters getPiece() et getQuantite().
 *
 */
public class Composant {

    private final Piece piece;
    private final int quantite;

    public Composant (Piece piece, int quantite) {
        this.piece = piece;
        this.quantite = quantite;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public int getQuantite() {
        return this.quantite;
    }

}
