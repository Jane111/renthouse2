package com.renthouse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.renthouse.DataBase.Database;
import com.renthouse.entity.Question;

public class questionDAO {
	
    Database db = new Database();
    
    public int add(Question question) {       //添加评论
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String questionTime = df.format(new Date());
    	
		int re = -1;
		String sql  = "insert into question (question_content,question_time) values('"+ question.getQuestionContent() +"','"+ questionTime +"')";
		re = db.execute(sql);                  //待写House表具体字段
		return re;
	}
    
	public int delete(int questionId) {     //删除评论
		
		int re = -1;
		String sql = "delete from question where questionId = "+questionId;
		re = db.execute(sql);
		return re;
	}
	
	public int delete(String questionId) {    //删除评论
		
		int re = -1;
		String sql = "delete from question where questionId = "+questionId;
		re = db.execute(sql);
		return re;
	}
	
	public List<Question> getAll(){            //获取要展示的所有问题
		
		List<Question> list = new ArrayList<Question>();
		String sql = "select * from question";
		ResultSet rs = db.query(sql);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		try {
			while(rs.next()) {
				Question q= new Question();
				q.setQuestionId(rs.getInt("question_id"));
				q.setQuestionContent(rs.getString("question_content"));
				q.setQuestionTime(df.format(rs.getTimestamp("question_time")));
				list.add(q);			
			}
		} catch (SQLException e) {
			
			System.out.println(sql + e.toString()); 
		}
		return list;
	}
	
	public List<Question> getQandR(){            //获取要展示的所有问题
		
		List<Question> list = new ArrayList<Question>();
		String sql = "select * from question inner join reply on question.question_id=reply.fk_reply_question";
		ResultSet rs = db.query(sql);
		try {
			while(rs.next()) {
				Question q= new Question();
				q.setQuestionId(rs.getInt("question_id"));
				q.setQuestionContent(rs.getString("question_content"));
				//q.setQuestionTime(rs.getDate("question_time"));
				list.add(q);
			}
		} catch (SQLException e) {
			
			System.out.println(sql + e.toString()); 
		}
		return list;
	}
	
	public List<Question> getById(int questionId){
		
		List<Question> list = new ArrayList<Question>();
		String sql = "select * from question where question_id = "+ questionId;
		ResultSet rs = db.query(sql);
		try {
			while(rs.next()) {
				Question q= new Question();
				q.setQuestionId(rs.getInt("question_id"));
				q.setQuestionContent(rs.getString("question_content"));
				//q.setQuestionTime(rs.getDate("question_time"));
				list.add(q);			
			}
		} catch (SQLException e) {
			
			System.out.println(sql + e.toString()); 
		}
		return list;
	}

}
