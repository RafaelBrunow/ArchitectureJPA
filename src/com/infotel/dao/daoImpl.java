package com.infotel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public class daoImpl implements Idao {

	// Unité de persistence
	EntityManagerFactory emf;

	// Porteur de requête
	EntityManager em;

	@Override
	public int ajouterPersonne(Personne p) {
		// Ouverture de l'unité de persistence
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			// 1 - Ouvrir la transaction
			tx.begin();
			// 2 - Effectuer la requête
			em.persist(p);
			// 3 - Valider la transaction
			tx.commit();
			// 4 - Fermer l'unité de persistence
			em.close();
			emf.close();

		} catch (Exception e) {
			// Annule la transaction
			tx.rollback();
		}
		return p.getId();
	}

	@Override
	public Personne getPersonne(int id) {
		// Ouverture de l'unité de persistence
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Personne p = new Personne();

		try {
			p = em.getReference(Personne.class, id);
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// Ouverture de l'unité de persistence
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			// 1 - Ouvrir la transaction
			tx.begin();
			// 2 - Effectuer la requête
			em.remove(p);
			// 3 - Valider la transaction
			tx.commit();
			// 4 - Fermer l'unité de persistence
			em.close();
			emf.close();

		} catch (Exception e) {
			// Annule la transaction
			tx.rollback();
		}

		return 0;
	}

	@Override
	public int modifierPersonne(Personne p) {
		// Ouverture de l'unité de persistence
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 - Ouvrir la transaction
			tx.begin();
			// 2 - Effectuer la requête
			em.merge(p);
			// 3 - Valider la transaction
			tx.commit();
			// 4 - Fermer l'unité de persistence
			em.close();
			emf.close();

		} catch (Exception e) {
			// Annule la transaction
			tx.rollback();
		}
		return p.getId();
	}

	@Override
	public Personne affichagePersonne(int id) {
		// Ouverture de l'unité de persistence
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Personne p = new Personne();

		try {
			p = em.find(Personne.class, id);
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Personne> findAllPersonne() {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();

		try {
			q = em.createQuery("SELECT p FROM Personne p");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public List<Personne> rechercheParMC(String mc) {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();

		try {
			q = em.createQuery("SELECT p FROM Personne p WHERE nom LIKE :lenom");
			q.setParameter("lenom", "%"+mc+"%");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();

				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.persist(a);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}
				return a.getIdadresse();
			}

	@Override
	public Adresse getAdresse(int idadresse) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				Adresse a = new Adresse();

				try {
					a = em.getReference(Adresse.class, idadresse);
					em.close();
					emf.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				return a;
			}

	@Override
	public Adresse affichageAdresse(int idadresse) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				Adresse a = new Adresse();

				try {
					a = em.find(Adresse.class, idadresse);
					em.close();
					emf.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				return a;
			}

	@Override
	public int supprimerAdresse(Adresse a) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();

				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.remove(a);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}

				return 0;
			}

	@Override
	public int modifierAdresse(Adresse a) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.merge(a);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}
				return a.getIdadresse();
			}

	@Override
	public List<Adresse> findAllAdresse() {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Adresse> l = new ArrayList<Adresse>();

		try {
			q = em.createQuery("SELECT a FROM Adresse a");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public List<Adresse> rechercheParMCAdresse(String mc) {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Adresse> l = new ArrayList<Adresse>();

		try {
			q = em.createQuery("SELECT a FROM Adresse a WHERE ville LIKE :laville");
			q.setParameter("laville", "%"+mc+"%");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public int ajouterConnexion(Connexion c) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();

				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.persist(c);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}
				return c.getIdconnexion();
			}

	@Override
	public Connexion getConnexion(int idconnexion) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				Connexion c = new Connexion();

				try {
					c = em.getReference(Connexion.class, idconnexion);
					em.close();
					emf.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				return c;
			}

	@Override
	public Connexion affichageConnexion(int idconnexion) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				Connexion c = new Connexion();

				try {
					c = em.find(Connexion.class, idconnexion);
					em.close();
					emf.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				return c;
			}

	@Override
	public int supprimerConnexion(Connexion c) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();

				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.remove(c);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}

				return 0;
			}

	@Override
	public int modifierConnexion(Connexion c) {
		// Ouverture de l'unité de persistence
				emf = Persistence.createEntityManagerFactory("demojpa-pu");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				try {
					// 1 - Ouvrir la transaction
					tx.begin();
					// 2 - Effectuer la requête
					em.merge(c);
					// 3 - Valider la transaction
					tx.commit();
					// 4 - Fermer l'unité de persistence
					em.close();
					emf.close();

				} catch (Exception e) {
					// Annule la transaction
					tx.rollback();
				}
				return c.getIdconnexion();
			}

	@Override
	public List<Connexion> findAllConnexion() {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Connexion> l = new ArrayList<Connexion>();

		try {
			q = em.createQuery("SELECT c FROM Connexion c");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public List<Connexion> rechercheParMCConnexion(String mc) {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Connexion> l = new ArrayList<Connexion>();

		try {
			q = em.createQuery("SELECT c FROM Connexion c WHERE login LIKE :lelogin");
			q.setParameter("lelogin", "%"+mc+"%");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public List<Personne> findAllPersonneConnexion() {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();

		try {
			q = em.createQuery("SELECT p FROM Personne p join p.connexion");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Personne> findAllPersonneAdresse() {
		emf = Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();

		try {
			q = em.createQuery("SELECT p FROM Personne p right join p.adresse");
			l = q.getResultList();
			em.close();
			emf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
