package Dao;

import model.Opportunity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OpportunityDaoImpl {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("LeadPersistance");

	public List<Opportunity> findAll() {

		List<Opportunity> list;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		return list = em.createQuery("FROM Opportunity", Opportunity.class)
				.getResultStream() // Get results as stream
				.sorted(Comparator.comparing(Opportunity :: getRegDate)) // Sort by date created
				.collect(Collectors.toList()); // Return as list
	}

	public void createOpportunity(Opportunity opportunity) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(opportunity);
		em.getTransaction().commit();
		System.out.println(opportunity + " persisted.");
	}

}
