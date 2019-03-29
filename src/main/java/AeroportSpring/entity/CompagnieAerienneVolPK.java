package AeroportSpring.entity;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CompagnieAerienneVolPK implements Serializable{
	@ManyToOne
	@JoinColumn(name="id_vol")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name="id_compagnie")
	private CompagnieAerienne compagnie;
	
	public CompagnieAerienneVolPK() {
		super();
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public CompagnieAerienne getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(CompagnieAerienne compagnie) {
		this.compagnie = compagnie;
	}
	
	

}
