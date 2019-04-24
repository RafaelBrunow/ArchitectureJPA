package com.infotel.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

public class Lanceur {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservices service = new ServicesImpl();
		Scanner scanner = new Scanner(System.in);
		
		// Ajout
		
		/*	Personne p = new Personne();
		p.setNom("Brunow");
		p.setPrenom("Raf");
		p.setAge(24);
		
		service.ajouterPersonne(p); */
		
		/*	Client c = new Client();
		c.setNom("LeMarto");
		c.setPrenom("Lulu");
		c.setAge(24);
		c.setNumeroAdherent(1); 
		
		service.ajouterPersonne(c); */
		
		/*	Employe e = new Employe();
		e.setNom("Vairac");
		e.setPrenom("Jojo");
		e.setAge(27);
		e.setSalaire(18000);
		
		service.ajouterPersonne(e); */
		
		
		// Suppression
		
		/*	Personne p = new Personne();
		p = service.getPersonne(8);
		service.supprimerPersonne(p); */

		
		// Modification
		
		/*	Personne p = new Personne();
		p = service.affichagePersonne(9);
		p.setNom("MancheaBamako");
		p.setPrenom("Lydie");
		p.setAge(30);
		service.modifierPersonne(p);
		System.out.println(p); */
		
		/*	for(Personne p : service.findAllPersonne()) {
			System.out.println(p);
	} */
		
		/*	for(Personne p1 : service.rechercheParMC("ow")) {
			System.out.println(p1);
	} */
		
		
				// Ajout
		
//				Adresse a = new Adresse();
//				a.setNomRue("Rue de l'Ermitage");
//				a.setNumRue("9");
//				a.setVille("Le Pecq");
//				a.setCp("78230");
//				
//				service.ajouterAdresse(a);
//				

				// Suppression
				
//				Adresse a1 = new Adresse();
//				a1 = service.getAdresse(4);
//				service.supprimerAdresse(a1);

				
				// Modification
				
				/*	Adresse a2 = new Adresse();
				a2 = service.affichageAdresse(3);
				a2.setNomRue("Rue de Bruxelles");
				a2.setNumRue("17");
				a2.setVille("Villeurbanne");
				a2.setCp("69100");
				service.modifierAdresse(a2);
				System.out.println(a2); */
				
				/*	for(Adresse a3 : service.findAllAdresse()) {
					System.out.println(a3);
			} */
				
				/*	for(Adresse a4 : service.rechercheParMCAdresse("gast")) {
					System.out.println(a4); 
			} */
		
		
		// Ajout
		
		/*	Connexion c = new Connexion();
		c.setLogin("Bonjourdu29");
		c.setMdp("Youpi");
		
		service.ajouterConnexion(c); */
		

		// Suppression
		
		/*	Connexion c1 = new Connexion();
		c1 = service.getConnexion(2);
		service.supprimerConnexion(c1); */

		
		// Modification
		
		/*	Connexion c2 = new Connexion();
		c2 = service.affichageConnexion(3);
		c2.setLogin("Aurevoirdu69");
		c2.setMdp("Zut");
		service.modifierConnexion(c2);
		System.out.println(c2); */
		
		/*	for(Connexion c3 : service.findAllConnexion()) {
			System.out.println(c3);
	} */
		
		/*	for(Connexion c4 : service.rechercheParMCConnexion("jour")) {
			System.out.println(c4); 
	} */
		
		// Test cascade
		
//		Adresse a = new Adresse();
//		a.setNomRue("Rue de l'Europe 1");
//		a.setNumRue("45");
//		a.setVille("Plougastel-Daoulas");
//		a.setCp("29470");
//		
//		Personne p = new Personne();
//		p.setNom("Brunow 1");
//		p.setPrenom("Raf");
//		p.setAge(24);
//		p.setAdresse(a);
//		
//		service.ajouterPersonne(p);
		
		// Appel à la méthode findAllPersonneConnexion()
		
//		for (Personne pers : service.findAllPersonneConnexion()) {
//			System.out.println(pers + " " + pers.getConnexion());
			
		// Appel à la méthode findAllPersonneAdresse()
			
//		for (Personne pers : service.findAllPersonneAdresse()) {
//			System.out.println(pers + " " + pers.getAdresse());
//			
//		}
	}
		
}
