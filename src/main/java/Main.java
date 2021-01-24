import Dao.CompanyDao;
import Dao.CompanyDaoImpl;
import Dao.LeadDaoImpl;
import model.Lead;

public class Main {
	public static void main(String[] args) {
//		LeadDaoImpl leadDao = new LeadDaoImpl();
//		leadDao.createLead(new Lead(0, "Volvo", 5));
//		System.out.println(leadDao.findByCompany("Volvo"));

		CompanyDao companyDao = new CompanyDaoImpl();

		System.out.println(companyDao.findCompany("Mullvad"));


	}
}
