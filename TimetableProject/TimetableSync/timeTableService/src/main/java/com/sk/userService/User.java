package com.sk.userService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  
//  @Id
//  @GeneratedValue(strategy=GenerationType.AUTO)
//  private Long id;
  
  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;
  
  @Column(name="password")
  private String password;
  
  @Column(name="group_code")
  private String group;
  
  @Id
  @Column(name="index")
  private String index;
  
 

private int port;

  
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getGroup() {
	return group;
}

public void setGroup(String group) {
	this.group = group;
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

public String getIndex() {
	return index;
}

public void setIndex(String index) {
	this.index = index;
}

//public void setId(Long id) {
//	this.id = id;
//}

  
  public User() {
    
  }
  
  public User(String firstName, String lastName, String password, String group, String index) {
    super();
//    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.index = index;
    this.group = group;
  }
//  public Long getId() {
//    return id;
//  }

  
  public int getPort() {
    return port;
  }
  
  public void setPort(int port) {
    this.port = port;
  }
  
}