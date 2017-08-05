package net.skelton.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * User base Email server class 
 * @author A.H.Safaie
 *
 */
@Entity
@Table(name="user")
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY) 
		private long         id;
		@Column(name="name")
		private String userName;
		@Column(name="password")
		private String password;
		@Column(name="email_password")
		private String emailPassword;
		@Column(name="email")
		private String    email;
		@Column(name="registered_email")
		private String registeredEmail;		
		@Column(name="created_at")
		@Type(type = "date")
		private Date  createdAt;
		@Column(name="updated_at")
		@Type(type = "date")
		private Date  updatedAt;

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		
		public String getEmailPassword() {
			return emailPassword;
		}
		public void setEmailPassword(String emailPassword) {
			this.emailPassword = emailPassword;
		}
		public String getRegisteredEmail() {
			return registeredEmail;
		}
		public void setRegisteredEmail(String registeredEmail) {
			this.registeredEmail = registeredEmail;
		}
		
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String getUsername() {
			return this.getEmail();
		}
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
	
		
		
		
}
