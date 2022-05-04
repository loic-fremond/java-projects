/**
 * La classe KitVoyage est conceptualisée comme une «collection hétérogène» de OptionVoyage (un ArrayList).
 * La classe KitVoyage sera également caractérisée par le départ et la destination du kit (deux String).
 *
 * La classe KitVoyage est dotée :
 *
 * — d’un constructeur ;
 *
 * — d’une méthode double prix() qui calculera le prix du kit comme la somme du prix de toutes ses options ;
 *
 * — d’une méthode toString, générant une représentation du kit sous la forme d’une String, selon le format suivant :
 * Voyage de <depart> à <destination>, avec pour options :
 * - <nom option1> -> <prix option1> euros
 * - ....
 * - <nom optionN> -> <prix optionN> euros
 * Prix total : <prix du kit> euros
 *
 * — d’une méthode ajouterOption permettant d’ajouter une OptionVoyage à la collection d’options du kit (les options seront ajoutées en fin de collection). Si l’argument de ajouterOption vaut null, il ne sera pas ajouté à la collection.
 *
 * — d'une méthode annuler vidant la collection d’options ;
 *
 * — d'une méthode getNbOptions retournant le nombre d’options de voyage du kit.
 */

import java.util.ArrayList;

public class KitVoyage {

    private final ArrayList<OptionVoyage> optionsVoyage;
    private final String depart;
    private final String destination;

    public KitVoyage(String depart, String destination) {
        optionsVoyage = new ArrayList<>();
        this.depart = depart;
        this.destination = destination;
    }

    public double prix() {
        double prixVoyage = 0.0;
        for (OptionVoyage optionsChoisies : optionsVoyage) {
            prixVoyage += optionsChoisies.prix();
        }
        return prixVoyage;
    }

    public String toString() {
        StringBuilder kitChoisi = new StringBuilder("Voyage de " + this.depart + " à " + this.destination + ", avec pour options :" + "\n");
        for (OptionVoyage optionsChoisies : optionsVoyage) {
            kitChoisi.append("\t- ").append(optionsChoisies.toString()).append("\n");
        }
        kitChoisi.append("Prix total : ").append(this.prix()).append(" euros").append("\n");
        return kitChoisi.toString();
    }

    public void ajouterOption(OptionVoyage optionAjoutee) {
        if (optionAjoutee != null) {
            optionsVoyage.add(optionAjoutee);
        }
    }

    public void annuler() {
        optionsVoyage.clear();
    }

    public int getNbOptions() {
        int nbOptions = 0;
        for (OptionVoyage optionsChoisies : optionsVoyage) {
            nbOptions++;
        }
        return nbOptions;
    }

}
