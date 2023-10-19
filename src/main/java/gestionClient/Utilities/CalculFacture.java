package gestionClient.Utilities;

import gestionClient.Entities.Client;
import gestionClient.Entities.ClientParticulier;
import gestionClient.Entities.ClientPro;
import gestionClient.Entities.Energie;

public class CalculFacture {
	
	public static double calculerFacture(Energie energie, double consommation, Client client) {
        double montant = 0.0;

        if (client instanceof ClientPro) {
            ClientPro clientPro = (ClientPro) client;
            if (clientPro.getChiffreAffaires() > 1000000) {
            	montant = (energie == Energie.GAZ) ? 0.111 : 0.114;
            } else {
            	montant = (energie == Energie.GAZ) ? 0.113 : 0.118;
            }
        } else if (client instanceof ClientParticulier) {
        	montant = (energie == Energie.GAZ) ? 0.115 : 0.121;
        }

        return montant * consommation;
    }

}
