/*******
 *
 * Le spectateur a un certain âge et une certaine somme en poche, définis comme ses attributs.
 * Comme le spectateur ne peut pas avoir moins de 0 ans ni plus de 99 ans, et que le tour ne fonctionne que s'il a entre 0 et 100 euros en poche, le spectateur s'assurera que ces contraintes sont respectées au moment d'entrer en scene (modélisé par la méthode entreEnScene())
 * En outre, le spectateur dispose d'un scanner qui permettra à l'utilisateur du programme de choisir l'âge et la somme du spectateur.
 *
 * Le spectateur peut également écrire sur un bout de papier à l'aide de la méthode ecrire(Papier) afin que l'accessoire du tour de magie puisse exister.
 *
 */

import java.util.Scanner;

public class Spectateur {

    private final static Scanner clavier = new Scanner(System.in);
    private int age, somme;

    public void entreEnScene() {
        System.out.println("[Spectateur] J'entre en scene !");
        do {
            System.out.println("[Spectateur] Quel est mon age ? Je devrais avoir entre 0 et 99 ans.");
            age = clavier.nextInt();
        } while (age < 0 || age > 99);
        System.out.println("[Spectateur] Mon age est correct.");
        do {
            System.out.println("[Spectateur] Combien d'argent ai-je en poche ? Je devrais avoir une somme entre 0 et 99 euros.");
            somme = clavier.nextInt();
        } while (somme < 0 || somme > 99);
        System.out.println("[Spectateur] Ma somme en poche est correcte. \n");
    }

    public void ecrire(Papier note) {
        System.out.println("[Spectateur] J'ecris sur le papier.");
        note.ecrire(age, somme);
    }

}
