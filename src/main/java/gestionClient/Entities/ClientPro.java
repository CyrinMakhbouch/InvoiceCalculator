package gestionClient.Entities;

public class ClientPro extends Client{
	
	private String siret;
    private String raisonSociale;
    private double chiffreAffaires;

    public ClientPro(String referenceClient, String siret, String raisonSociale, double chiffreAffaires) {
        super(referenceClient);
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.chiffreAffaires = chiffreAffaires;
    }

    

    public String getSiret() {
		return siret;
	}



	public void setSiret(String siret) {
		this.siret = siret;
	}



	public String getRaisonSociale() {
		return raisonSociale;
	}



	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}



	public void setChiffreAffaires(double chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}



	public double getChiffreAffaires() {
        return chiffreAffaires;
    }

}
