package user.service.UserService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import user.service.UserService.entity.User;
@Service
public class UserServiceImpl implements UserService {

	List<User> userLisr = List.of(new User(1311L, "Jasveer Yadav", "123456"),
			new User(1312L, "Kapil Yadav", "123457"),
			new User(1313L, "Akash Yadav", "123458"),
			new User(1314L, "Hari Yadav", "123459"));

	@Override
	public User getUser(Long usrId) {
		return  userLisr.stream().filter(user->user.getUserId().equals(usrId)).findAny().orElse(null);
	}
}
