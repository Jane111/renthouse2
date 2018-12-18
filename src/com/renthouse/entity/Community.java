package com.renthouse.entity;

import java.util.HashSet;
import java.util.Set;

public class Community {        //社区实体类
	
	private Integer comId;
	private String comName;
	private String comArea;
	private String comStreet;
//	private Set<House> setHouse=new HashSet<House>();//一小区可以有多个房屋
	
	
	
//	public Set<House> getSetHouse() {
//		return setHouse;
//	}
//
//	public void setSetHouse(Set<House> setHouse) {
//		this.setHouse = setHouse;
//	}

	public Integer getComId() {
		return comId;
	}
	
	public void setComId(Integer comId) {
		this.comId = comId;
	}
	
	public String getComName() {
		return comName;
	}
	
	public void setComName(String comName) {
		this.comName = comName;
	}
	
	public String getComArea() {
		return comArea;
	}
	
	public void setComArea(String comArea) {
		this.comArea = comArea;
	}
	
	public String getComStreet() {
		return comStreet;
	}
	
	public void setComStreet(String comStreet) {
		this.comStreet = comStreet;
	}
	
	public Community() {   //社区无参构造方法
		
		
	}
	
	public Community(String comName,String comArea,String comStreet) {   //社区含参构造方法
		
		this.comName = comName;
		this.comArea = comArea;
		this.comStreet = comStreet;
	}
	
	public Community(Integer comId,String comName,String comArea,String comStreet) {
		  //社区含参构造方法，含社区编号
		this.comId = comId;
		this.comName = comName;
		this.comArea = comArea;
		this.comStreet = comStreet;
	}

}
