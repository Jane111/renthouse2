package com.renthouse.entity;

import java.util.HashSet;
import java.util.Set;

public class User {        //用户实体类
	
	private Integer userId;
	private String userPwd;
	private String userPhone;
	private String userName;
//	private Set<House> setHouse=new HashSet<House>();//一个人可以有多个房屋
//	private Set<Collect> setCollect=new HashSet<Collect>();//一个人可以有多个收集
//	private Set<Question> setQuestion=new HashSet<Question>();//一个人可以提出多个问题
//	private Set<Reply> setReply=new HashSet<Reply>();//一个人可以有多个回复
	
	
//	public Set<House> getSetHouse() {
//		return setHouse;
//	}
//
//	public void setSetHouse(Set<House> setHouse) {
//		this.setHouse = setHouse;
//	}
//
//	public Set<Collect> getSetCollect() {
//		return setCollect;
//	}
//
//	public void setSetCollect(Set<Collect> setCollect) {
//		this.setCollect = setCollect;
//	}
//
//	public Set<Question> getSetQuestion() {
//		return setQuestion;
//	}
//
//	public void setSetQuestion(Set<Question> setQuestion) {
//		this.setQuestion = setQuestion;
//	}
//
//	public Set<Reply> getSetReply() {
//		return setReply;
//	}
//
//	public void setSetReply(Set<Reply> setReply) {
//		this.setReply = setReply;
//	}

	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public User() {   //用户无参构造方法
		
		
	}
	
	public User(String userPwd,String userPhone,String userName) {   //用户含参构造方法
		
		this.userPwd = userPwd;
		this.userPhone = userPhone;
		this.userName = userName;
	}
	
	public User(Integer userId,String userPwd,String userPhone,String userName) {   //用户含参构造方法，含用户编号
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userPhone = userPhone;
		this.userName = userName;
	}
}

