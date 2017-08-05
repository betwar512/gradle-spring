package net.skelton.service;

import java.util.List;

import net.skelton.model.User;


public interface UserService {

	public User       get(long id);
	public List<User> getAll();
	public User       findByName(String name);
	boolean updatePassword(User user, String password);

}
