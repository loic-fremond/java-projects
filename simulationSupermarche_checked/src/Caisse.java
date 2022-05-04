/**
 * La Caisse constitue le coeur du programme Supermarche, le but de ce programme étant de pouvoir afficher le montant total de chaque caisse du supermarché au bout d'une journée donnée.
 *
 * Une caisse dispose d'un numéro qui permet de l'identifier, ainsi que du montant total des achats effectués au cours d'une journée.
 *
 * Les méthodes utilisées sont les suivantes :
 * - Un constructeur de caisse.
 * - scanner(), qui permet de scanner un caddie et de générer un ticket de caisse
 * - totalCaisse(), qui permet d'afficher le montant total des achats effectués au cours de la journée.
 *
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Caisse {

    private int numerocaisse;
    private double montanttotal;

    public Caisse(int numerocaisse, double montantinitial) {
        this.numerocaisse = numerocaisse;
        this.montanttotal = montantinitial;
    }

    public void scanner (Caddie caddie) {
        // Formatage du ticket de caisse (en termes d'affichage)
        System.out.println("=========================================");
        Date dateCourante = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
        System.out.println(formatDate.format(dateCourante));
        System.out.println("Caisse numero " + numerocaisse + "\n");
        // Définition de variables pour calculer le montant total des achats
        int nbreAchat = caddie.getCaddieSize();
        double montantAchat = 0;
        // Pour chacun des achats contenus dans le caddie, il s'agit de vérifier si cet article est soldé (si oui, son prix est divisé par deux) et d'afficher l'achat en question sur le ticket de caisse, puis ajouter le prix de cet achat au total enregistré par la caisse.
        for (int i = 0; i < nbreAchat; i++) {
            Achat achat = caddie.getAchat(i);
            double prixachat = achat.getMontant();
            if (achat.solde == true) {
                prixachat /= 2;
            }
            achat.afficher();
            montantAchat += prixachat;
            montanttotal += prixachat;
        }
        System.out.printf("\n Montant a payer : %.2f euros \n", montantAchat);
        System.out.println("=========================================");
    }

    public void totalCaisse() {
        System.out.printf("La caisse numero %d a encaisse %.2f euros aujourd'hui. \n", numerocaisse, montanttotal);
    }

}
