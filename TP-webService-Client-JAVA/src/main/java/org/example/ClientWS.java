/**
 * @author Achraf SERHANI
 * @date 1/13/25
 */

package org.example;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();

        //Example of convrting 130 euros to mad
        System.out.println("Valeur En Dirham Marocain : " + proxy.conversionEuroToMad(130) + "\n");

        //Example of getting details of  account number 3
        Compte cp = proxy.getCompte(3);
        System.out.println("Numéro De Compte : " + cp.getCode() + "\nSolde : " + cp.getSolde() + "\nDate De Création : " + cp.getDateCreation());

        //Example of geeting the accounts list
        List<Compte> comptesList = proxy.listeComptes();
        for (Compte c : comptesList) {
            System.out.println("*-----------------------------------------------*");
            System.out.println("Numéro De Compte : " + c.getCode() + "\nSolde : " + c.getSolde() + "\nDate De Création : " + c.getDateCreation() + "\n");
        }
    }
}
