package com.javainuse.service;

import java.sql.Date;
import java.util.List;

import com.javainuse.model.work;

public interface workService {
	void insertWork(work emp);
	void insertWorks(List<work> works);
	List<work> getAllWorks();
	work getWorkById(String empid);
	List<work> getWorkByTopic(String topic);
	List<work> getWorkByDate(int date);
	List<work> getWorkByYear(int year);
	List<work> getWorkByMonth(String month);
	List<work> getWorkByCity(String city);
	List<work> getWorkByCollege(String college);
	List<work> getWorkByOrganiser(String organiser);
	void updateField(String workid, String field, String fieldType);
	void updateAll(String workid, String topic, String venue, String wsdate, String regfee,String organiser,String location);
	//copy paste
	void Delete(String field, String fieldType);
}