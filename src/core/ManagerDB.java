package core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerDB {

	private static final String PERSITENCE_NAME = "Persistencia";
	private static EntityManagerFactory emf;
	private static EntityManager em;

	public static EntityManager getEntityManager() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory(PERSITENCE_NAME);

		if (em == null)
			em = emf.createEntityManager();

		return em;
	}

	public static void shutdown() {
		if (emf != null)
			emf.close();
	}

}
