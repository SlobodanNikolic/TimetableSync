package com.sk.userService;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
  
//  @Id
//  @GeneratedValue(strategy=GenerationType.AUTO)
//  private Long id;
  
  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;
  
  @Column(name="password")
  private String password;
  
  @Id
  @Column(name="username")
  private String username;

  
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPassword() {
	return password;
}

public void setPassword(String section) {
	this.password = section;
}


//public void setId(Long id) {
//	this.id = id;
//}

  
  public Admin() {
    
  }
  
  public Admin(String firstName, String lastName, String password, String username) {
    super();
//    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.username = username;
  }

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
  
