import Dao.CompanyDao;
import Dao.CompanyDaoImpl;
import Dao.OpportunityDaoImpl;
import model.Opportunity;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {

//		OpportunityDaoImpl opportunityDao = new OpportunityDaoImpl();
//
//		Opportunity opportunity = new Opportunity(1, 1, "Testar ny opportunity konstruktor");
//
//		opportunityDao.createOpportunity(opportunity);
//
//		List<Opportunity> opportunities = opportunityDao.findAll();
//		System.out.println(opportunities);


		CompanyDao companyDao = new CompanyDaoImpl();
		System.out.println(companyDao.findCompany("Mullvad"));
	}
}