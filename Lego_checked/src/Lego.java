/*******************************************
 * Le but de cet exercice est de modéliser de façon basique des jeux de construction, de type Lego ©.
 *
 * Une construction est constituée d’une liste de composants. Elle est caractérisée par le nombre maximal de composants pouvant la constituer.
 *
 * Un composant est constitué :
 * — d’une pièce
 * — d’une quantité (nombre de fois qu’est utilisée la pièce)
 *
 * Une pièce est caractérisée par son nom. Elle peut être simple ou composée.
 *
 * Une pièce simple est caractérisée par son orientation, une chaîne de caractères qui peut être « gauche », « droite » ou « aucune ».
 *
 * Une pièce composée est caractérisée par la liste des pièces la constituant (pas forcément toutes simples) ainsi que le nombre maximal de pièces qui peuvent la constituer.
 *******************************************/

class Lego {

    public static void main(String[] args) {
        // déclare un jeu de construction de 10 pièces
        Construction maison = new Construction(10);

        // ce jeu a pour premier composant: 59 briques standard
        // une brique standard a par défaut "aucune" comme orientation
        maison.ajouterComposant(new Simple("brique standard"), 59);

        // déclare une pièce dont le nom est "porte", composée de 2 autres pièces
        Composee porte = new Composee("porte", 2);

        // cette pièce composée est constituée de deux pièces simples:
        // un cadran de porte orienté à gauche
        // un battant orienté à gauche
        porte.construire(new Simple("cadran porte", "gauche"));
        porte.construire(new Simple("battant", "gauche"));

        // le jeu a pour second composant: 1 porte
        maison.ajouterComposant(porte, 1);

        // déclare une pièce composée de 3 autres pièces dont le nom est "fenêtre"
        Composee fenetre = new Composee("fenetre", 3);

        // cette pièce composée est constituée des trois pièces simples:
        // un cadran de fenêtre (aucune orientation)
        // un volet orienté à gauche
        // un volet orienté à droite
        fenetre.construire(new Simple("cadran fenetre"));
        fenetre.construire(new Simple("volet", "gauche"));
        fenetre.construire(new Simple("volet", "droit"));

        // le jeu a pour troisième composant: 2 fenêtres
        maison.ajouterComposant(fenetre, 2);

        // affiche tous les composants (nom de la pièce et quantité)
        // pour les pièces composées : affiche aussi chaque pièce les constituant
        System.out.println("Affichage du jeu de construction : ");
        System.out.println(maison);
    }
}
