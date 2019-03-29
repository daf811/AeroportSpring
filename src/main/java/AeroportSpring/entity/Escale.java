package AeroportSpring.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Escale extends Vol{ 
	private Date heureDepart;
	private Date heureArrivee;
	
	public Escale() {
		super();
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	

}
