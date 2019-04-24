package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public interface Idao {
	
	public int ajouterPersonne(Personne p);
	public Personne getPersonne(int id);
	public Personne affichagePersonne(int id);
	public int supprimerPersonne(Personne p);
	public int modifierPersonne(Personne p);
	public List<Personne> findAllPersonne();
	public List<Personne> rechercheParMC(String mc);
	
	public List<Personne> findAllPersonneConnexion();
	public List<Personne> findAllPersonneAdresse();
	
	public int ajouterAdresse(Adresse a);
	public Adresse getAdresse(int idadresse);
	public Adresse affichageAdresse(int idadresse);
	public int supprimerAdresse(Adresse a);
	public int modifierAdresse(Adresse a);
	public List<Adresse> findAllAdresse();
	public List<Adresse> rechercheParMCAdresse(String mc);
	
	public int ajouterConnexion(Connexion c);
	public Connexion getConnexion(int idconnexion);
	public Connexion affichageConnexion(int idconnexion);
	public int supprimerConnexion(Connexion c);
	public int modifierConnexion(Connexion c);
	public List<Connexion> findAllConnexion();
	public List<Connexion> rechercheParMCConnexion(String mc);
	
}
