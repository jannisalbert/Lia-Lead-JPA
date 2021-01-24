package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Opportunities")
public class Opportunity {

	@Id
	private int id;
	private int companyId;
	private int contactId;
	private String comment;
	@Column(name = "DateCreated")
	private LocalDate regDate;

	@OneToOne
	@JoinColumn(name = "id")
	private Contact contact;

	@OneToOne
	@JoinColumn(name = "id")
	private Company company;

	@Override
	public String toString() {
		return "Opportunity{" +
				"id=" + id +
				", company=" + company +
				", contact=" + contact +
				", comment='" + comment + '\'' +
				", regDate=" + regDate +
				'}';
	}

	public Opportunity(int id, int companyId, int contactId, String comment, LocalDate regDate, Contact contact, Company company) {
		this.id = id;
		this.companyId = companyId;
		this.contactId = contactId;
		this.comment = comment;
		this.regDate = regDate;
		this.contact = contact;
		this.company = company;
	}

	public Opportunity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
