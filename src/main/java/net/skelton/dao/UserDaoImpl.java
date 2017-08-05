package net.skelton.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import net.skelton.model.User;

/**
 * 
 * @author A.H.Safaie
 *
 */

@Repository
public class UserDaoImpl implements UserDao {

	private Session getSession(){
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAll() {		
		return this.getSession().createQuery("from User user").list();
	}
	

	@Override
	public User get(long id) {
		return this.getSession().get(User.class,id);
	}

	@Override
	public User findbyName(String name) {
	 @SuppressWarnings("unchecked")
	List<User> users	= this.getSession()
			.createQuery("from User user where user.email=:email")
			.setParameter("email", name)
			.list();
		return users.isEmpty() ? null : users.get(0);
	}
	

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(User user){
		this.getSession().saveOrUpdate(user);
	}
	
	
	
	  /*-----------------------------------------------------------*/
	 /*			Private 										  */
	/*-----------------------------------------------------------*/
	


	
}
