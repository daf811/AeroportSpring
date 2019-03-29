package AeroportSpring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="compagnie_aerienne")
@SequenceGenerator(name = "seqComp", sequenceName = "seq_comp", initialValue = 100, allocationSize = 1)
public class CompagnieAerienne {
@Id
@GeneratedValue(generator = "seqComp", strategy = GenerationType.SEQUENCE)
@Column(name="id_compagnie")
private Integer id;
@Column(name="nom_compagnie")
private String nom;

@OneToMany(mappedBy = "key.compagnie")
private Set<CompagnieAerienneVol> compagnies;
@Version
private Integer version;

public CompagnieAerienne() {
	super();
}

public CompagnieAerienne(String nom) {
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


public Integer getVersion() {
	return version;
}
public void setVersion(Integer version) {
	this.version = version;
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
	CompagnieAerienne other = (CompagnieAerienne) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}




}
