/**
 * La classe GrandPrix est pensée comme une « collection hétérogène » de véhicules.
 * Cette collection représente l’ensemble des véhicules participant à une course. Elle est modélisée au moyen d’un ArrayList.
 * Cette classe hérite de la classe Rallye qui contient uniquement une méthode boolean check(). Cette méthode doit permettre de vérifier si les véhicules ont le droit de courir ensemble.
 *
 * La classe GrandPrix est dotée :
 *
 * — d’une méthode ajouter permettant d’ajouter un véhicule à l’ensemble des participants (l’ajout se fera en fin de collection) ; cette méthode est conforme aux tests effectués (dans la portion de code entre //TEST 3 et // FIN TEST 3) ;
 *
 * — pour un rallye de type GrandPrix les voitures n’ont pas le droit de courir avec les deux-roues ; les motos ayant un «Sidecar» ne sont pas considérées comme des véhicules à deux roues ; les deux-roues ont le droit de courir ensemble.
 *
 * - une méthode void run(int tours) simulant le déroulement de la course selon l’algorithme suivant :
 *      — commencer par tester si les véhicules ont le droit de courir ensemble ; le message "Pas de Grand Prix" suivi d’un saut de ligne sera affiché dans le cas contraire et la méthode run devra terminer son exécution ;
 *      — quand la course a lieu : pour chaque véhicule, déduire autant de carburant que de tours ; seuls les véhicules à qui il reste du carburant (> 0) arrivent sur la ligne d’arrivée ;
 *      — parmi les véhicules qui ont atteint la ligne d’arrivée, sélectionner le plus performant (celui qui est meilleur que tous les autres) et l’afficher en respectant strictement le format suivant :
 * Le gagnant du grand prix est :
 * <representation>
 * où <representation> est la représentation du véhicule gagnant sous
 * la forme d’une String, telle que produite par toString.
 * Si aucun véhicule n’atteint la ligne d’arrivée, afficher le message
 * Elimination de tous les vehicules
 * suivi d’un saut de ligne.
 */

import java.util.ArrayList;

public class GrandPrix extends Rallye {

    private final ArrayList<Vehicule> vehiculesParticipants;

    public GrandPrix() {
        this.vehiculesParticipants = new ArrayList<>();
    }

    public void ajouter(Vehicule vehiculeAInscrire) {
        this.vehiculesParticipants.add(vehiculeAInscrire);
    }

    public boolean check() {
        // Si les véhicules sont tous des deux-roues OU si aucun des véhicules n'est un deux-roues, alors ils peuvent concourir
        // Pour effectuer ce test, nous créons deux booléens que nous comparerons pour déterminer si la course peut avoir lieu ou non
        // Si la course comporte un participant à deux roues, le boolean deviendra vrai
        // Si la course comporte un participant à quatre roues, le boolean deviendra vrai
        boolean participantsDeuxRoues = false;
        boolean participantsQuatreRoues = false;
        for (Vehicule v: vehiculesParticipants){
            if (v.estDeuxRoues()){
                participantsDeuxRoues = true;
            }
            else {
                participantsQuatreRoues = true;
            }
        }
        // Il ne peut pas y avoir de véhicules à deux roues ET à quatre roues en même temps
        // Si le boolean participantsDeuxRoues est vrai ET que le boolean participantsQuatreRoues est vrai, alors la course ne peut pas avoir lieu ! -> Le check() sera false.
        return (participantsDeuxRoues != participantsQuatreRoues);
    }

    public void run(int tours) {
        // Création d'une liste dans laquelle seront stockés les véhicules qui ont fini la course
        ArrayList<Vehicule> vehiculesArrives = new ArrayList<>();
        // Création d'une liste dans laquelle sera stocké le vainqueur de la course
        ArrayList<Vehicule> stockVainqueur = new ArrayList<>();
        // Un véhicule temporaire avec une performance dérisoire de 0 est placé dans la liste stockVainqueur en tant que vainqueur temporaire
        stockVainqueur.add(new Vehicule ("placeholder", 0.0, 1, 0));
        // Au début du Grand Prix, il faut s'assurer que tous les véhicules participants sont dans la même catégorie. Si ce n'est pas le cas, le Grand Prix ne peut pas avoir lieu.
        if (!this.check()) {
            System.out.println("Pas de Grand Prix");
        } else {
            // Pour chacun des véhicules participants, on enlève autant de carburant qu'il y a de tours de piste. Seuls les véhicules qui ont encore du carburant à la fin du Grand Prix sont considérés comme finissant la course (comme des véhicules "arrivés").
            for (Vehicule vehiculeParticipant : vehiculesParticipants) {
                if ((vehiculeParticipant.getCarburant() - tours) > 0) {
                    vehiculesArrives.add(vehiculeParticipant);
                }
            }
            // Si la liste des vehiculesArrives ne contient aucune entrée en fin de Grand Prix, c'est que personne n'est arrivé, tous les véhicules auront été éliminés.
            if (vehiculesArrives.size() == 0) {
                System.out.println("Elimination de tous les vehicules");
            } else {
                // Pour chaque véhicule arrivé (et donc potentiel vainqueur), on vérifie s'il est meilleur que le véhicule stocké dans stockVainqueur
                // S'il est meilleur, il devient le véhicule stocké dans stockVainqueur
                for (Vehicule potentielVainqueur : vehiculesArrives) {
                    if (potentielVainqueur.meilleur(stockVainqueur.get(0))) {
                        stockVainqueur.set(0, potentielVainqueur);
                    }
                }
                // A l'issue de ce processus, le meilleur de tous les véhicules sera stocké dans stockVainqueur
                System.out.println("Le gagnant du grand prix est :\n" + stockVainqueur.get(0));
            }
        }
    }

}
