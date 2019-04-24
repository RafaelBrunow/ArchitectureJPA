package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERS")
@DiscriminatorValue("PERS")

	//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

	//@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int age;
	@ManyToOne
	private Adresse adresse;
	@OneToOne
	private Connexion connexion;
	@ManyToMany
	private List<Club> club = new ArrayList();;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", id=" + id + "]";
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Connexion getConnexion() {
		return connexion;
	}
	public void setConnexion(Connexion connexion) {
		this.connexion = connexion;
	}
	public List<Club> getClub() {
		return club;
	}
	public void setClub(List<Club> club) {
		this.club = club;
	}

	

}
