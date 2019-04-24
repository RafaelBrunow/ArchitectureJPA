package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Club {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int idclub;
	private String nomClub;
	
	@ManyToMany(mappedBy="club")
	private List<Personne> personne = new ArrayList();;
	
	public int getIdclub() {
		return idclub;
	}
	public void setIdclub(int idclub) {
		this.idclub = idclub;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	@Override
	public String toString() {
		return "Club [idclub=" + idclub + ", nomClub=" + nomClub + "]";
	}
	public List<Personne> getPersonne() {
		return personne;
	}
	public void setPersonne(List<Personne> personne) {
		this.personne = personne;
	}

	
}
