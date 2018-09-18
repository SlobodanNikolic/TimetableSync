package com.example.timetableService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TimetableRepository extends JpaRepository<Subject, Integer>{

	@Query("SELECT * FROM Timetable WHERE t.group = :group")
	String findByGroup(@Param("group") String group);
	
	@Query("SELECT * FROM Timetable WHERE t.room = :room")
	String findByRoom(@Param("room") String room);
	
	@Query("SELECT * FROM Timetable WHERE t.day = :day")
	String findByDay(@Param("day") String day);
	
	@Query("SELECT * FROM Timetable WHERE t.group = :group AND t.day = :day")
	String findByGroupAndDay(@Param("group") String group, String day);
	
	@Query("SELECT * FROM Timetable WHERE t.group = :group AND t.room = :room")
	String findByGroupAndRoom(@Param("group") String group, String room);
	
	@Query("SELECT * FROM Timetable WHERE t.room= :group AND t.day = :day")
	String findByRoomAndDay(@Param("group") String room, String day);
	
	@Query("SELECT * FROM Timetable WHERE t.group = :group AND t.day= :day AND t.room = :room")
	String findByAll(@Param("group") String group, String day, String room);
	
}
