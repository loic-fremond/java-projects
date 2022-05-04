/**
 * Une pièce simple est caractérisée par son orientation, une chaîne de caractères qui peut être « gauche », « droite » ou « aucune ».
 *
 * Les méthodes publiques de la classe Simple seront :
 *
 * — un constructeur permettant d’initialiser le nom de la pièce simple et son orientation au moyen de valeurs passées en paramètres. Si aucune valeur n’est donnée pour l’orientation, la valeur par défaut "aucune" sera utilisée ;
 *
 * — un getter getOrientation() ;
 *
 * — une méthode toString() produisant une représentation d’une pièce "Simple" respectant strictement le format suivant :
 * <nom> [<orientation>]
 * où <nom> est le nom de la pièce est <orientation> son orientation.
 * L’orientation ne sera présente que si sa valeur est différente de "aucune".
 *
 */

public class Simple extends Piece {

    private final String orientation;

    public Simple(String nom) {
        super(nom);
        this.orientation = "aucune";
    }

    public Simple(String nom, String orientation) {
        super(nom);
        this.orientation = orientation;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String toString() {
        if (this.orientation == "aucune") {
            return this.getNom();
        } else {
            return this.getNom() + " " + this.orientation;
        }
    }

}
