/**
 * Une pièce est caractérisée par son nom. Elle peut être simple ou composée.
 *
 * Les méthodes publiques de la classe Piece seront :
 *
 * — un constructeur permettant d’initialiser le nom de la pièce au moyen d’une valeur passée en paramètre ;
 *
 * — un getter getNom() ;
 *
 * — une méthode toString() produisant une représentation d’une Piece respectant strictement le format suivant : <nom> (nom de la pièce).
 *
 */

public class Piece {

    private final String nom;

    public Piece(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        return this.nom;
    }

}
