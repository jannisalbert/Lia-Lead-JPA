package Dao;

import model.Company;

import java.util.List;

public interface CompanyDao {
	public List<Company> findCompany(String companyName);

}
