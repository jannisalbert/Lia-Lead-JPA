import Dao.OpportunityDaoImpl;
import model.Opportunity;

import java.time.LocalDate;
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
//
//
//		opportunityDao.create(4, 4, "Ring ang. lia, verkar som dom är intresserade");
//		opportunityDao.create(5, 5, "Mats pratade om att dom eventuellt skulle ta emot lia hösten 2021");

		List<Opportunity> opportunities = opportunityDao.findAll();
		System.out.println(opportunities);


	}
}
