package net.skelton.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import net.skelton.dao.UserDaoImpl;
import net.skelton.model.User;
import util.CustomEncoder;


@Service
public class UserServiceImpl implements UserService , UserDetailsService {

	@Autowired
	UserDaoImpl userDao;

	
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	

	
	@Transactional(readOnly=true)
	public List<User> getAll(){
		return this.userDao.getAll();
	}


	@Transactional(readOnly=true)
	public User get(long id) {
		return userDao.get(id);
	}



	@Transactional(readOnly=true)
	public User findByName(String name) {
		return userDao.findbyName(name);

	}



	@Override
	public boolean updatePassword(User user, String password) {
		if(!StringUtils.isEmpty(password)){
			CustomEncoder encoder = new CustomEncoder();
			String hash = encoder.encode(password);
			user.setPassword(hash);
		    this.userDao.update(user);
		    return true;
		}
		
		return false;
	}

	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		return   this.userDao.findbyName(username);
	}


}
