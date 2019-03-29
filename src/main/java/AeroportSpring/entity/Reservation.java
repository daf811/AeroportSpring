package org.formation.AeroportSpring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "reservation")
@NamedQueries({ @NamedQuery(name = "Reservation.findAll", query = "select r from Reservation r"),
	@NamedQuery(name = "Reservation.findByClient", query = "select r from Reservation r left join fetch r.client c where c.id=:key") 
	})
public class Reservation {

	@Id
	@Column(name = "id_reservation")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersonne")
	private Long id;
	@Column(name = "date")
	private Date date;
	@Column(name = "numero")
	private Integer numero;
	@ManyToOne
	private Passager passagers;
	@Version
	private int version;
	
	public Reservation() {
		
	}
	
	public Reservation(Date date, Integer numero) {
		this.date = date;
		this.numero = numero;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Passager getPassagers() {
		return passagers;
	}

	public void setPassagers(Passager passagers) {
		this.passagers = passagers;
	}

}
