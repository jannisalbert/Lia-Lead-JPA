import javax.persistence.*;

@Entity
@Table(name = "`Lia_Leads`")
public class Lead {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Company")
	private String company;
	@Column(name = "ContactId")
	private int contactId;

	@Override
	public String toString() {
		return "Lead{" +
				"id=" + id +
				", company='" + company + '\'' +
				", contactId=" + contactId +
				'}';
	}

	public Lead() {
	}

	public Lead(int id, String company, int contactId) {
		this.id = id;
		this.company = company;
		this.contactId = contactId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
}
