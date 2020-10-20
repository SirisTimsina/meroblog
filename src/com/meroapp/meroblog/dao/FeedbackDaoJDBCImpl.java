package com.meroapp.meroblog.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meroapp.meroblog.model.Feedback;

@Repository
public class FeedbackDaoJDBCImpl implements FeedbackDao {

	@Autowired
	DataSource dataSource;
	
	@Override
	public void insertFeedback(Feedback fb){
		
		String sql = "insert into feedback_tbl "
					+ "(username, subject, message, senddate) "
					+ "values(?,?,?,?)";
		try {
		
		PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
		
		ps.setString(1, fb.getUsername());
		ps.setString(2, fb.getSubject());
		ps.setString(3, fb.getMessage());
		ps.setDate(4, Date.valueOf(fb.getSendDate()));
		
		if(ps.executeUpdate()==1) {
			System.out.println("Record inserted!");
//			dataSource.getConnection().commit();
		}
		
		}catch(Exception e) {
			System.out.println(e);
//			dataSource.getConnection().rollback();
		}
		
		}

	@Override
	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

}
