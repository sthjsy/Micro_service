package contact.service.ContactCervice.entity;

public class Contact {
	private Long userId;
	private String cId;
	private String contactName;
	private String emailId;

	public Contact() {
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Contact(Long userId, String cId, String contactName, String emailId) {
		super();
		this.userId = userId;
		this.cId = cId;
		this.contactName = contactName;
		this.emailId = emailId;
	}

}
