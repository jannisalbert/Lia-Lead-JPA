package Dao;

import model.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContactDaoImpl implements ContactDao {

    EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("LeadPersistance");

    @Override
    public void createContact(Contact contact) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(contact);
        em.getTransaction().commit();
        em.close();
        System.out.println("contact added");

    }
}
