package AeroportSpring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="aeroport")
@SequenceGenerator(name = "seqAeroport", sequenceName = "seq_aeroport", initialValue = 100, allocationSize = 1)
public class Aeroport {
	@Id
	@GeneratedValue(generator = "seqAeroport", strategy = GenerationType.SEQUENCE)
	@Column(name="id_aeroport")
	private Integer id;
	@Column(name="nom_aeroport")
	private String nom;
	@Version
	private int version;
	@OneToMany(mappedBy = "key.aeroport", fetch = FetchType.LAZY)
	private Set<AeroportVol> departAeroports;
	@OneToMany(mappedBy = "key.aeroport", fetch = FetchType.LAZY)
	private Set<AeroportVol> arriveeAeroports;
	@OneToMany(mappedBy = "key.aeroport")
	private Set<AeroportVille> aeroports;
	
	
	public Aeroport() {
		super();
	}
	
	

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	




	public Set<AeroportVille> getAeroports() {
		return aeroports;
	}



	public void setAeroports(Set<AeroportVille> aeroports) {
		this.aeroports = aeroports;
	}



	public Set<AeroportVol> getDepartAeroports() {
		return departAeroports;
	}



	public void setDepartAeroports(Set<AeroportVol> departAeroports) {
		this.departAeroports = departAeroports;
	}



	public Set<AeroportVol> getArriveeAeroports() {
		return arriveeAeroports;
	}



	public void setArriveeAeroports(Set<AeroportVol> arriveeAeroports) {
		this.arriveeAeroports = arriveeAeroports;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeroport other = (Aeroport) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
