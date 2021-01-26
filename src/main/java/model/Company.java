package model;
import model.Contact;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String website;
	private String city;

	@OneToMany(cascade = CascadeType.REMOVE)
	@JoinColumn
	private List <Contact> contactList;


	public Company() {
	}

	public Company(int id, String name, String website, String city) {
		this.id = id;
		this.name = name;
		this.website = website;
		this.city = city;

	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", name='" + name + '\'' +
				", website='" + website + '\'' +
				", city='" + city + '\'' +
				", contacts=" + contactList +
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
