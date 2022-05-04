/**
 * Ce programme très simple sert d'introduction au langage Java et à la notion de programme orienté objet.
 *
 * Il permet de créer des triangles dans un plan en deux dimensions (avec des abscisses x et des ordonnées y), et il permet de calculer la surface de ces triangles, et de tester si un triangle donné est isocèle ou non.
 *
 */
public class ManipulationTriangles {

    // La méthode main() est délibérément simple, ici on initialise des objets triangles, que l'on va ensuite créer (définir les coordonnées x et y de leurs sommets), puis imprimer dans la console leur périmètre et un test qui vérifie si le triangle est isocèle ou non.
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.creerTriangle(1, 1, 1, 2, 2, 1);
        System.out.println(triangle1.perimetre());
        triangle1.testIsocele();

        triangle2.creerTriangle(1, 1, 1, 3, 2, 1);
        System.out.println(triangle2.perimetre());
        triangle2.testIsocele();

    }

}
