package contact.service.ContactCervice.service;

import java.util.List;

import contact.service.ContactCervice.entity.Contact;

public interface ContactService {
	public List<Contact> getContactListofUser(long userId);
}
