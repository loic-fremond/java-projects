/**
 * Un philatéliste souhaite estimer à quel prix il pourrait vendre ses timbres. Le but de cet exercice est d’écrire un programme lui permettant de le faire.
 *
 * Le code :
 * — crée une collection de timbres (rares ou commémoratifs) ;
 * — et affiche le prix de chaque timbre de cette collection.
 *
 * Un timbre est caractérisé par : son code, son année d’émission, son pays d’origine et sa valeur faciale en euros (l’équivalent en euros de la valeur apposée sur le timbre).
 *
 * Notre philatéliste distingue deux grandes catégories de timbres, se distinguant notamment par les modalités du calcul du prix de vente :
 * — les timbres rares (classe Rare) : dotés d’un attribut supplémentaire indiquant le nombre d’exemplaires recensés dans le monde ;
 * — les timbres commémoratifs (classe Commemoratif) : sans attribut spécifique particulier.
 *
 */

import java.util.ArrayList;

public class Philatelie {

    public static void main(String[] args) {

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale,
        // nombre d'exemplaires
        Rare t1 = new Rare("Guarana-4574", 1960, "Mexique", 0.2, 98);

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale
        Commemoratif t2 = new Commemoratif("700eme-501", 2002, "Suisse", 1.5);
        Timbre t3 = new Timbre("Setchuan-302", 2004, "Chine", 0.2);

        Rare t4 = new Rare("Yoddle-201", 1916, "Suisse", 0.8, 3);


        ArrayList<Timbre> collection = new ArrayList<Timbre>();

        collection.add(t1);
        collection.add(t2);
        collection.add(t3);
        collection.add(t4);

        for (Timbre timbre : collection) {
            System.out.println(timbre);
            System.out.println("Prix vente : " + timbre.vente() + " euros");
            System.out.println();
        }
    }
}

