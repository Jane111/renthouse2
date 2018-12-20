package com.renthouse.dao;

import java.sql.Date;

public class HouseDetail {

	//房屋基本信息
	private Integer houseId;
//	private Integer houseBuilding;
//	private Integer houseUnit;
//	private Integer houseNum;
	private Integer houseRoomNum;
	private Integer houseHallNum;
//	private Integer houseBathroomNum;
	private Double houseArea;        
	private String houseDirection;
	private Double housePrice;
	private Integer houseFloor;
	private Integer houseTotalNum;
	private String houseDecoration;
	private String housePayType;
	private String houseComment;
	private String houseAdvert;
	private String houseRentType;
	private String houseRoomType;
	private Double houseRoomArea;
	private Date houseAddTime;	
	
	//用户信息
	private String userName;
	//小区信息
	private String comName;
	private String comArea;
	private String comStreet;
	
	
	
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
//	public Integer getHouseBuilding() {
//		return houseBuilding;
//	}
//	public void setHouseBuilding(Integer houseBuilding) {
//		this.houseBuilding = houseBuilding;
//	}
//	public Integer getHouseUnit() {
//		return houseUnit;
//	}
//	public void setHouseUnit(Integer houseUnit) {
//		this.houseUnit = houseUnit;
//	}
//	public Integer getHouseNum() {
//		return houseNum;
//	}
//	public void setHouseNum(Integer houseNum) {
//		this.houseNum = houseNum;
//	}
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
//	public Integer getHouseBathroomNum() {
//		return houseBathroomNum;
//	}
//	public void setHouseBathroomNum(Integer houseBathroomNum) {
//		this.houseBathroomNum = houseBathroomNum;
//	}
	public Double getHouseArea() {
		return houseArea;
	}
	public void setHouseArea(Double houseArea) {
		this.houseArea = houseArea;
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
	public String getHouseComment() {
		return houseComment;
	}
	public void setHouseComment(String houseComment) {
		this.houseComment = houseComment;
	}
	public String getHouseRentType() {
		return houseRentType;
	}
	public void setHouseRentType(String houseRentType) {
		this.houseRentType = houseRentType;
	}
	public String getHouseRoomType() {
		return houseRoomType;
	}
	public void setHouseRoomType(String houseRoomType) {
		this.houseRoomType = houseRoomType;
	}
	public Double getHouseRoomArea() {
		return houseRoomArea;
	}
	public void setHouseRoomArea(Double houseRoomArea) {
		this.houseRoomArea = houseRoomArea;
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
