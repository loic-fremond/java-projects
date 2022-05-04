/***************
 *
 * Le magicien récupère le résultat du calcul opéré par son assistant, effectue une dernière opération, puis fait l'annonce final du résultat
 *
 * Pour cela, il disposera des attributs suivants :
 * - L'âge qu'il a deviné
 * - Et la somme qu'il a deviné
 *
 * Et il disposera des méthodes suivantes :
 *
 *  - calculFinal() où le magicien reçoit un résultat de son assistant et y ajoute la clé pour résoudre son tour de magie
 *
 *  - annonceFinale() où le magicien fait l'annonce du résultat de son tour de magie
 *
 * - tourDeMagie() qui contient l'essentiel du tour effectué (puisqu'il n'y a pas de tour sans magicien pour l'animer) :
 *      - le spectateur écrit sur la note
 *      - l'assistant lit la note et effectue son calcul
 *      - le magicien effectue le calcul final à partir de l'annonce de son assistant
 *      - le magicien annonce le résultat du tour de magie
 *
 */
public class Magicien {

    private int ageDevine, sommeDevine;

    private void calculFinal(int resultatRecu) {
        resultatRecu += 115;
        ageDevine = resultatRecu / 100;
        sommeDevine = resultatRecu % 100;
    }

    private void annonceFinale() {
        System.out.println("[Magicien] Je devine que vous etes age de " + ageDevine + " ans \n \t et que vous avez " + sommeDevine + " euros en poche !");
    }
    public void tourDeMagie(Assistant assist, Spectateur spec) {
        Papier note = new Papier();
        System.out.println("[Magicien] Place au tour de magie !!");
        spec.ecrire(note);
        assist.lirePapier(note);
        assist.calcul();
        calculFinal(assist.annoncer());
        annonceFinale();
    }

}
