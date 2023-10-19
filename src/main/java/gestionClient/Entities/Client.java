package gestionClient.Entities;

public class Client {
	
	private String referenceClient;

    public Client(String referenceClient) {
        this.referenceClient = referenceClient;
    }

    

    public String getReferenceClient() {
		return referenceClient;
	}



	public void setReferenceClient(String referenceClient) {
		this.referenceClient = referenceClient;
	}

}
