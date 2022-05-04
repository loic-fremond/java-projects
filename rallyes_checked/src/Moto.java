/**
 * Une moto (classe Moto) est caractérisée par un booléen indiquant si elle possède un Sidecar.
 *
 * Les méthodes de Moto sont :
 *
 * - des constructeurs conformes aux tests effectués dans le main (dans la portion de code entre // TEST 2 et // FIN TEST 2) ; par défaut, une Moto n’a pas de Sidecar ;
 *
 * - Une méthode toString renvoyant la représentation d’une moto sous la forme d’une String respectant strictement le format suivant :
 * <nom> -> vitesse max = <vitesse max> km/h, poids = <poids> kg, Moto, avec sidecar
 * si elle possède un « Sidecar », ou sinon :
 * <nom> -> vitesse max = <vitesse max> km/h, poids = <poids> kg, Moto
 *
 * - Une méthode estDeuxRoues testant si la moto est une deux-roues ou non. Si la moto possède un sidecar, elle n'est pas considérée comme un deux-roues. A l'inverse, une moto sans sidecar sera un deux-roues.
 */
public class Moto extends Vehicule {

    private final boolean possedeSidecar;

    public Moto(String nom, double vitesseMax, int poids, int carburant, boolean possedeSidecar) {
        super(nom, vitesseMax, poids, carburant);
        this.possedeSidecar = possedeSidecar;
    }

    public Moto(String nom, double vitesseMax, int poids, int carburant) {
        super(nom, vitesseMax, poids, carburant);
        this.possedeSidecar = false;
    }

    public String toString() {
        if (this.possedeSidecar) {
            return super.toString() + ", Moto, avec sidecar";
        } else {
            return super.toString() + ", Moto";
        }
    }

    @Override
    public boolean estDeuxRoues() {
        return !this.possedeSidecar;
    }

}
