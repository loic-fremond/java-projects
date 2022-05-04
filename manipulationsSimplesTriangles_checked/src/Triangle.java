/**
 * Un triangle est défini par les coordonnées x et y de ses sommets (qui sont au nombre de 3), ainsi que par la longueur de ses cotes.
 * Dans cet exemple, nous utiliserons le constructeur par défaut par défaut de Java.
 *
 * La méthode creerTriangle() sert à initialiser les attributs des objets Triangle créés.
 *
 * La méthode perimetre() sert à calculer le périmètre d'un triangle, en calculant d'abord ses cotes.
 *
 * La méthode testIsocele() retourne si oui ou non un triangle donné est isocèle. Un triangle est isocèle si au moins deux de ses côtés sont de longueurs identiques.
 *
 */

public class Triangle {

    private double xsommet1, xsommet2, xsommet3;
    private double ysommet1, ysommet2, ysommet3;
    private double cote1, cote2, cote3;

    public void creerTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.xsommet1 = x1;
        this.xsommet2 = x2;
        this.xsommet3 = x3;
        this.ysommet1 = y1;
        this.ysommet2 = y2;
        this.ysommet3 = y3;
        System.out.println("Un triangle a ete cree avec le sommet 1 situe aux coordonnes : " + xsommet1 + ", " + ysommet1 + " ; le sommet 2 aux coordonnees : " + xsommet2 + ", " + ysommet2 + " ; et le sommet 3 aux coordonnes : " + xsommet3 + ", " + ysommet3 + ".");
    }

    public double perimetre() {
        this.cote1 = Math.sqrt(Math.pow(xsommet1 - xsommet2, 2) + Math.pow(ysommet1 - ysommet2, 2));
        this.cote2 = Math.sqrt(Math.pow(xsommet2 - xsommet3, 2) + Math.pow(ysommet2 - ysommet3, 2));
        this.cote3 = Math.sqrt(Math.pow(xsommet1 - xsommet3, 2) + Math.pow(ysommet1 - ysommet3, 2));
        return cote1 + cote2 + cote3;
    }

    public void testIsocele() {
        if (cote1 == cote2 || cote2 == cote3 || cote1 == cote3) {
            System.out.println("Ce triangle est isocele");
        } else {
            System.out.println("Ce triangle n'est pas isocele");
        }
    }

}
