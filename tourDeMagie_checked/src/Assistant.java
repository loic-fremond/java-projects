/************
 *
 * L'assistant récupère le papier sur lequel le spectateur a écrit son âge et son argent en poche.
 *
 * Il disposera donc de plusieurs attributs pour pouvoir agir dans le cadre du tour de magie :
 * - l'âge qu'il a lu sur le papier
 * - la somme qu'il a lue sur le papier
 * - le resultat qu'il va annoncer au magicien
 *
 * Et il disposera également des méthodes faisant appel à ces attributs :
 * - lirePapier() pour récupérer les infos écrites sur le papier (la note) que lui aura transmis le spectateur
 * - calcul() qui lui permet d'opérer en coulisses le tour de magie
 * - annoncer() qui lui permet de transmettre le résultat du calcul au magicien
 *
 * **********/

public class Assistant {
    private int agelu, sommelue, resultat;

    public void lirePapier(Papier note) {
        System.out.println("[Assistant] Je lis le papier.");
        agelu = note.lireAge();
        sommelue = note.lireSomme();
    }

    public void calcul() {
        System.out.println("[Assistant] Je calcule le resultat...");
        resultat = agelu*2;
        resultat += 5;
        resultat *= 50;
        resultat += sommelue;
        resultat -= 365;
    }

    public int annoncer() {
        System.out.println("[Assistant] Le resultat est " + resultat + ".");
        return resultat;
    }

}
