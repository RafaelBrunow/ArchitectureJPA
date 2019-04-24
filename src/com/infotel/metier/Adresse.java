package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;

@Entity
public class Adresse {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int idadresse;
	private String numRue;
	private String nomRue;
	private String cp;
	private String ville;
	@OneToMany(mappedBy="adresse")
	private List<Personne> personne = new ArrayList();
	
	public int getIdadresse() {
		return idadresse;
	}
	public void setIdadresse(int idadresse) {
		this.idadresse = idadresse;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [idadresse=" + idadresse + ", numRue=" + numRue + ", nomRue=" + nomRue + ", cp=" + cp
				+ ", ville=" + ville + "]";
	}
	public List<Personne> getPersonne() {
		return personne;
	}
	public void setPersonne(List<Personne> personne) {
		this.personne = personne;
	}
	

	//Permet de supprimer le lien avec la classe Personne (si il existe) lors de la suppression d'une adresse
	@PreRemove
	public void deleteSetNull() {
		for(Personne p : personne) {
			p.setAdresse(null);
		}
	}

}
