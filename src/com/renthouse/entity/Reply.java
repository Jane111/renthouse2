package com.renthouse.entity;

import java.sql.Date;

public class Reply {        //回复实体类
	
	private Integer replyId;
	private Integer questionId;
	private Integer userId;
	private String replyContent;
	private String replyTime;
	
// 	private User aUser;
// 	private Question aQuestion;
	
	
	
// 	public User getaUser() {
// 		return aUser;
// 	}

// 	public void setaUser(User aUser) {
// 		this.aUser = aUser;
// 	}

// 	public Question getaQuestion() {
// 		return aQuestion;
// 	}

// 	public void setaQuestion(Question aQuestion) {
// 		this.aQuestion = aQuestion;
// 	}

	public Integer getReplyId() {
		return replyId;
	}
	
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	
	public Integer getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getReplyContent() {
		return replyContent;
	}
	
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	
	public String getReplyTime() {
		return replyTime;
	}
	
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}
	
	public Reply() {   //回复无参构造方法
		
		
	}
	
	public Reply(Integer questionId,Integer userId,String replyContent,String replyTime) {   //用户含参构造方法
		
		this.questionId = questionId;
		this.userId = userId;
		this.replyContent = replyContent;
		this.replyTime = replyTime;
	}
	
	public Reply(Integer replyId,Integer questionId,Integer userId,String replyContent,String replyTime) {
		   //用户含参构造方法，含回复编号、问题编号、用户编号
		this.replyId = replyId;
		this.questionId = questionId;
		this.userId = userId;
		this.replyContent = replyContent;
		this.replyTime = replyTime;
	}

}

