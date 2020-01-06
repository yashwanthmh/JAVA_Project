package com.javainuse.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.javainuse.dao.EmployeeDao;
import com.javainuse.model.work;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertWork(work w) {
		String sql = "INSERT INTO workshops " +
				"(workid, topic, venue, wsdate, regfee, organiser, location ) VALUES (?, ?, ?, ?, ?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				w.getWorkid(), w.getTopic(), w.getVenue(), w.getDate(), w.getReg_fee(), w.getOrganiser(), w.getLocation()
		});
	}
	
	@Override
	public void insertWorks(final List<work> works) {
		String sql = "INSERT INTO workshops " + "(workid, topic, venue, wsdate, regfee, organiser, location )"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				work w = works.get(i);
				ps.setString(1, w.getWorkid());
				ps.setString(2, w.getTopic());
				ps.setString(3, w.getVenue());
				ps.setDate(4, w.getDate());
				ps.setInt(5, w.getReg_fee());
				ps.setString(6, w.getOrganiser());
				ps.setString(7, w.getLocation());
			}
			
			public int getBatchSize() {
				return works.size();
			}
		});

	}
	@Override
	public List<work> getAllWorks(){
		String sql = "SELECT * FROM workshops";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public work getWorkById(String empId) {
		String sql = "SELECT * FROM workshops WHERE workid = ?";
		return (work)getJdbcTemplate().queryForObject(sql, new Object[]{empId}, new RowMapper<work>(){
			@Override
			public work mapRow(ResultSet rs, int rwNumber) throws SQLException {
				work w = new work();
				w.setWorkid(rs.getString("workid"));
				w.setTopic(rs.getString("topic"));
				w.setVenue(rs.getString("venue"));
				w.setDate(rs.getDate("wsdate"));
				w.setReg_fee(rs.getInt("regfee"));
				w.setOrganiser(rs.getString("organiser"));
				w.setLocation(rs.getString("location"));
				return w;
			}
		});
	}

	@Override
	public List<work> getWorkByTopic(String topic) {
		String sql = "SELECT * FROM workshops where topic like '%"+topic+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByDate(int date) {
		String sql = "SELECT * FROM workshops where wsdate like '%"+date+"'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByCity(String city) {
		String sql = "SELECT * FROM workshops where location like '%"+city+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByCollege(String college) {
		String sql = "SELECT * FROM workshops where venue like '%"+college+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	
	}

	@Override
	public List<work> getWorkByOrganiser(String organiser) {
		String sql = "SELECT * FROM workshops where organiser like '%"+organiser+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByYear(int year) {
		String sql = "SELECT * FROM workshops where wsdate like '%"+year+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByMonth(String month) {
		String sql = "SELECT * FROM workshops where wsdate like '%-"+month+"-%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public void updateField(String workid, String field, String fieldType) {
		
		String qry="";
		if(fieldType.equals("topic"))
			qry="UPDATE WORKSHOPS SET topic='"+field+"' where workid='"+workid+"'";
		else if(fieldType.equals("venue"))
			qry="UPDATE WORKSHOPS SET venue='"+field+"' where workid='"+workid+"'";
		else if(fieldType.equals("date"))
			qry="UPDATE WORKSHOPS SET wsdate='"+field+"' where workid='"+workid+"'";
		else if(fieldType.equals("regfee"))
			qry="UPDATE WORKSHOPS SET regfee="+field+" where workid='"+workid+"'";
		else if(fieldType.equals("organiser"))
			qry="UPDATE WORKSHOPS SET organiser='"+field+"' where workid='"+workid+"'";
		else if(fieldType.equals("location"))
			qry="UPDATE WORKSHOPS SET location='"+field+"' where workid='"+workid+"'";
		
		getJdbcTemplate().update(qry);
			
	}

	@Override
	public void updateAll(String workid, String topic, String venue, String wsdate, String regfee,String organiser,String location) {
		String sql = "UPDATE workshops set topic=?, venue=?, wsdate=?, regfee=?, organiser=?, location=? where workid='"+workid+"'";
		getJdbcTemplate().update(sql, new Object[]{
				topic,venue,wsdate,regfee,organiser,location
		});
		
	}

	//copy paste this in folder
	@Override
	public void Delete(String field, String fieldType) {
		String qry="";
		if(fieldType.equals("topic"))
			qry="DELETE FROM WORKSHOPS WHERE topic like '%"+field+"%'";
		else if(fieldType.equals("venue"))
			qry="DELETE FROM WORKSHOPS WHERE venue like '%"+field+"%'";
		else if(fieldType.equals("date"))
			qry="DELETE FROM WORKSHOPS WHERE  wsdate like '%"+field+"%'";
		else if(fieldType.equals("regfee"))
			qry="DELETE FROM WORKSHOPS WHERE regfee ="+field;
		else if(fieldType.equals("organiser"))
			qry="DELETE FROM WORKSHOPS WHERE organiser like '%"+field+"%'";
		else if(fieldType.equals("location"))
			qry="DELETE FROM WORKSHOPS WHERE location like '%"+field+"%'";
		else if(fieldType.equals("workid"))
			qry="DELETE FROM WORKSHOPS WHERE workid='"+field+"'";
		
		getJdbcTemplate().update(qry);
		
	}
	
	
	
	
}