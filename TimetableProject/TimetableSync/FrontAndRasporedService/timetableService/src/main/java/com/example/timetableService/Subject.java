package com.example.timetableService;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Subject {

	private Integer id;
	
	private String group;
	
	private String room;
	
	private String subject;
	
	private String startTime;
	
	private String endTime;

	public Subject(String id, String group, String room, String subject, String startTime, String endTime) {
		super();
		this.id = id;
		this.group = group;
		this.room = room;
		this.subject = subject;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}
