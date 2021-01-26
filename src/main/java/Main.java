import Dao.ContactDao;
import Dao.ContactDaoImpl;
import model.Contact;

public class Main {

	public static void main(String[] args) {

		ContactDao contactDao = new ContactDaoImpl();

		Contact newContact = new Contact(1,"Albert","Andersson","test@test.se","0723068922");

		contactDao.createContact(newContact);


	}
}
