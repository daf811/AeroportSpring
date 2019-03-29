package AeroportSpring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CM")
public class ClientMoral extends Client {
	private Titre clientMoral;
	private String siret;
	
	
	public ClientMoral() {

	}


	public Titre getClientMoral() {
		return clientMoral;
	}

	public void setClientMoral(Titre clientMoral) {
		this.clientMoral = clientMoral;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}
	
}