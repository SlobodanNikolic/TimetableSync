package com.example.timetableService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Timetable {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="group")
	private String group;
	
	@Column(name="room")
	private String room;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="end_time")
	private String endTime;
	
	@Column(name="day")
	private String day;
	
	private int port;
	
	public Timetable(){
		super();
	}

	public Timetable(String id, String group, String room, String subject, String startTime, String endTime) {
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

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
