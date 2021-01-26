package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;
	String website;
	String city;

	@OneToMany
	@JoinColumn(name = "CompanyId")
	private List<Contact> companyContact;

	public Company() {
	}

	public List<Contact> getCompanyContact() {
		return companyContact;
	}

	public void setCompanyContact(List<Contact> companyContact) {
		this.companyContact = companyContact;
	}

	public Company(String name, String website, String city) {
		this.name = name;
		this.website = website;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Company{" +
				"name='" + name + '\'' +
				", website='" + website + '\'' +
				", city='" + city + '\'' +
				", companyContact=" + companyContact +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
