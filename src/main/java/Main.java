import Dao.OpportunityDaoImpl;
import model.Opportunity;

import java.util.List;

public class Main {
	public static void main(String[] args) {
//		LeadDaoImpl leadDao = new LeadDaoImpl();
//		leadDao.createLead(new Lead(0, "Volvo", 5));
//		System.out.println(leadDao.findByCompany("Volvo"));
//
//		CompanyDao companyDao = new CompanyDaoImpl();
//
//		System.out.println(companyDao.findCompany("Mullvad"));

		OpportunityDaoImpl opportunityDao = new OpportunityDaoImpl();

		List<Opportunity> opportunities = opportunityDao.findAll();

		System.out.println(opportunities);

	}
}
