/*******************************************
 * Le but de ce programme est de simuler une agence de voyage.
 *
 * Un voyagiste vend des kits de voyage composés de différentes options.
 * Les options de voyage peuvent se décliner en différentes sous-classes. Il s’agit ici d’en modéliser deux : les moyens de transport (classe Transport) et le logement pendant le voyage (classe Sejour).
 *
 * Le voyagiste vend des kits composés de plusieurs options.
 * La classe KitVoyage est conceptualisée comme une « collection hétérogène » de OptionVoyage (un ArrayList).
 *
 *******************************************/

public class Voyage {
    public static void main(String[] args) {

        // TEST 1
        System.out.println("Test partie 1 : ");
        System.out.println("----------------");
        OptionVoyage option1 = new OptionVoyage("Séjour au camping", 40.0);
        System.out.println(option1);

        OptionVoyage option2 = new OptionVoyage("Visite guidée : London by night" , 50.0);
        System.out.println(option2);
        System.out.println();

        // FIN TEST 1


        // TEST 2
        System.out.println("Test partie 2 : ");
        System.out.println("----------------");

        Transport transp1 = new Transport("Trajet en car ", 50.0);
        System.out.println(transp1);

        Transport transp2 = new Transport("Croisière", 1300.0);
        System.out.println(transp2);

        Sejour sejour1 = new Sejour("Camping les flots bleus", 20.0, 10, 30.0);
        System.out.println(sejour1);
        System.out.println();

        // FIN TEST 2


        // TEST 3
        System.out.println("Test partie 3 : ");
        System.out.println("----------------");

        KitVoyage kit1 = new KitVoyage("Zurich", "Paris");
        kit1.ajouterOption(new Transport("Trajet en train", 50.0));
        kit1.ajouterOption(new Sejour("Hotel 3* : Les amandiers ", 40.0, 5, 100.0));
        System.out.println(kit1);
        System.out.println();
        kit1.annuler();

        KitVoyage kit2 = new KitVoyage("Zurich", "New York");
        kit2.ajouterOption(new Transport("Trajet en avion", 50.0, true));
        kit2.ajouterOption(new Sejour("Hotel 4* : Ambassador Plazza  ", 100.0, 2, 250.0));
        System.out.println(kit2);
        kit2.annuler();

        // FIN TEST 3
    }
}

