package com.renthouse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.renthouse.DataBase.Database;
import com.renthouse.entity.Reply;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ReplyDAO {
	
	   Database db = new Database();

	   public int add(Reply reply) {       //添加评论
		   
		   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   String replyTime = df.format(new Date());
			
			int re = -1;
			String sql  = "insert into reply (reply_content,reply_time,fk_reply_question) values('"+ reply.getReplyContent() +"','"+ replyTime +"','"+reply.getQuestionId()+"')";
			re = db.execute(sql);                  //待写House表具体字段
			return re;
		}
	    
		public int delete(int replyId) {     //删除评论
			
			int re = -1;
			String sql = "delete from reply where replyId = "+replyId;
			re = db.execute(sql);
			return re;
		}
		
		public int delete(String replyId) {     //删除评论1
			
			int re = -1;
			String sql = "delete from reply where questionId = "+replyId;
			re = db.execute(sql);
			return re;
		}
		
		public List<Reply> getAll(){
			
			List<Reply> list = new ArrayList<Reply>();
			String sql = "select * from reply";
			ResultSet rs = db.query(sql);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			try {
				while(rs.next()) {
					Reply r= new Reply();
					r.setReplyId(rs.getInt("reply_id"));
					r.setReplyContent(rs.getString("reply_content"));
					r.setReplyTime(df.format(rs.getTimestamp("reply_time")));
					list.add(r);			
				}
			} catch (SQLException e) {
				
				System.out.println(sql + e.toString()); 
			}
			return list;
		}
		
		public List<Reply> getByQId(int questionId){
			
			List<Reply> list = new ArrayList<Reply>();
			String sql = "select * from reply where fk_reply_question = "+questionId;
			ResultSet rs = db.query(sql);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			try {
				while(rs.next()) {
					Reply r= new Reply();
					r.setReplyId(rs.getInt("reply_id"));
					r.setReplyContent(rs.getString("reply_content"));
					r.setReplyTime(df.format(rs.getTimestamp("reply_time")));
					list.add(r);			
				}
			} catch (SQLException e) {
				
				System.out.println(sql + e.toString()); 
			}
			return list;
		}

}
