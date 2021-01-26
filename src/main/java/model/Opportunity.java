package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Opportunities")
public class Opportunity {

	@Id
	private int id;
	@Column(name = "CompanyId")
	private int companyId;
	@Column(name = "ContactId")
	private int contactId;
	@Column(name = "Comment")
	private String comment;
	@Column(name = "DateCreated")
	private LocalDate regDate = LocalDate.now();

	@OneToOne
	@JoinColumn(name = "CompanyId", insertable = false, updatable = false) // Join via CompanyId
	private Company company;

	@OneToOne
	@JoinColumn(name = "ContactID", insertable = false, updatable = false) // Join via ContactID
	private Contact contact;



	public Opportunity(int id, int companyId, int contactId, String comment, List<Opportunity> opportunities) {
		this.id = id;
		this.companyId = companyId;
		this.contactId = contactId;
		this.comment = comment;
	}


	public Opportunity() {
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Company getCompany() {
		return company;
	}
}
