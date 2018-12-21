package com.renthouse.dao;

import java.sql.Date;

public class ShowHouse {

	//房屋基本信息
	private Integer houseId;
	private Date houseAddTime;
	private String houseDecoration;
//	private Integer houseBuilding;
//	private Integer houseUnit;
//	private Integer houseNum;
	private Integer houseRoomNum;
	private Integer houseHallNum;
//	private Integer houseBathroomNum;
	     
	private Integer houseFloor;
	private Integer houseTotalNum;


//	private String houseComment;
	private String houseAdvert;

//	private String houseRoomType;

	//展示的面积
	private Double Area;
//	private Double houseArea;
//	private Double houseRoomArea;
	
	//用户信息
	private String userName;
	//小区信息
	private String comName;
	private String comArea;
	private String comStreet;
	
	private String houseDirection;
	private String houseRentType;
	private String housePayType;
	
	private Double housePrice;
	
	private String photoUrl;//展示的那一张照片
	
	
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public Double getArea() {
		return Area;
	}
	public void setArea(Double area) {
		Area = area;
	}
	public String getHouseAdvert() {
		return houseAdvert;
	}
	public void setHouseAdvert(String houseAdvert) {
		this.houseAdvert = houseAdvert;
	}
	public Integer getHouseId() {
		return houseId;
	}
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public Integer getHouseRoomNum() {
		return houseRoomNum;
	}
	public void setHouseRoomNum(Integer houseRoomNum) {
		this.houseRoomNum = houseRoomNum;
	}
	public Integer getHouseHallNum() {
		return houseHallNum;
	}
	public void setHouseHallNum(Integer houseHallNum) {
		this.houseHallNum = houseHallNum;
	}

	public String getHouseDirection() {
		return houseDirection;
	}
	public void setHouseDirection(String houseDirection) {
		this.houseDirection = houseDirection;
	}
	public Double getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(Double housePrice) {
		this.housePrice = housePrice;
	}
	public Integer getHouseFloor() {
		return houseFloor;
	}
	public void setHouseFloor(Integer houseFloor) {
		this.houseFloor = houseFloor;
	}
	public Integer getHouseTotalNum() {
		return houseTotalNum;
	}
	public void setHouseTotalNum(Integer houseTotalNum) {
		this.houseTotalNum = houseTotalNum;
	}
	public String getHouseDecoration() {
		return houseDecoration;
	}
	public void setHouseDecoration(String houseDecoration) {
		this.houseDecoration = houseDecoration;
	}
	public String getHousePayType() {
		return housePayType;
	}
	public void setHousePayType(String housePayType) {
		this.housePayType = housePayType;
	}
	public String getHouseRentType() {
		return houseRentType;
	}
	public void setHouseRentType(String houseRentType) {
		this.houseRentType = houseRentType;
	}

	public Date getHouseAddTime() {
		return houseAddTime;
	}
	public void setHouseAddTime(Date houseAddTime) {
		this.houseAddTime = houseAddTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	
}
