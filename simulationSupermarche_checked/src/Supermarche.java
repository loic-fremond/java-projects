/**
 * Ce programme d'études sert à illustrer la programmation orientée objet de manière plus "complexe" en simulant le fonctionnement d'un supermarché. Il a pour but de faire afficher le montant total de chaque caisse du supermarché au bout d'une journée donnée.
 *
 * Les entités nécessaires pour modéliser le fonctionnement du supermarché seront :
 * - les articles vendus : caractérisés par leur nom, leur prix unitaire et une information indiquant si l’article est en solde ou pas.
 * - les achats : un achat est caractérisé par l’article acheté et la quantité achetée de cet article.
 * - les caddies : caractérisés par l’ensemble des achats qu’ils contiennent.
 * - les caisses : chargées de scanner et enregistrer le contenu des caddies. Une caisse est caractérisée par un numéro de caisse et le montant total des achats qu’elle a scannés.
 *
 */

public class Supermarche {

    public static void main(String[] args) {
        // Les articles vendus dans le supermarché
        Article choufleur = new Article("Chou-fleur extra", 3.50, false);
        Article roman = new Article("Les malheurs de Sophie", 16.50, true);
        Article camembert = new Article("Cremeux 100%MG", 5.80, false);
        Article cdrom = new Article("C++ en trois jours", 48.50, false);
        Article boisson = new Article("Petit-lait", 2.50, true);
        Article petitspois = new Article("Pois surgeles", 4.35, false);
        Article poisson = new Article("Sardines", 6.50, false);
        Article biscuits = new Article("Cookies de grand-mere", 3.20, false);
        Article poires = new Article("Poires Williams", 4.80, false);
        Article cafe = new Article("100% Arabica", 6.90, true);
        Article pain = new Article("Pain d'epautre", 6.90, false);

        // Les caddies du supermarché
        Caddie caddie1 = new Caddie();
        Caddie caddie2 = new Caddie();
        Caddie caddie3 = new Caddie();

        // Les caisses du supermarché
        // le premier argument est le numero de la caisse
        // le second argument est le montant initial de la caisse.
        Caisse caisse1 = new Caisse(1, 0.0);
        Caisse caisse2 = new Caisse(2, 0.0);

        // les clients font leurs achats
        // le second argument de la méthode remplir
        // correspond à une quantité

        // remplissage du 1er caddie
        caddie1.remplir(choufleur, 2);
        caddie1.remplir(cdrom, 1);
        caddie1.remplir(biscuits, 4);
        caddie1.remplir(boisson, 6);
        caddie1.remplir(poisson, 2);

        // remplissage du 2eme caddie
        caddie2.remplir(roman, 1);
        caddie2.remplir(camembert, 1);
        caddie2.remplir(petitspois, 2);
        caddie2.remplir(poires, 2);

        // remplissage du 3eme caddie
        caddie3.remplir(cafe, 2);
        caddie3.remplir(pain, 1);
        caddie3.remplir(camembert, 2);

        // Les clients passent à la caisse
        caisse1.scanner(caddie1);
        caisse1.scanner(caddie2);
        caisse2.scanner(caddie3);

        caisse1.totalCaisse();
        caisse2.totalCaisse();
    }

}
