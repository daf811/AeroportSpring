package org.formation.AeroportSpring.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.formation.AeroportSpring.entity.Adresse;

@Entity
@Table(name = "passager")
@NamedQueries({ @NamedQuery(name = "Passager.findAll", query = "select p from Passager p"),
	@NamedQuery(name = "Passager.findByReservation", query = "select distinct p from Passager p left join fetch p.reservations r where r.id=:key") })
public class Passager {

	@Id
	@Column(name = "id_personne")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersonne")
	private Long id;
	@Column(name = "prenom", length = 150, nullable = false)
	private String prenom;
	@Column(name = "nom", length = 150, nullable = false)
	private String nom;
	@AttributeOverrides({
        @AttributeOverride(name = "adresse", column = @Column(name = "adresse_passager", length = 100)),
        @AttributeOverride(name = "codePostal", column = @Column(name = "codePostal_passager", length = 6)),
        @AttributeOverride(name = "ville", column = @Column(name = "ville_passager", length = 100)),
        @AttributeOverride(name = "pays", column = @Column(name = "pays_passager", length = 100)) })
	private Adresse adresse;
	@OneToMany(mappedBy = "passagers", fetch = FetchType.LAZY)
	private List <Reservation> reservations = new ArrayList();
	@Version
	private int version;


	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Passager() {
		
	}
	
	public Passager(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	
	public Passager(String prenom, String nom, Adresse adresse, List<Reservation> reservations) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.reservations = reservations;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}
