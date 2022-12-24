package user.service.UserService.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	private String phoneNo;

	List<Contact> contacts = new ArrayList<>();

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public User() {
		super();
	}

	public User(Long userId, String name, String phoneNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public User(Long userId, String name, String phoneNo, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.contacts = contacts;
	}
}
