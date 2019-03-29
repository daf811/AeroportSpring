package AeroportSpring.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compagnie_aerienne_vol")
public class CompagnieAerienneVol {
	@EmbeddedId
	private CompagnieAerienneVolPK key;
}	
