package AeroportSpring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CP")
public class ClientPhysique extends Client {
	
	private Titre clientPhysiques;
	private String prenom;
	
	public Titre getClientPhysiques() {
		return clientPhysiques;
	}
	public void setClientPhysiques(Titre clientPhysiques) {
		this.clientPhysiques = clientPhysiques;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "ClientPhysique [clientPhysiques=" + clientPhysiques + ", prenom=" + prenom + "]";
	}
	
}