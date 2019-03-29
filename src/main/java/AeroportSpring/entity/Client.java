package AeroportSpring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name="client")
@NamedQueries({ @NamedQuery(name = "Client.findAll", query = "select c from Client c") }) 
@SequenceGenerator(name="seqClient",sequenceName="seq_client",initialValue=100,allocationSize=1)

public abstract class Client {
@Id
@Column(name = "id_client")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClient")
private Integer id;
@Column(name = "last_name", length = 150, nullable = false)
private String nom;
@Column(name="numero_tel")
private Integer numeroTel;
@Column(name="numero_fax")
private Integer numeroFax;
@Column(name="email")
private String email;
@Version
private int version;
@OneToOne(mappedBy="client")
private Login login;

public Client() {
}

public Client(String nom, Integer numeroTel, Integer numeroFax, String email) {
	this.nom = nom;
	this.numeroTel = numeroTel;
	this.numeroFax = numeroFax;
	this.email = email;
}

public Client(Integer id, String nom, int numeroTel, int numeroFax, String email, int version) {
	super();
	this.id = id;
	this.nom = nom;
	this.numeroTel = numeroTel;
	this.numeroFax = numeroFax;
	this.email = email;
	this.version = version;
	
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
public int getNumeroTel() {
	return numeroTel;
}
public void setNumeroTel(int numeroTel) {
	this.numeroTel = numeroTel;
}
public int getNumeroFax() {
	return numeroFax;
}
public void setNumeroFax(int numeroFax) {
	this.numeroFax = numeroFax;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + numeroFax;
	result = prime * result + numeroTel;
	result = prime * result + version;
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
	Client other = (Client) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (numeroFax != other.numeroFax)
		return false;
	if (numeroTel != other.numeroTel)
		return false;
	if (version != other.version)
		return false;
	return true;
}

}