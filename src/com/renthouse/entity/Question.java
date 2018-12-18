package com.renthouse.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Question {        //问题实体类
	
	private Integer questionId;
	private Integer houseId;
	private Integer userId;
	private String questionContent;
	private Date questionTime;
	
//	private Set<Reply> setReply=new HashSet<Reply>();//一个问题可以有多个回复
	
// 	private User aUser;
// 	private House aHouse;
	
	
	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

// 	public User getaUser() {
// 		return aUser;
// 	}

// 	public void setaUser(User aUser) {
// 		this.aUser = aUser;
// 	}

// 	public House getaHouse() {
// 		return aHouse;
// 	}

// 	public void setaHouse(House aHouse) {
// 		this.aHouse = aHouse;
// 	}

// 	public Set<Reply> getSetReply() {
// 		return setReply;
// 	}

// 	public void setSetReply(Set<Reply> setReply) {
// 		this.setReply = setReply;
// 	}

	public Integer getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	public Integer getHouseId() {
		return houseId;
	}
	
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getQuestionContext() {
		return questionContent;
	}
	
	public void setQuestionContext(String questionContent) {
		this.questionContent = questionContent;
	}
	
	public Date getQuestionTime() {
		return questionTime;
	}
	
	public void setQuestionTime(Date questionTime) {
		this.questionTime = questionTime;
	}
	
	public Question() {   //问题无参构造方法
		
		
	}
	
	public Question(Integer houseId,Integer userId,String questionContent,Date questionTime) {   //问题含参构造方法
		
		this.houseId = houseId;
		this.userId = userId;
		this.questionContent = questionContent;
		this.questionTime = questionTime;		
	}
	
	public Question(Integer questionId,Integer houseId,Integer userId,String questionContent,Date questionTime) {
		   //问题含参构造方法，含问题编号、房屋编号、用户编号
		this.questionId = questionId;
		this.houseId = houseId;
		this.userId = userId;
		this.questionContent = questionContent;
		this.questionTime = questionTime;		
	}

}

