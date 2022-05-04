/***********
 *
 * Le papier sert de classe transitoire pour récupérer les infos données par le spectateur et pour être lu par l'asssistant
 *
 * Il dispose à cette fin de deux attributs :
 * - L'âge noté par le spectateur
 * - Et la somme notée par le spectateur
 *
 * Pour initialiser un papier, il faudra que l'on puisse écrire dessus l'âge et la somme (via la méthode écrire())
 *
 * Et il faudra bien sûr que l'assistant puisse le lire au moyen des méthodes lireAge() et lireSomme()
 *
 */
public class Papier {

    private int age, somme;

    public void ecrire (int newage, int newsomme) {
        age = newage;
        somme = newsomme;
    }

    public int lireAge() {
        return age;
    }

    public int lireSomme() {
        return somme;
    }

}
