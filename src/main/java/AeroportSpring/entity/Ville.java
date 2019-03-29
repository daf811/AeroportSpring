package AeroportSpring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ville")
@SequenceGenerator(name = "seqVille", sequenceName = "seq_ville", initialValue = 100, allocationSize = 1)

public class Ville {
	@Id
	@GeneratedValue(generator = "seqVille", strategy = GenerationType.SEQUENCE)
	@Column(name="id_ville")
	private Integer id;
	@Column(name="nom")
	private String nom;
	@OneToMany(mappedBy = "key.ville")
	private Set<AeroportVille> villes;
	@Version
	private int version;
	
	
	public Ville() {
		super();
	}


	public Ville(String nom) {
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





	public Set<AeroportVille> getVilles() {
		return villes;
	}


	public void setVilles(Set<AeroportVille> villes) {
		this.villes = villes;
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
		Ville other = (Ville) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
