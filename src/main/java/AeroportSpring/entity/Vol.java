package AeroportSpring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table(name="vol")
@SequenceGenerator(name = "seqVol", sequenceName = "seq_vol", initialValue = 100, allocationSize = 1)
@NamedQuery(name = "Vol.findAll", query = "select v from Vol v")
public class Vol {
	@Id
	@GeneratedValue(generator = "seqVol", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_vol")
	private Integer id;
	@Column(name = "date_depart")
	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	@Column(name = "date_arrivee")
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Column(name = "heure_depart")
	@Temporal(TemporalType.TIME)
	private Date heureDepart;
	@Column(name = "heure_arrivee")
	@Temporal(TemporalType.TIME)
	private Date heureArrivee;
	@OneToMany(mappedBy = "key.vol", fetch = FetchType.LAZY)
	private Set<AeroportVol> DepartVols;
	@OneToMany(mappedBy = "key.vol", fetch = FetchType.LAZY)
	private Set<AeroportVol> ArriveeVols;
	@OneToMany(mappedBy = "key.vol")
	private Set<CompagnieAerienneVol> vols;
	@Version
	private Integer version;
	
	
	public Vol() {
		super();
	}
	
	
	
	public Vol(Date dateDepart, Date dateArrivee, Set<AeroportVol> departVols, Set<AeroportVol> arriveeVols) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		DepartVols = departVols;
		ArriveeVols = arriveeVols;
	}



	public Vol(Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee, Set<AeroportVol> departVols,
			Set<AeroportVol> arriveeVols) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		DepartVols = departVols;
		ArriveeVols = arriveeVols;
	}







	public Vol(Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee) {
		super();
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}



	

	public Set<AeroportVol> getDepartVols() {
		return DepartVols;
	}

	public void setDepartVols(Set<AeroportVol> departVols) {
		DepartVols = departVols;
	}

	public Set<AeroportVol> getArriveeVols() {
		return ArriveeVols;
	}

	public void setArriveeVols(Set<AeroportVol> arriveeVols) {
		ArriveeVols = arriveeVols;
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
		Vol other = (Vol) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
