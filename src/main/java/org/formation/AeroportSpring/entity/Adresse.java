package org.formation.AeroportSpring.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "codePostal", length = 6)
	private String codePostal;
	@Column(name = "ville", length = 150)
	private String ville;
	@Column(name = "pays", length = 150)
	private String pays;

	public Adresse() {
	}

	public Adresse(String adresse, String codePostal, String ville, String pays) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
