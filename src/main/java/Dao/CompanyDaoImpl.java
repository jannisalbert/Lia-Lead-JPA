package Dao;

import model.Company;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CompanyDaoImpl implements CompanyDao {

	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("LeadPersistance");


	@Override
	public List<Company> findCompany(String companyName) {

		List<Company> list;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		list = em.createQuery("FROM Company c WHERE c.name = :Company", Company.class)
				.setParameter("Company", companyName)
				.getResultList();

		if(list.isEmpty()) {
			System.out.println("No results found");
		}

		return list;
	}
}
