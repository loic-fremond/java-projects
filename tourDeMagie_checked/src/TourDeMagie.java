/**************************
 * Le but de ce programme est de simuler un tour de magie élémentaire dont le déroulement est le suivant :
 *
 * Un magicien demande à un spectateur d'écrire sur un papier son âge (moins de 100 ans) et la somme qu'il a en poche (moins de 100 euros).
 * L'assistant doit ensuite le lire (sans rien dire), puis effectuer secrètement le calcul suivant : multiplier l'âge par 2, lui ajouter 5, multiplier le résultat par 50, ajouter la somme en poche, et soustraire le nombre de jours que contient une année, puis finalement donner le résultat à haute voix.
 * En ajoutant mentalement (rapidement !) 115 au chiffre reçu, le magicien trouve tout de suite l'âge et la somme en poche (qui étaient restés secrets).
 *
 * Ce tour de magie sera modélisé en utilisant les classes simples suivantes : Magicien, Assistant, Spectateur, et Papier.
 *
 *
 *
 ***************************/

public class TourDeMagie {

    // La méthode main() restera volontairement très épurée et simple à comprendre
    public static void main(String[] args) {

        Spectateur enthousiaste = new Spectateur();
        enthousiaste.entreEnScene();

        Magicien harryHoudini = new Magicien();
        Assistant bessHoudini = new Assistant();
        harryHoudini.tourDeMagie(bessHoudini, enthousiaste);


    }
}
