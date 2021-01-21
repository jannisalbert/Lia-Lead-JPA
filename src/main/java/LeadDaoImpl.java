import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class LeadDaoImpl {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("LeadPersistance");

	public List<Lead> findByCompany(String company) {
		System.out.println("Inside method");

		List<Lead> list;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		list = em.createQuery("FROM Lead l WHERE l.company = :Company", Lead.class)
				.setParameter("Company", company)
				.getResultList();

		if(list.isEmpty()) {
			System.out.println("No results for " + company);
		}

		em.getTransaction().commit();
		em.close();
		return list;
	}

	public void createLead(Lead lead) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(lead);
		em.getTransaction().commit();


	}

}
