package contact.service.ContactCervice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import contact.service.ContactCervice.service.ContactServiceImpl;
import contact.service.ContactCervice.entity.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactServiceImpl contactService;

	@GetMapping("/{userId}")
	public List<Contact> getUserContactList(@PathVariable("userId") Long userId) {

		return contactService.getContactListofUser(userId);
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Hi, Jasveer Yadav";
	}
}
