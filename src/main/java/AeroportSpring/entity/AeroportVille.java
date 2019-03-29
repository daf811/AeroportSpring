package AeroportSpring.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="aeroport_ville")
public class AeroportVille {
	@EmbeddedId
	private VilleAeroportPk key;

	public AeroportVille() {
		super();
	}

	public VilleAeroportPk getKey() {
		return key;
	}

	public void setKey(VilleAeroportPk key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		AeroportVille other = (AeroportVille) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	

}
