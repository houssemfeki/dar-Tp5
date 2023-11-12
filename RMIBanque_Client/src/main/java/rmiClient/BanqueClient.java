package rmiClient;

import java.rmi.Naming;
import java.util.Date;

public class BanqueClient {

    public static void main(String[] args) throws Exception {
        // Crée une instance du stub
        IBanque banque = (IBanque) Naming.lookup("//localhost/Banque");

        // Crée un nouveau compte
        Compte compte;
        compte = new Compte(1, 1000, new Date());

        // Crée le compte
        String message = banque.creerCompte(compte);
        System.out.println(message);

        // Affiche les informations du compte
        message = banque.getInfoCompte(1);
        System.out.println(message);
    }
}
