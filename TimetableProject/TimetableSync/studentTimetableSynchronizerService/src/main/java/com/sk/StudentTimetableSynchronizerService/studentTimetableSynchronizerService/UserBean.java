package com.sk.StudentTimetableSynchronizerService.studentTimetableSynchronizerService;

public class UserBean {
	private String firstName;
	private String lastName;
	private String group;
	private String index;
	private int port;
	  
	public UserBean() {
		
	}
	
	public UserBean(String firstName, String lastName, String group, String index, int port) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.index = index;
		this.group = group;
		this.port = port;
	}

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

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	  
}
