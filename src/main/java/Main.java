import Dao.OpportunityDaoImpl;
import model.Opportunity;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		OpportunityDaoImpl opportunityDao = new OpportunityDaoImpl();

		List<Opportunity> opportunities = opportunityDao.findAll();
		System.out.println(opportunities);

	}
}
