package contact.service.ContactCervice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import contact.service.ContactCervice.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contactList = List.of(new Contact(1311L, "1", "Jasveer Yadav", "sthjsy@gmail.com"),
			new Contact(1311L, "2", "Sonal Yadav", "jasveer@servosys.com"),
			new Contact(1312L, "3", "Kapil Yadav", "jasveeryadav@gmail.com"),
			new Contact(1312L, "4", "Hari Yadav", "hari@gmail.com"),
			new Contact(1313L, "5", "Satya Yadav", "satya@gmail.com"));

	@Override
	public List<Contact> getContactListofUser(long userId) {
		return this.contactList.stream().filter(contact -> contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

}
