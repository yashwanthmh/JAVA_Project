package com.javainuse.dao;

import java.util.List;
import java.sql.Date;

import com.javainuse.model.work;

public interface EmployeeDao {
	void insertWork(work cus);
	void insertWorks(List<work> works);
	List<work> getAllWorks();
	work getWorkById(String workId);
	List<work> getWorkByTopic(String topic);
	List<work> getWorkByDate(int date);
	List<work> getWorkByYear(int year);
	List<work> getWorkByMonth(String month);
	List<work> getWorkByCity(String city);
	List<work> getWorkByCollege(String college);
	List<work> getWorkByOrganiser(String organiser);
	void updateField(String workid, String field, String fieldType);
	void updateAll(String workid, String topic, String venue, String wsdate, String regfee,String organiser,String location);
	//copy paste these delete operationns into your original file
	void Delete(String field, String fieldType);
}