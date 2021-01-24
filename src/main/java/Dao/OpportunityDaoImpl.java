package Dao;

import model.Company;
import model.Contact;
import model.Opportunity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
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

	public void create(int companyId, int contactId, String comment) {
		Opportunity opportunity = new Opportunity();

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// Find contact
		Contact contact = em.find(Contact.class, contactId);
		// Find company
		Company company = em.find(Company.class, companyId);

		// Create opportunity
		opportunity.setContact(contact);
		opportunity.setCompany(company);
		opportunity.setComment(comment);
		opportunity.setRegDate(LocalDate.now());
		opportunity.setCompanyId(company.getId());
		opportunity.setContactId(contact.getId());

		em.persist(opportunity);
		em.getTransaction().commit();
		System.out.println(opportunity.toString() + " committed.");

	}
}
