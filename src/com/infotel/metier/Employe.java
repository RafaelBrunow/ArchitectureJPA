package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EMP")
public class Employe extends Personne{
	
	protected double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", toString()=" + super.toString()+ "]";
	}

}
