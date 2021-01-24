package Dao;

import model.Company;
import model.Opportunity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OpportunityDaoImpl {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("LeadPersistance");


	public List<Opportunity> finAll() {

		List<Opportunity> list;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		list = em.createQuery("FROM Opportunity", Opportunity.class)
				.getResultStream()
				.collect(Collectors.toList());

		if(list.isEmpty()) {
			System.out.println("No results found");
		}

		return list;
	}
}
