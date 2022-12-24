package user.service.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import user.service.UserService.entity.User;
import user.service.UserService.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private RestTemplate restemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		System.out.println("Jasveer");
		User user = userService.getUser(userId);
		List contactList = restemplate.getForObject("http://ContactService/contact/" + user.getUserId(), List.class);
		user.setContacts(contactList);
		return user;
	}

	@GetMapping("/welcome")
	public String getWelcome() {
		return "Jasveer";
	}

}
