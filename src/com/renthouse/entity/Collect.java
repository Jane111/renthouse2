package com.renthouse.entity;

import java.sql.Date;

public class Collect {        //信息收集实体类
	
	private Integer collectId;
	private Integer userId;
	private Integer houseId;
	private Date collectTime;

	public Integer getCollectId() {
		return collectId;
	}
	
	public void setCollectId(Integer collectId) {
		this.collectId = collectId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getHouseId() {
		return houseId;
	}
	
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	
	public Date getCollectTime() {
		return collectTime;
	}
	
	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}
	
	public Collect() {   //无参数构造方法
		
		
	}
//	public Collect(Integer userId,Integer houseId,Date collectTime) {
//		   //有参构造方法，无主键
//		this.userId = userId;
//		this.houseId = houseId;
//		this.collectTime = collectTime;
//	}
//	public Collect(Integer collectId,Integer userId,Integer houseId,Date collectTime) {
//		   //有参构造方法，有主键
//		this.collectId = collectId;
//		this.userId = userId;
//		this.houseId = houseId;
//		this.collectTime = collectTime;
//	}

}
