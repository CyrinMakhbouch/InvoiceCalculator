package gestionClient.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionClient.Entities.ClientParticulier;
import gestionClient.Entities.ClientPro;
import gestionClient.Entities.Energie;
import gestionClient.Utilities.CalculFacture;

public class FactureClientTest {
	
	@Test
	public void testCalculFacturePartElec() {
		ClientParticulier clientParticulier = new ClientParticulier("EKW65148265", "Mr", "Pierre", "Joe");
		double montantFacture = CalculFacture.calculerFacture(Energie.ELECTRICITE, 200, clientParticulier);
		assertEquals(12.1, montantFacture);
	}
	
	@Test
    public void testCalculFacturePartGaz() {
        ClientParticulier clientParticulier = new ClientParticulier("EKW15618651", "M.", "Jane", "Miller");
        double montantFacture = CalculFacture.calculerFacture(Energie.GAZ, 50, clientParticulier);
        assertEquals(5.75, montantFacture);
    }

    @Test
    public void testCalculFactureProElecCASup() {
        ClientPro clientPro = new ClientPro("EKW87654321", "56651658", "Ekwateur Entreprise", 15);
        double montantFacture = CalculFacture.calculerFacture(Energie.ELECTRICITE, 20, clientPro);
        assertEquals(57.0, montantFacture);
    }

    @Test
    public void testCalculFactureProGazCASup() {
        ClientPro clientPro = new ClientPro("EKW87654321", "69416314", "Ekwateur Entreprise", 1500000);
        double montantFacture = CalculFacture.calculerFacture(Energie.GAZ, 5000, clientPro);
        assertEquals(22.2, montantFacture);
    }

    @Test
    public void testCalculFactureProElecCAInf() {
        ClientPro clientPro = new ClientPro("EKW87654321", "98465164", "Ekwateur Entreprise", 900000);
        double montantFacture = CalculFacture.calculerFacture(Energie.ELECTRICITE, 500, clientPro);
        assertEquals(59.0, montantFacture);
    }

    @Test
    public void testCalculFactureProGazCAInf() {
        ClientPro clientPro = new ClientPro("EKW87654321", "16598635", "Ekwateur Entreprise", 800000);
        double montantFacture = CalculFacture.calculerFacture(Energie.GAZ, 200, clientPro);
        assertEquals(22.6, montantFacture);
    }

}
