package gestionClient;

import gestionClient.Entities.ClientParticulier;
import gestionClient.Entities.ClientPro;
import gestionClient.Entities.Energie;
import gestionClient.Utilities.CalculFacture;

public class GestionClientMain {
	
	public static void main(String[] args) {
        
        ClientParticulier clientParticulier = new ClientParticulier("EKW12345678", "Mr", "Pierre", "John");

        
        ClientPro clientPro = new ClientPro("EKW87654321", "123456789", "Ekwateur Inc.", 1500000);

        
        double factureElecPart = CalculFacture.calculerFacture(Energie.ELECTRICITE, 100, clientParticulier);
        double factureGazPart = CalculFacture.calculerFacture(Energie.GAZ, 50, clientParticulier);

        double factureElecPro = CalculFacture.calculerFacture(Energie.ELECTRICITE, 500, clientPro);
        double factureGazPro = CalculFacture.calculerFacture(Energie.GAZ, 200, clientPro);

        
        System.out.println("Montant facture Electricité Particulier pour un mois: " + factureElecPart);
        System.out.println("Montant facture Gaz Particulier pour un mois: " + factureGazPart);
        System.out.println("Montant facture Electricité Pro pour un mois: " + factureElecPro);
        System.out.println("Montant facture Gaz Pro pour un mois: " + factureGazPro);
    }

}
