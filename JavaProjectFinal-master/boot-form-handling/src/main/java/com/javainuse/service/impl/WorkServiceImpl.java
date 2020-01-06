package com.javainuse.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.dao.EmployeeDao;
import com.javainuse.model.work;
import com.javainuse.service.workService;

@Service
public class WorkServiceImpl implements workService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void insertWork(work w) {
		employeeDao.insertWork(w);
	}

	@Override
	public void insertWorks(List<work> works) {
		employeeDao.insertWorks(works);
	}

	public List<work> getAllWorks() {
		return employeeDao.getAllWorks();
	}

	@Override
	public work getWorkById(String wid) {
		work w = employeeDao.getWorkById(wid);
		return w;
	}

	@Override
	public List<work> getWorkByTopic(String topic) {
		return employeeDao.getWorkByTopic(topic);
	}

	@Override
	public List<work> getWorkByDate(int date) {
		return employeeDao.getWorkByDate(date);
	}

	@Override
	public List<work> getWorkByYear(int year) {
		return employeeDao.getWorkByYear(year);
	}

	@Override
	public List<work> getWorkByMonth(String month) {
		return employeeDao.getWorkByMonth(month);
	}

	@Override
	public List<work> getWorkByCity(String city) {
		return employeeDao.getWorkByCity(city);
	}

	@Override
	public List<work> getWorkByCollege(String college) {
		return employeeDao.getWorkByCollege(college);
	}

	@Override
	public List<work> getWorkByOrganiser(String organiser) {
		return employeeDao.getWorkByOrganiser(organiser);
	}

	@Override
	public void updateField(String workid, String field, String fieldType) {
		employeeDao.updateField(workid, field, fieldType);
		
	}

	@Override
	public void updateAll(String workid, String topic, String venue, String wsdate, String regfee, String organiser,
			String location) {
		employeeDao.updateAll(workid, topic, venue, wsdate, regfee, organiser, location);
		
	}

	//copy paste
	@Override
	public void Delete(String field, String fieldType) {
		employeeDao.Delete(field, fieldType);
		
	}
	
}