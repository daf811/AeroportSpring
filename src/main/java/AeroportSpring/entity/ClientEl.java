package AeroportSpring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CEl")
public class ClientEl extends Client {
	
private Titre clientEl;
private String prenom ;

public ClientEl() {
}

public Titre getClientEl() {
	return clientEl;
}
public void setClientEl(Titre clientEl) {
	this.clientEl = clientEl;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

}