package com.infotel.services;

import java.util.List;

import com.infotel.dao.Idao;
import com.infotel.dao.daoImpl;
import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public class ServicesImpl implements Iservices {
	
	private Idao dao = new daoImpl();

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public Personne getPersonne(int id) {
		// TODO Auto-generated method stub
		return dao.getPersonne(id);
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}

	@Override
	public Personne affichagePersonne(int id) {
		// TODO Auto-generated method stub
		return dao.affichagePersonne(id);
	}

	@Override
	public List<Personne> findAllPersonne() {
		// TODO Auto-generated method stub
		return dao.findAllPersonne();
	}

	@Override
	public List<Personne> rechercheParMC(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercheParMC(mc);
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdresse(a);
	}

	@Override
	public Adresse getAdresse(int idadresse) {
		// TODO Auto-generated method stub
		return dao.getAdresse(idadresse);
	}

	@Override
	public Adresse affichageAdresse(int idadresse) {
		// TODO Auto-generated method stub
		return dao.affichageAdresse(idadresse);
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.supprimerAdresse(a);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.modifierAdresse(a);
	}

	@Override
	public List<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return dao.findAllAdresse();
	}

	@Override
	public List<Adresse> rechercheParMCAdresse(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercheParMCAdresse(mc);
	}

	@Override
	public int ajouterConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.ajouterConnexion(c);
	}

	@Override
	public Connexion getConnexion(int idconnexion) {
		// TODO Auto-generated method stub
		return dao.getConnexion(idconnexion);
	}

	@Override
	public Connexion affichageConnexion(int idconnexion) {
		// TODO Auto-generated method stub
		return dao.affichageConnexion(idconnexion);
	}

	@Override
	public int supprimerConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.supprimerConnexion(c);
	}

	@Override
	public int modifierConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.modifierConnexion(c);
	}

	@Override
	public List<Connexion> findAllConnexion() {
		// TODO Auto-generated method stub
		return dao.findAllConnexion();
	}

	@Override
	public List<Connexion> rechercheParMCConnexion(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercheParMCConnexion(mc);
	}

	@Override
	public List<Personne> findAllPersonneConnexion() {
		// TODO Auto-generated method stub
		return dao.findAllPersonneConnexion();
	}

	@Override
	public List<Personne> findAllPersonneAdresse() {
		// TODO Auto-generated method stub
		return dao.findAllPersonneAdresse();
	}

}
